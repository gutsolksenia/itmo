// Generated from ru/itmo/ctddev/sorokin/parsing/pfunc/grammar/PFunc.g4 by ANTLR 4.3
package ru.itmo.ctddev.sorokin.parsing.pfunc.grammar;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PFuncParser}.
 */
public interface PFuncListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PFuncParser#variableAssignment}.
	 * @param ctx the parse tree
	 */
	void enterVariableAssignment(@NotNull PFuncParser.VariableAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link PFuncParser#variableAssignment}.
	 * @param ctx the parse tree
	 */
	void exitVariableAssignment(@NotNull PFuncParser.VariableAssignmentContext ctx);

	/**
	 * Enter a parse tree produced by {@link PFuncParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(@NotNull PFuncParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PFuncParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(@NotNull PFuncParser.ExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link PFuncParser#pattern}.
	 * @param ctx the parse tree
	 */
	void enterPattern(@NotNull PFuncParser.PatternContext ctx);
	/**
	 * Exit a parse tree produced by {@link PFuncParser#pattern}.
	 * @param ctx the parse tree
	 */
	void exitPattern(@NotNull PFuncParser.PatternContext ctx);

	/**
	 * Enter a parse tree produced by {@link PFuncParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(@NotNull PFuncParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link PFuncParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(@NotNull PFuncParser.ProgramContext ctx);

	/**
	 * Enter a parse tree produced by {@link PFuncParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(@NotNull PFuncParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PFuncParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(@NotNull PFuncParser.TypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link PFuncParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(@NotNull PFuncParser.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PFuncParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(@NotNull PFuncParser.VariableDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link PFuncParser#atomExpression}.
	 * @param ctx the parse tree
	 */
	void enterAtomExpression(@NotNull PFuncParser.AtomExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PFuncParser#atomExpression}.
	 * @param ctx the parse tree
	 */
	void exitAtomExpression(@NotNull PFuncParser.AtomExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link PFuncParser#runExpression}.
	 * @param ctx the parse tree
	 */
	void enterRunExpression(@NotNull PFuncParser.RunExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PFuncParser#runExpression}.
	 * @param ctx the parse tree
	 */
	void exitRunExpression(@NotNull PFuncParser.RunExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link PFuncParser#dataConstructor}.
	 * @param ctx the parse tree
	 */
	void enterDataConstructor(@NotNull PFuncParser.DataConstructorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PFuncParser#dataConstructor}.
	 * @param ctx the parse tree
	 */
	void exitDataConstructor(@NotNull PFuncParser.DataConstructorContext ctx);

	/**
	 * Enter a parse tree produced by {@link PFuncParser#placeholder}.
	 * @param ctx the parse tree
	 */
	void enterPlaceholder(@NotNull PFuncParser.PlaceholderContext ctx);
	/**
	 * Exit a parse tree produced by {@link PFuncParser#placeholder}.
	 * @param ctx the parse tree
	 */
	void exitPlaceholder(@NotNull PFuncParser.PlaceholderContext ctx);

	/**
	 * Enter a parse tree produced by {@link PFuncParser#atomType}.
	 * @param ctx the parse tree
	 */
	void enterAtomType(@NotNull PFuncParser.AtomTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PFuncParser#atomType}.
	 * @param ctx the parse tree
	 */
	void exitAtomType(@NotNull PFuncParser.AtomTypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link PFuncParser#entity}.
	 * @param ctx the parse tree
	 */
	void enterEntity(@NotNull PFuncParser.EntityContext ctx);
	/**
	 * Exit a parse tree produced by {@link PFuncParser#entity}.
	 * @param ctx the parse tree
	 */
	void exitEntity(@NotNull PFuncParser.EntityContext ctx);

	/**
	 * Enter a parse tree produced by {@link PFuncParser#dataDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterDataDeclaration(@NotNull PFuncParser.DataDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PFuncParser#dataDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitDataDeclaration(@NotNull PFuncParser.DataDeclarationContext ctx);
}