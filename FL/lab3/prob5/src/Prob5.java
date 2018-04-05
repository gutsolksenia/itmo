import java.io.*;
import java.util.*;

/**
 * Created by ksenia on 08.11.16.
 */
public class Prob5 {
    private static class Grammar {
        private Set<Integer> notTerminals = new HashSet<>();
        private final Integer start;

        private Set<Rule> rules = new HashSet<>();
        private static final int ABS = 1000_000_007;
        int nextCharNumber = 123;

        public Grammar(Character startChr) {
            start = new Integer(startChr);
            notTerminals.add(new Integer(start));
        }

        public void addRule(String s) {
            rules.add(new Rule(s));
        }

        public int derivationCount(String word) {
            Integer[] w = new Integer[word.length()];
            for (int i = 0; i < word.length(); i++) {
                w[i] = new Integer(word.charAt(i));
            }
            Map<Integer, long[][]> d = new HashMap<>();
            for (Integer chr : notTerminals) {
                d.put(chr, new long[w.length][w.length]);
            }

            for (int i = 0; i < w.length; i++) {
                for (Rule rule : rules) {
                    if (rule.right[0].equals(w[i])) {
                        d.get(rule.left)[i][i] = 1;
                    }
                }
            }

            for (int m = 1; m < w.length; m++) {
                for (int i = 0; i + m < w.length; i++) {
                    int j = i + m;
                    for (Rule rule : rules) {
                        if (rule.right.length == 2) {
                            for (int k = i; k < j; k++) {
                                Integer b = rule.right[0];
                                Integer c = rule.right[1];
                                d.get(rule.left)[i][j] = (d.get(rule.left)[i][j] + (d.get(b)[i][k] * d.get(c)[k + 1][j]) % ABS) % ABS;
                            }
                        }
                    }
                }
            }
            return (int) d.get(start)[0][w.length - 1];
        }

        public void show() {
            for (Rule rule : rules) {
                rule.show();
            }
        }

        private void putNotTerminal(Integer chr) {
            if (!notTerminals.contains(chr) && 'A' <= chr && chr <= 'Z') {
                notTerminals.add(chr);
            }
        }

        private Integer newNotTerminal() {
            notTerminals.add(nextCharNumber);
            nextCharNumber++;
            return new Integer(nextCharNumber - 1);
        }

        private void deleteLongRules() {
            Set<Rule> newRules = new HashSet<>();
            for (Rule rule : rules) {
                if (rule.right.length > 2) {
                    Integer left = rule.left;
                    for (int i = 0; i < rule.right.length - 1; i++) {
                        Integer[] right = new Integer[2];
                        right[0] = rule.right[i];
                        right[1] = newNotTerminal();
                        left = right[1];
                        newRules.add(new Rule(left, right));
                    }
                } else {
                    newRules.add(rule);
                }
            }
            rules = newRules;
        }

        public void deleteEpsProductiveTerms() {
            Set<Integer> epsProd = new HashSet<>();
            Set<Rule> used = new HashSet<>();
            boolean continueFlag = true;
            while (continueFlag) {
                continueFlag = false;
                for (Rule rule : rules) {
                    if (Arrays.stream(rule.right).allMatch(epsProd::contains) && !used.contains(rule)) {
                        epsProd.add(rule.left);
                        continueFlag = true;
                        used.add(rule);
                    }
                }
            }

            Set<Rule> toRemove = new HashSet<>();
            for (Rule rule: rules) {
                if (rule.right.length == 0) {
                    toRemove.add(rule);
                }
                if (rule.right.length == 2) {
                    Integer a = rule.right[0];
                    Integer b = rule.right[1];
                    if (epsProd.contains(a)) {
                        Integer[] newRight = new Integer[1];
                        newRight[0] = b;
                        rules.add(new Rule(rule.left, newRight));
                    }
                    if (epsProd.contains(b)) {
                        Integer[] newRight = new Integer[1];
                        newRight[0] = a;
                        rules.add(new Rule(rule.left, newRight));
                    }
                }
            }
            rules.removeAll(toRemove);
            if (epsProd.contains(start)) {
                rules.add(new Rule(start, new Integer[0]));
            }
        }


        private class Rule {
            private Integer left;
            private Integer[] right;

            private Rule(String s) {
                String[] strings = s.split(" ");
                left = new Integer(strings[0].charAt(0));
                putNotTerminal(left);
                if (strings.length < 3) {
                    right = new Integer[0];
                    return;
                }
                char[] rightChr = strings[2].toCharArray();
                right = new Integer[rightChr.length];
                for (int i = 0; i < rightChr.length; i++) {
                    right[i] = new Integer(rightChr[i]);
                    putNotTerminal(right[i]);
                }
            }

            private Rule(Integer left, Integer[] right) {
                this.left = left;
                this.right = right;
            }

            public void show() {
                System.out.print(left);
                System.out.print(" -> ");
                for (Integer c : right) {
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
        BufferedReader reader = new BufferedReader(new FileReader("cf.in"));
        BufferedWriter writer = new BufferedWriter(new FileWriter("cf.out"));
        Grammar grammar = readGrammar(reader);
        String w = reader.readLine();
        writer.write(Integer.toString(grammar.derivationCount(w)));
        writer.flush();
    }
}