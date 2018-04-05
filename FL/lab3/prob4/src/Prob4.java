import java.io.*;
import java.util.*;

/**
 * Created by ksenia on 08.11.16.
 */
public class Prob4 {
    private static class Grammar {
        private final Character start;
        private final Set<Character> notTerminals = new HashSet<>();
        private List<Rule> rules = new ArrayList<>();
        private static final int ABS = 1000_000_007;

        public Grammar(Character startChr) {
            start = startChr;
            notTerminals.add(startChr);
        }

        public void addRule(String s) {
            rules.add(new Rule(s));
        }

        public int derivationCount(String w) {
            Map<Character, long[][]> d  = new HashMap<>();
            for (Character chr: notTerminals) {
                d.put(chr, new long[w.length()][w.length()]);
            }

            for (int i = 0; i < w.length(); i++) {
                for (Rule rule: rules) {
                    if (rule.right.equals(w.substring(i, i + 1))) {
                        d.get(rule.left)[i][i] = 1;
                    }
                }
            }

            for (int m = 1; m < w.length(); m++) {
                for (int i = 0; i + m < w.length(); i++) {
                    int j = i + m;
                    for (Rule rule: rules) {
                        if (rule.right.length() == 2) {
                            for (int k = i; k < j; k++) {
                                Character b = rule.right.charAt(0);
                                Character c = rule.right.charAt(1);
                                d.get(rule.left)[i][j] = (d.get(rule.left)[i][j] + (d.get(b)[i][k] * d.get(c)[k + 1][j]) % ABS) % ABS;
                            }
                        }
                    }
                }
            }
            return (int)d.get(start)[0][w.length() - 1];
        }

        public void show() {
            for (Rule rule : rules) {
                rule.show();
            }
        }

        private void putNotTerminal(Character chr) {
            if (!notTerminals.contains(chr) && 'A' <= chr && chr <= 'Z') {
                notTerminals.add(chr);
            }
        }

        private class Rule {
            private Character left;
            private final String right;

            private Rule(String s) {
                String[] strings = s.split(" ");
                left = strings[0].charAt(0);
                putNotTerminal(left);
                if (strings.length < 3) {
                    right = new String();
                    return;
                }
                right = strings[2];
                for (Character chr : right.toCharArray()) {
                    putNotTerminal(chr);
                }
            }

            public void show() {
                System.out.print(left);
                System.out.print(" -> ");
                for (Character c : right.toCharArray()) {
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
        BufferedReader reader = new BufferedReader(new FileReader("nfc.in"));
        BufferedWriter writer = new BufferedWriter(new FileWriter("nfc.out"));
        Grammar grammar = readGrammar(reader);
        String w = reader.readLine();
        writer.write(Integer.toString(grammar.derivationCount(w)));
        writer.flush();
    }
}

