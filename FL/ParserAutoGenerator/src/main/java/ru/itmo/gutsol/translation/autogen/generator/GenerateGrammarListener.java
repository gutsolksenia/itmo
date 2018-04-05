package ru.itmo.gutsol.translation.autogen.generator;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;
import ru.itmo.gutsol.translation.autogen.grammar.GrammarBaseListener;
import ru.itmo.gutsol.translation.autogen.grammar.GrammarParser;
import ru.itmo.gutsol.translation.autogen.generator.nodes.*;

import java.util.HashMap;
import java.util.Map;

import static java.util.stream.Collectors.toList;

/**
 * Printing all tokens.
 */
public class GenerateGrammarListener extends GrammarBaseListener {
    private static final String EPS = "EPS";
    public static final String EOF = "EOF";

    private Map<String, Integer> termPrior = new HashMap<>();
    private Map<String, NTNode> nonTerminals = new HashMap<>();
    private Map<String, TermNode> terminals = new HashMap<>();

    private int curPrior = 0;
    private String header;

    private NTNode start = null;

    @Override
    public void enterTerminalRule(@NotNull GrammarParser.TerminalRuleContext ctx) {
        String name = ctx.TERMINAL().getText();
        TermNode node = new TermNode(name);

        ctx.termProduction().forEach(tpc -> node.addChild(new Node(tpc.STRING().getText())));

        node.setSkip(ctx.SKP()!= null);
        termPrior.put(node.getName(), curPrior);
        curPrior++;
        terminals.put(node.getName(), node);
    }

    @Override
    public void enterNonTerminalRule(@NotNull GrammarParser.NonTerminalRuleContext ctx) {
        NTNode node = new NTNode(ctx.NON_TERMINAL().getText());

        if (start == null) {
            start = node;
        }

        if (ctx.inherited() != null) {
            ctx.inherited().declAttrs().arg().forEach(arg -> node.putDeclAttribute(arg.argName().getText(), arg.argType().getText()));
        }

        if (ctx.synthesized() != null) {
            TerminalNode typeNode = ctx.synthesized().MIXED_CASE() == null ?
                    ctx.synthesized().NON_TERMINAL() :
                    ctx.synthesized().MIXED_CASE();
            node.setReturnType(typeNode.getText());
        }

        ctx.nonTermProduction().forEach(ntp -> {
            Production production = new Production();
            node.addProduction(production);

            if (ntp.nonTermVar().isEmpty()) {
                termPrior.putIfAbsent(EPS, curPrior);
                curPrior++;
                terminals.putIfAbsent(EPS, new TermNode(EPS));
                production.addChild(terminals.get(EPS));
            }

            ntp.nonTermVar().forEach(ntv -> {
                Node nextLevel;

                if (ntv.NON_TERMINAL() != null) {
                    nextLevel = new NTNode(ntv.NON_TERMINAL().getText());

                    if (ntv.callAttrs() != null) {
                        Nodes.nonTermNode(nextLevel).setCallAttrs(ntv.callAttrs().CODE()
                                .stream().map(ParseTree::getText).collect(toList()));
                    }
                } else {
                    nextLevel = new TermNode(ntv.TERMINAL().getText());
                }

                production.addChild(nextLevel);
            });

            if (ntp.CODE() != null) {
                production.setCode(ntp.CODE().getText());
            }
        });

        nonTerminals.put(node.getName(), node);
    }

    @Override
    public void enterHeader(@NotNull GrammarParser.HeaderContext ctx) {

        header = cutBracketsAndSpaces(ctx.CODE().getText());
    }

    public void afterWalk() {
        termPrior.put(EOF, curPrior);
        curPrior++;
        terminals.put(EOF, new TermNode(EOF));
    }

    private String cutBracketsAndSpaces(String text) {
        return text.substring(1, text.length() - 1).replaceAll("\\n", "");
    }

    public Map<String, NTNode> getNonTerminals() {
        return nonTerminals;
    }

    public Map<String, TermNode> getTerminals() {
        return terminals;
    }

    public String getHeader() {
        return header;
    }

    public NTNode getStart() {
        return start;
    }

    public Map<String, Integer> getTermPrior() {
        return termPrior;
    }
}
