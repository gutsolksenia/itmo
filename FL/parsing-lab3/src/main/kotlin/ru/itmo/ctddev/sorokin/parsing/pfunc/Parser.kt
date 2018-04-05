package ru.itmo.ctddev.sorokin.parsing.pfunc

import org.antlr.v4.runtime.ANTLRInputStream
import org.antlr.v4.runtime.CommonTokenStream
import ru.itmo.ctddev.sorokin.parsing.pfunc.grammar.PFuncBaseListener
import ru.itmo.ctddev.sorokin.parsing.pfunc.grammar.PFuncLexer
import ru.itmo.ctddev.sorokin.parsing.pfunc.grammar.PFuncParser
import java.io.InputStream

open class ParserException(reason: String) : IllegalArgumentException(reason)
class ResolveException(reason: String) : ParserException(reason)

class Parser : PFuncBaseListener() {
    val dataDeclarations = LinkedHashMap<String, DataDeclaration>()
    val constructors = HashMap<String, DataConstructor>()
    val variables = LinkedHashMap<String, VariableDeclaration>()
    val expressions = ArrayList<Expression>()


    fun parse(stream: InputStream): Model {

        val lexer = PFuncLexer(ANTLRInputStream(stream))
        val parser = PFuncParser(CommonTokenStream(lexer))
        parser.addParseListener(this)
        parser.program()
        parser.removeParseListener(this)

        return Model(dataDeclarations.map { it.value }, variables.map { it.value }, expressions)
    }

    // data declaration

    override fun exitDataDeclaration(ctx: PFuncParser.DataDeclarationContext) {
        val data = DataDeclaration(ctx.LITERAL().text)
        dataDeclarations[data.name] = data

        for (constructorCtx in ctx.dataConstructor()) {
            val constructor = DataConstructor(constructorCtx.LITERAL().text, data)
            constructors[constructor.name] = constructor

            for (typeCtx in constructorCtx.type()) {
                constructor.parameterTypes.add(resolveType(typeCtx))
            }
        }
    }

    // variable declaration

    override fun exitVariableDeclaration(ctx: PFuncParser.VariableDeclarationContext) {
        val variable = VariableDeclaration(ctx.LITERAL().text, resolveType(ctx.type()))
        variables[variable.name] = variable
    }

    override fun exitVariableAssignment(ctx: PFuncParser.VariableAssignmentContext) {
        val name = ctx.LITERAL().text
        val declaration = variables[name] ?: throw ResolveException("Unresolved variable '$name'")
        val macros = LinkedHashMap<String, PatternMacro>()

        val patternCtx = ctx.pattern()
        if (patternCtx.size != declaration.argTypes.size) {
            throw IllegalArgumentException("Wrong parameters count in variable '$name'")
        }
        val patterns = ArrayList(patternCtx.zip(declaration.argTypes).map { (ctx, type) -> resolvePattern(ctx, macros, type) })
        val expression = resolveExpression(ctx.expression(), macros)
        VariableAssignment(declaration, patterns, expression)
    }

    // patterns

    fun resolvePattern(ctx: PFuncParser.PatternContext, macros: MutableMap<String, PatternMacro>, type: Type): Pattern {
        val name = ctx.LITERAL().text
        if (ctx.LPAR() == null) {
            constructors[name]?.let { return DataPattern(it, emptyList()) }
            macros[name]?.let { throw ResolveException("Reused macro in pattern") }
            val macro = PatternMacro(name, type)
            macros[name] = macro
            return macro
        }

        val constructor = constructors[name] ?: throw ResolveException("Unresolved constructor '$name'")
        if (type !is DataType || constructor.declaration !== type.decl)
            throw IllegalArgumentException("Mismatched pattern type")

        val patternCtx = ctx.pattern()
        if (patternCtx.size != constructor.parameterTypes.size) {
            throw IllegalArgumentException("Mismatched pattern child count")
        }

        return DataPattern(constructor, patternCtx.zip(constructor.parameterTypes).map { (pattern, type) -> resolvePattern(pattern, macros, type) })
    }

    // expressions

    fun resolveExpression(ctx: PFuncParser.ExpressionContext, macros: Map<String, PatternMacro>): Expression {
        val atoms = ctx.atomExpression().map { resolveAtomExpression(it, macros) }
        atoms[0].arguments.addAll(atoms.subList(1, atoms.size))
        return atoms[0]
    }

    fun resolveAtomExpression(ctx: PFuncParser.AtomExpressionContext, macros: Map<String, PatternMacro>): Expression {
        if (ctx.LPAR() !== null) {
            return resolveExpression(ctx.expression(), macros)
        }
        val name = ctx.LITERAL().text

        macros[name]?.let { return ArgumentCall(it) }
        constructors[name]?.let { return ConstructorCall(it) }
        variables[name]?.let { return VariableCall(it) }

        throw ResolveException("Unresolved reference '$name'")
    }

    override fun exitRunExpression(ctx: PFuncParser.RunExpressionContext) {
        expressions.add(resolveExpression(ctx.expression(), emptyMap()))
    }

    // types

    fun resolveType(ctx: PFuncParser.TypeContext): Type {
        val head = resolveAtomType(ctx.atomType())
        val leaf = ctx.type() ?: return head

        return FuncType(head, resolveType(leaf))
    }

    fun resolveAtomType(ctx: PFuncParser.AtomTypeContext): Type {
        ctx.type()?.let {
            return resolveType(it)
        }

        val declName = ctx.LITERAL().text
        val dataDeclaration = dataDeclarations[declName] ?: throw ResolveException("Unresolved data type '$declName'")
        return DataType(dataDeclaration)
    }
}