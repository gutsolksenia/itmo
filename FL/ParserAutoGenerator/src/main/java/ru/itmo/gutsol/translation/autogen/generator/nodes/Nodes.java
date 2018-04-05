package ru.itmo.gutsol.translation.autogen.generator.nodes;

/**
 * Created by ksenia on 06.06.2017.
 */
public class Nodes {
    public static NTNode nonTermNode(Node node) {
        if (node instanceof NTNode) {
            return (NTNode) node;
        }
        return null;
    }
}
