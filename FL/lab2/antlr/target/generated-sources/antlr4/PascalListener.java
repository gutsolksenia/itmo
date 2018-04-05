// Generated from Pascal.g4 by ANTLR 4.3
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PascalParser}.
 */
public interface PascalListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PascalParser#variables}.
	 * @param ctx the parse tree
	 */
	void enterVariables(@NotNull PascalParser.VariablesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#variables}.
	 * @param ctx the parse tree
	 */
	void exitVariables(@NotNull PascalParser.VariablesContext ctx);

	/**
	 * Enter a parse tree produced by {@link PascalParser#read}.
	 * @param ctx the parse tree
	 */
	void enterRead(@NotNull PascalParser.ReadContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#read}.
	 * @param ctx the parse tree
	 */
	void exitRead(@NotNull PascalParser.ReadContext ctx);

	/**
	 * Enter a parse tree produced by {@link PascalParser#readArgumentList}.
	 * @param ctx the parse tree
	 */
	void enterReadArgumentList(@NotNull PascalParser.ReadArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#readArgumentList}.
	 * @param ctx the parse tree
	 */
	void exitReadArgumentList(@NotNull PascalParser.ReadArgumentListContext ctx);

	/**
	 * Enter a parse tree produced by {@link PascalParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(@NotNull PascalParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(@NotNull PascalParser.AssignmentContext ctx);

	/**
	 * Enter a parse tree produced by {@link PascalParser#ifCase}.
	 * @param ctx the parse tree
	 */
	void enterIfCase(@NotNull PascalParser.IfCaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#ifCase}.
	 * @param ctx the parse tree
	 */
	void exitIfCase(@NotNull PascalParser.IfCaseContext ctx);

	/**
	 * Enter a parse tree produced by {@link PascalParser#main}.
	 * @param ctx the parse tree
	 */
	void enterMain(@NotNull PascalParser.MainContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#main}.
	 * @param ctx the parse tree
	 */
	void exitMain(@NotNull PascalParser.MainContext ctx);

	/**
	 * Enter a parse tree produced by {@link PascalParser#writeArgumentList}.
	 * @param ctx the parse tree
	 */
	void enterWriteArgumentList(@NotNull PascalParser.WriteArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#writeArgumentList}.
	 * @param ctx the parse tree
	 */
	void exitWriteArgumentList(@NotNull PascalParser.WriteArgumentListContext ctx);

	/**
	 * Enter a parse tree produced by {@link PascalParser#writeArgument}.
	 * @param ctx the parse tree
	 */
	void enterWriteArgument(@NotNull PascalParser.WriteArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#writeArgument}.
	 * @param ctx the parse tree
	 */
	void exitWriteArgument(@NotNull PascalParser.WriteArgumentContext ctx);

	/**
	 * Enter a parse tree produced by {@link PascalParser#elseCase}.
	 * @param ctx the parse tree
	 */
	void enterElseCase(@NotNull PascalParser.ElseCaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#elseCase}.
	 * @param ctx the parse tree
	 */
	void exitElseCase(@NotNull PascalParser.ElseCaseContext ctx);

	/**
	 * Enter a parse tree produced by {@link PascalParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(@NotNull PascalParser.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(@NotNull PascalParser.VariableDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link PascalParser#ifOp}.
	 * @param ctx the parse tree
	 */
	void enterIfOp(@NotNull PascalParser.IfOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#ifOp}.
	 * @param ctx the parse tree
	 */
	void exitIfOp(@NotNull PascalParser.IfOpContext ctx);

	/**
	 * Enter a parse tree produced by {@link PascalParser#whileCase}.
	 * @param ctx the parse tree
	 */
	void enterWhileCase(@NotNull PascalParser.WhileCaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#whileCase}.
	 * @param ctx the parse tree
	 */
	void exitWhileCase(@NotNull PascalParser.WhileCaseContext ctx);

	/**
	 * Enter a parse tree produced by {@link PascalParser#variablesList}.
	 * @param ctx the parse tree
	 */
	void enterVariablesList(@NotNull PascalParser.VariablesListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#variablesList}.
	 * @param ctx the parse tree
	 */
	void exitVariablesList(@NotNull PascalParser.VariablesListContext ctx);

	/**
	 * Enter a parse tree produced by {@link PascalParser#codeBlock}.
	 * @param ctx the parse tree
	 */
	void enterCodeBlock(@NotNull PascalParser.CodeBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#codeBlock}.
	 * @param ctx the parse tree
	 */
	void exitCodeBlock(@NotNull PascalParser.CodeBlockContext ctx);

	/**
	 * Enter a parse tree produced by {@link PascalParser#math}.
	 * @param ctx the parse tree
	 */
	void enterMath(@NotNull PascalParser.MathContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#math}.
	 * @param ctx the parse tree
	 */
	void exitMath(@NotNull PascalParser.MathContext ctx);

	/**
	 * Enter a parse tree produced by {@link PascalParser#logic}.
	 * @param ctx the parse tree
	 */
	void enterLogic(@NotNull PascalParser.LogicContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#logic}.
	 * @param ctx the parse tree
	 */
	void exitLogic(@NotNull PascalParser.LogicContext ctx);

	/**
	 * Enter a parse tree produced by {@link PascalParser#mathArgument}.
	 * @param ctx the parse tree
	 */
	void enterMathArgument(@NotNull PascalParser.MathArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#mathArgument}.
	 * @param ctx the parse tree
	 */
	void exitMathArgument(@NotNull PascalParser.MathArgumentContext ctx);

	/**
	 * Enter a parse tree produced by {@link PascalParser#programm}.
	 * @param ctx the parse tree
	 */
	void enterProgramm(@NotNull PascalParser.ProgrammContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#programm}.
	 * @param ctx the parse tree
	 */
	void exitProgramm(@NotNull PascalParser.ProgrammContext ctx);

	/**
	 * Enter a parse tree produced by {@link PascalParser#operation}.
	 * @param ctx the parse tree
	 */
	void enterOperation(@NotNull PascalParser.OperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#operation}.
	 * @param ctx the parse tree
	 */
	void exitOperation(@NotNull PascalParser.OperationContext ctx);

	/**
	 * Enter a parse tree produced by {@link PascalParser#write}.
	 * @param ctx the parse tree
	 */
	void enterWrite(@NotNull PascalParser.WriteContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#write}.
	 * @param ctx the parse tree
	 */
	void exitWrite(@NotNull PascalParser.WriteContext ctx);
}