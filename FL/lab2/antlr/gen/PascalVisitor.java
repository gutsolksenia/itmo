// Generated from /home/ksenia/workspace/itmo/antlr/src/main/antlr4/Pascal.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link PascalParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface PascalVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link PascalParser#programm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgramm(PascalParser.ProgrammContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#title}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTitle(PascalParser.TitleContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#variables}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariables(PascalParser.VariablesContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#main}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain(PascalParser.MainContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperation(PascalParser.OperationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#variableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaration(PascalParser.VariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(PascalParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#read}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRead(PascalParser.ReadContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#write}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWrite(PascalParser.WriteContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#arithmetics}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmetics(PascalParser.ArithmeticsContext ctx);
}