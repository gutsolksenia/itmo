package ru.itmo.ctddev.sorokin.parsing.pfunc

import java.io.BufferedWriter
import java.io.Closeable
import java.io.OutputStream

class MatchResult(val index: Int) {
    override fun toString() = "_local$index"
}

sealed class MatchParam

class OuterParam(val index: Int) : MatchParam() {
    override fun toString() = "_param$index"
}

class NestedParam(val parent: MatchResult, val index: Int) : MatchParam() {
    override fun toString() = "$parent._arg$index"
}

class MatchingCondition(val param: MatchParam, val constructor: DataConstructor, val result: MatchResult)

class MatchingAssignment(val param: MatchParam, val macro: PatternMacro)

class MatchingGenerator(patterns: List<Pattern>) {
    val conditions = ArrayList<MatchingCondition>()
    val assignments = ArrayList<MatchingAssignment>()
    var resultIndex = 0

    init {
        for ((index, pattern) in patterns.withIndex()) {
            gen(pattern, OuterParam(index))
        }
    }

    private fun gen(pattern: Pattern, param: MatchParam) {
        when (pattern) {
            is DataPattern -> {
                val result = MatchResult(resultIndex++)
                conditions.add(MatchingCondition(param, pattern.declaration, result))

                for ((index, innerPattern) in pattern.innerPatterns.withIndex()) {
                    gen(innerPattern, NestedParam(result, index))
                }
            }
            is PatternMacro -> {
                assignments.add(MatchingAssignment(param, pattern))
            }
        }
    }
}

class TextGen(private val writer: BufferedWriter) : Closeable {
    var indent = 0

    fun newLine(text: String = "") {
        writer.appendln()
        writer.append("    ".repeat(indent))
        writer.append(text)
    }

    fun append(text: String) {
        writer.append(text)
    }

    fun indent(body: () -> Unit) {
        indent++
        try {
            body()
        } finally {
            indent--
        }
    }

    override fun close() {
        writer.close()
    }
}

class Generator(val model: Model) {

    fun generate(stream: OutputStream) {
        TextGen(stream.bufferedWriter()).use { gen ->

            for (dataDeclaration in model.dataDeclarations) {
                gen.newLine("sealed class ${dataDeclaration.name}")
                gen.newLine()
                for (constructor in dataDeclaration.constructors) {
                    if (constructor.parameterTypes.isEmpty()) {
                        gen.newLine("object ${constructor.name} : ${dataDeclaration.name}()")
                    } else {
                        gen.newLine("class ${constructor.name}(")
                        gen.indent {
                            gen.indent {
                                for ((index, parameterType) in constructor.parameterTypes.withIndex()) {
                                    gen.newLine("val _arg$index: ${parameterType.serialize()}")
                                    if (index + 1 != constructor.parameterTypes.size)
                                        gen.append(",")
                                }
                            }
                        }
                        gen.newLine(") : ${dataDeclaration.name}()")
                    }
                    gen.newLine()
                }

                gen.newLine("fun ${dataDeclaration.name}.show(): String = when (this) {")
                gen.indent {
                    for (constructor in dataDeclaration.constructors) {
                        gen.newLine("is ${constructor.name} -> \"${constructor.name}")
                        for (index in 0 until constructor.parameterTypes.size) {
                            gen.append(" (\${_arg$index.value.show()})")
                        }
                        gen.append("\"")
                    }
                }
                gen.newLine("}")
                gen.newLine()
            }


            for (variableDeclaration in model.variableDeclarations) {
                gen.newLine("fun ${variableDeclaration.name}(${variableDeclaration.argTypes.withIndex().joinToString { (index, type) -> "_param$index: ${type.serialize()}" }}): ${variableDeclaration.resType} = lazy {")
                if (variableDeclaration.argTypes.isEmpty()) {
                    if (variableDeclaration.assignments.size != 1) {
                        throw IllegalArgumentException("Variable '${variableDeclaration.name}' should have strictly one assignment")
                    }
                    gen.append(" ")
                    generateExpression(gen, variableDeclaration.assignments[0].body, false)
                    gen.append(" }")
                } else {
                    gen.indent {
                        var triviallyMatched = false
                        for (assignment in variableDeclaration.assignments) {
                            if (triviallyMatched)
                                throw IllegalArgumentException("Pattern matching case after trivial matching case")

                            val matching = MatchingGenerator(assignment.patterns)
                            if (matching.conditions.size == 0) {
                                for (assign in matching.assignments) {
                                    gen.newLine("val ${assign.macro.name} = ${assign.param}")
                                }
                                gen.newLine("return@lazy ")
                                generateExpression(gen, assignment.body, false)

                                triviallyMatched = true
                            } else {
                                val startingIndent = gen.indent

                                for (condition in matching.conditions) {
                                    gen.newLine("(${condition.param}.value as? ${condition.constructor.name})?.let { ${condition.result} ->")
                                    gen.indent++
                                }

                                for (assign in matching.assignments) {
                                    gen.newLine("val ${assign.macro.name} = ${assign.param}")
                                }
                                gen.newLine("return@lazy ")
                                generateExpression(gen, assignment.body, false)

                                while (gen.indent != startingIndent) {
                                    gen.indent--
                                    gen.newLine("}")
                                }
                            }
                        }
                        if (!triviallyMatched)
                            gen.newLine("throw RuntimeException(\"Mismatched arguments on '${variableDeclaration.name}' call\")")
                    }
                    gen.newLine("}")
                }
                gen.newLine()
            }

            if (model.expressions.isNotEmpty()) {
                gen.newLine("fun main(args: Array<String>) {")
                gen.indent {
                    for (expression in model.expressions) {
                        gen.newLine("println(")
                        generateExpression(gen, expression, false)
                        gen.append(".show())")
                    }
                }
                gen.newLine("}")
                gen.newLine()
            }
        }
    }


    fun generateExpression(gen: TextGen, expression: Expression, lazy: Boolean) {
        when (expression) {
            is VariableCall -> {
                if (expression.declaration.argTypes.size != expression.arguments.size)
                    throw IllegalArgumentException("Partial invocation not implemented")

                gen.append(expression.declaration.name)
                generateArguments(gen, expression.arguments, true)

                if (!lazy)
                    gen.append(".value")
            }
            is ConstructorCall -> {
                if (expression.constructor.parameterTypes.size != expression.arguments.size)
                    throw IllegalArgumentException("Partial invocation not implemented")

                if (lazy)
                    gen.append("lazyOf(")

                gen.append(expression.constructor.name)
                generateArguments(gen, expression.arguments)

                if (lazy)
                    gen.append(")")
            }
            is ArgumentCall -> {
                if (expression.macro.type.carry().first.size != expression.arguments.size)
                    throw IllegalArgumentException("Partial invocation not implemented")

                gen.append(expression.macro.name)
                generateArguments(gen, expression.arguments)

                if (!lazy)
                    gen.append(".value")
            }
        }
    }

    fun generateArguments(gen: TextGen, arguments: List<Expression>, bracketsIfEmpty: Boolean = false) {
        if (bracketsIfEmpty || arguments.isNotEmpty())
            gen.append("(")
        for (arg in arguments) {
            if (arg !== arguments[0])
                gen.append(", ")
            generateExpression(gen, arg, true)
        }
        if (bracketsIfEmpty || arguments.isNotEmpty())
            gen.append(")")
    }

    fun Type.serialize(): String {
        val (argTypes, resType) = carry()
        if (argTypes.isEmpty()) {
            return "$resType"
        } else {
            return "(${argTypes.joinToString { it.serialize() }}) -> $resType"
        }
    }
}