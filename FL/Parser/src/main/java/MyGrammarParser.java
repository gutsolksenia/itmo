import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.*;
import java.util.*;

/**
 * Created by ksenia on 06.06.17.
 */
public class MyGrammarParser {
    private final GrammarParser.GrammrContext grammr;
    private Map<String, NotTerm> notTerms = new HashMap<>();

    public MyGrammarParser(String inputFile) throws IOException {
        String gramr = readFile(inputFile);
        GrammarLexer lexer = new GrammarLexer(new ANTLRInputStream(gramr));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        grammr = new GrammarParser(tokens).grammr();
    }

    public Collection<NotTerm> generate() throws IOException {
        generateNotTerminals();
        return notTerms.values();
    }

    private static String readFile(String file) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(file));
        String line = null;
        StringBuilder stringBuilder = new StringBuilder();
        String ls = System.getProperty("line.separator");

        try {
            while ((line = reader.readLine()) != null) {
                stringBuilder.append(line);
                stringBuilder.append(ls);
            }

            return stringBuilder.toString();
        } finally {
            reader.close();
        }
    }

    private void generateNotTerminals() {
        grammr.notTerminal().forEach(notTerminal -> {
                    String name = notTerminal.WORD().getText();
                    notTerms.put(name, new NotTerm(name));
                }
        );
        grammr.notTerminal().forEach(notTerminal -> {
            String name = notTerminal.WORD().getText();
            notTerminal.rul().forEach(rul -> notTerms.get(name).addRule(parseRule(rul)));
        });
    }

    private List<Token> parseRule(GrammarParser.RulContext rule) {
        List<Token> parseRule = new ArrayList<>();
        rule.option().forEach(option -> {
                    option.word().forEach(word -> {
                        if (word.WORD() != null) {
                            parseRule.add(notTerms.get(word.WORD().getText()));
                        } else {
                            parseRule.add(new Token(word.LIIERAL().getText()));
                        }
                    });
                }
        );
        return parseRule;
    }
}
