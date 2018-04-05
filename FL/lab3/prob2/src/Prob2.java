import java.io.*;
import java.util.*;

/**
 * Created by ksenia on 08.11.16.
 */
public class Prob2 {
    private static class Grammar {
        private final Character start;
        private final Set<Character> symbols = new HashSet<>();
        private List<Rule> rules = new ArrayList<>();

        public Grammar(Character startChr) {
            start = startChr;
            symbols.add(startChr);
        }

        public void addRule(String s) {
            rules.add(new Rule(s));
        }

        public void show() {
            for (Rule rule : rules) {
                rule.show();
            }
        }

        public Set<Character> getEpsProductiveTerms() {
            Set<Character> epsProd = new HashSet<>();
            Set<Rule> used = new HashSet<>();
            boolean continueFlag = true;
            while (continueFlag) {
                continueFlag = false;
                for (Rule rule: rules) {
                    if (epsProd.containsAll(rule.right) && !used.contains(rule)) {
                        epsProd.add(rule.left);
                        continueFlag = true;
                        used.add(rule);
                    }
                }
            }
            return epsProd;
        }


        private void putNotTerminal(Character chr) {
            if (!symbols.contains(chr) && 'A' <= chr && chr <= 'Z') {
                symbols.add(chr);
            }
        }

        private class Rule {
            private Character left;
            private final Set<Character> right = new HashSet<>();

            private Rule(String s) {
                String[] strings = s.split(" ");
                left = strings[0].charAt(0);
                putNotTerminal(left);
                if (strings.length < 3) {
                    return;
                }
                for (Character chr : strings[2].toCharArray()) {
                    right.add(chr);
                    putNotTerminal(chr);
                }
            }

            public void show() {
                System.out.print(left);
                System.out.print(" -> ");
                for (Character c : right) {
                    System.out.print(c);
                }
                System.out.println();
            }
        }
    }


    private static Grammar readGrammar(BufferedReader reader) throws IOException {
        String[] strings = reader.readLine().split(" ");
        int n = Integer.parseInt(strings[0]);
        char startChr = strings[1].charAt(0);
        Grammar grammar = new Grammar(startChr);
        for (int i = 0; i < n; i++) {
            grammar.addRule(reader.readLine());
        }
        return grammar;
    }


    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("epsilon.in"));
        BufferedWriter writer = new BufferedWriter(new FileWriter("epsilon.out"));
        Grammar grammar = readGrammar(reader);
        grammar.getEpsProductiveTerms().stream().sorted().forEach(chr -> {
            try {
                writer.write(chr);
                writer.write(" ");
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
        writer.flush();
    }
}

