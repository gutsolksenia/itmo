// Generated from ru/itmo/gutsol/translation/autogen/grammar/Grammar.g4 by ANTLR 4.3
package ru.itmo.gutsol.translation.autogen.grammar;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GrammarParser}.
 */
public interface GrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GrammarParser#terminalRule}.
	 * @param ctx the parse tree
	 */
	void enterTerminalRule(@NotNull GrammarParser.TerminalRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#terminalRule}.
	 * @param ctx the parse tree
	 */
	void exitTerminalRule(@NotNull GrammarParser.TerminalRuleContext ctx);

	/**
	 * Enter a parse tree produced by {@link GrammarParser#nonTerminalRule}.
	 * @param ctx the parse tree
	 */
	void enterNonTerminalRule(@NotNull GrammarParser.NonTerminalRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#nonTerminalRule}.
	 * @param ctx the parse tree
	 */
	void exitNonTerminalRule(@NotNull GrammarParser.NonTerminalRuleContext ctx);

	/**
	 * Enter a parse tree produced by {@link GrammarParser#declAttrs}.
	 * @param ctx the parse tree
	 */
	void enterDeclAttrs(@NotNull GrammarParser.DeclAttrsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#declAttrs}.
	 * @param ctx the parse tree
	 */
	void exitDeclAttrs(@NotNull GrammarParser.DeclAttrsContext ctx);

	/**
	 * Enter a parse tree produced by {@link GrammarParser#argType}.
	 * @param ctx the parse tree
	 */
	void enterArgType(@NotNull GrammarParser.ArgTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#argType}.
	 * @param ctx the parse tree
	 */
	void exitArgType(@NotNull GrammarParser.ArgTypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link GrammarParser#synthesized}.
	 * @param ctx the parse tree
	 */
	void enterSynthesized(@NotNull GrammarParser.SynthesizedContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#synthesized}.
	 * @param ctx the parse tree
	 */
	void exitSynthesized(@NotNull GrammarParser.SynthesizedContext ctx);

	/**
	 * Enter a parse tree produced by {@link GrammarParser#nonTermProduction}.
	 * @param ctx the parse tree
	 */
	void enterNonTermProduction(@NotNull GrammarParser.NonTermProductionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#nonTermProduction}.
	 * @param ctx the parse tree
	 */
	void exitNonTermProduction(@NotNull GrammarParser.NonTermProductionContext ctx);

	/**
	 * Enter a parse tree produced by {@link GrammarParser#nonTermVar}.
	 * @param ctx the parse tree
	 */
	void enterNonTermVar(@NotNull GrammarParser.NonTermVarContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#nonTermVar}.
	 * @param ctx the parse tree
	 */
	void exitNonTermVar(@NotNull GrammarParser.NonTermVarContext ctx);

	/**
	 * Enter a parse tree produced by {@link GrammarParser#argName}.
	 * @param ctx the parse tree
	 */
	void enterArgName(@NotNull GrammarParser.ArgNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#argName}.
	 * @param ctx the parse tree
	 */
	void exitArgName(@NotNull GrammarParser.ArgNameContext ctx);

	/**
	 * Enter a parse tree produced by {@link GrammarParser#gramm}.
	 * @param ctx the parse tree
	 */
	void enterGramm(@NotNull GrammarParser.GrammContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#gramm}.
	 * @param ctx the parse tree
	 */
	void exitGramm(@NotNull GrammarParser.GrammContext ctx);

	/**
	 * Enter a parse tree produced by {@link GrammarParser#inherited}.
	 * @param ctx the parse tree
	 */
	void enterInherited(@NotNull GrammarParser.InheritedContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#inherited}.
	 * @param ctx the parse tree
	 */
	void exitInherited(@NotNull GrammarParser.InheritedContext ctx);

	/**
	 * Enter a parse tree produced by {@link GrammarParser#arg}.
	 * @param ctx the parse tree
	 */
	void enterArg(@NotNull GrammarParser.ArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#arg}.
	 * @param ctx the parse tree
	 */
	void exitArg(@NotNull GrammarParser.ArgContext ctx);

	/**
	 * Enter a parse tree produced by {@link GrammarParser#header}.
	 * @param ctx the parse tree
	 */
	void enterHeader(@NotNull GrammarParser.HeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#header}.
	 * @param ctx the parse tree
	 */
	void exitHeader(@NotNull GrammarParser.HeaderContext ctx);

	/**
	 * Enter a parse tree produced by {@link GrammarParser#callAttrs}.
	 * @param ctx the parse tree
	 */
	void enterCallAttrs(@NotNull GrammarParser.CallAttrsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#callAttrs}.
	 * @param ctx the parse tree
	 */
	void exitCallAttrs(@NotNull GrammarParser.CallAttrsContext ctx);

	/**
	 * Enter a parse tree produced by {@link GrammarParser#termProduction}.
	 * @param ctx the parse tree
	 */
	void enterTermProduction(@NotNull GrammarParser.TermProductionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#termProduction}.
	 * @param ctx the parse tree
	 */
	void exitTermProduction(@NotNull GrammarParser.TermProductionContext ctx);
}