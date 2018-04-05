// Generated from /home/ksenia/workspace/itmo/antlr/src/main/antlr4/Pascal.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PascalParser}.
 */
public interface PascalListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PascalParser#programm}.
	 * @param ctx the parse tree
	 */
	void enterProgramm(PascalParser.ProgrammContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#programm}.
	 * @param ctx the parse tree
	 */
	void exitProgramm(PascalParser.ProgrammContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#title}.
	 * @param ctx the parse tree
	 */
	void enterTitle(PascalParser.TitleContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#title}.
	 * @param ctx the parse tree
	 */
	void exitTitle(PascalParser.TitleContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#variables}.
	 * @param ctx the parse tree
	 */
	void enterVariables(PascalParser.VariablesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#variables}.
	 * @param ctx the parse tree
	 */
	void exitVariables(PascalParser.VariablesContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#main}.
	 * @param ctx the parse tree
	 */
	void enterMain(PascalParser.MainContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#main}.
	 * @param ctx the parse tree
	 */
	void exitMain(PascalParser.MainContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#operation}.
	 * @param ctx the parse tree
	 */
	void enterOperation(PascalParser.OperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#operation}.
	 * @param ctx the parse tree
	 */
	void exitOperation(PascalParser.OperationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(PascalParser.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(PascalParser.VariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(PascalParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(PascalParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#read}.
	 * @param ctx the parse tree
	 */
	void enterRead(PascalParser.ReadContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#read}.
	 * @param ctx the parse tree
	 */
	void exitRead(PascalParser.ReadContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#write}.
	 * @param ctx the parse tree
	 */
	void enterWrite(PascalParser.WriteContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#write}.
	 * @param ctx the parse tree
	 */
	void exitWrite(PascalParser.WriteContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#arithmetics}.
	 * @param ctx the parse tree
	 */
	void enterArithmetics(PascalParser.ArithmeticsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#arithmetics}.
	 * @param ctx the parse tree
	 */
	void exitArithmetics(PascalParser.ArithmeticsContext ctx);
}