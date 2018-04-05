package ru.itmo.ctddev.sorokin.parsing.pfunc

class Model(
        val dataDeclarations: List<DataDeclaration>,
        val variableDeclarations: List<VariableDeclaration>,
        val expressions: List<Expression>
)

// data

class DataDeclaration(val name: String) {
    val constructors = ArrayList<DataConstructor>()

}

class DataConstructor(val name: String, val declaration: DataDeclaration) {

    val parameterTypes = ArrayList<Type>()

    init {
        declaration.constructors.add(this)
    }

}

// variable

class VariableDeclaration(val name: String, type: Type) {
    val assignments = ArrayList<VariableAssignment>()
    val argTypes: List<Type>
    val resType: DataType

    init {
        val (argTypes, resType) = type.carry()
        this.argTypes = argTypes
        this.resType = resType
    }
}

class VariableAssignment(val declaration: VariableDeclaration, val patterns: MutableList<Pattern>, val body: Expression) {

    init {
        declaration.assignments.add(this)
    }
}

// pattern

sealed class Pattern

class DataPattern(val declaration: DataConstructor, val innerPatterns: List<Pattern>) : Pattern()

class PatternMacro(val name: String, val type: Type) : Pattern()

// expression

sealed class Expression {
    val arguments = ArrayList<Expression>()
}

class VariableCall(val declaration: VariableDeclaration) : Expression()

class ConstructorCall(val constructor: DataConstructor) : Expression()

class ArgumentCall(val macro: PatternMacro) : Expression()

// type

sealed class Type

class DataType(val decl: DataDeclaration) : Type() {
    override fun toString() = "Lazy<${decl.name}>"
}

class FuncType(val argType: Type, val resType: Type) : Type()

fun Type.carry(): Pair<List<Type>, DataType> {
    val argTypes = arrayListOf<Type>()
    var resCandidate = this
    while (resCandidate is FuncType) {
        argTypes.add(resCandidate.argType)
        resCandidate = resCandidate.resType
    }
    return argTypes to (resCandidate as DataType)
}