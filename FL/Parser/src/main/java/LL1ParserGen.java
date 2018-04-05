import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Collection;
import java.util.List;

/**
 * Created by ksenia on 06.06.17.
 */
public class LL1ParserGen {
    private static final String TAB = "    ";

    private final Collection<NotTerm> grammar;
    private final BufferedWriter writer;

    private String tab = "";

    public LL1ParserGen(String inputFile, String outputFile) throws IOException {
        grammar = new MyGrammarParser(inputFile).generate();
        writer = new BufferedWriter(new FileWriter(outputFile));
    }

    public void generate() throws IOException {
        buildFirst();
        buildFollow();
        for (NotTerm notTerm : grammar) {
            generateFunction(notTerm);
        }
        writer.flush();
    }

    private void generateFunction(NotTerm notTerm) throws IOException {
        writeln("public Tree get" + notTerm.getName() + "() {" );
        tab += TAB;
        newTree(notTerm.getName(), notTerm.getName());
        notTerm.getRules().forEach(rule -> generateCase(rule));
        tab = tab.substring(4);
        writeln("}");
    }

    private void generateCase(List<Token> rule) {
        Token firstToken = rule.get(0);
        StringBuilder sb = new StringBuilder();
        sb.append("if (");


    }

    private void buildFirst() {
        boolean changed = true;
        while (changed) {
            changed = false;
            for (NotTerm token : grammar) {
                int oldSize = token.getFirst().size();
                token.getRules().forEach(rule -> {
                    for (Token otherToken : rule) {
                        token.getFirst().addAll(otherToken.getFirst());
                        if (!otherToken.getFirst().contains("")) break;
                    }
                });
                changed |= oldSize < token.getFirst().size();
            }
        }
    }

    private void buildFollow() {
        boolean changed = true;
        while (changed) {
            changed = false;
            for (NotTerm token : grammar) {
                int oldSize = token.getFollow().size();
                token.getRules().forEach(rule -> token.getFirst().addAll(rule.get(0).getFirst()));
                changed = oldSize < token.getFollow().size();
                token.getRules().forEach(rule -> {
                    for (int i = rule.size() - 2; i >=0; i--) {
                        Token otherToken = rule.get(i);
                        if (otherToken.isTerminal()) {
                            continue;
                        }
                        Token suffix = rule.get(i+1);
                        otherToken.getFollow().addAll(suffix.getFirst());
                    }
                });
                changed |= oldSize < token.getFollow().size();
            }
            grammar.forEach(token -> token.getFollow().remove("\'\'"));
        }
    }

    private void newTree(String nodeName, String treeName) throws IOException {
        writeln("Tree " + treeName + " = new Tree(" + nodeName + ");");
    }

    private void rule(NotTerm notTerm, List<Token> rule) throws IOException {
        writeln("if (curToken) {");

    }

    private void writeln(String line) throws IOException {
        writer.write(tab + line + "\n");
    }
}
