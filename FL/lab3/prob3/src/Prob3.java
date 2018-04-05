import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by ksenia on 08.11.16.
 */
public class Prob3 {
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

        public void deleteRulesWithSymbols(Set<Character> badCharacters) {
            rules = rules.stream().filter( rule -> {
                if (badCharacters.contains(rule.left)) {
                    return false;
                }
                Set<Character> retainedSet = new HashSet<>(rule.right);
                retainedSet.retainAll(badCharacters);
                if (!retainedSet.isEmpty()) {
                    return false;
                }
                return true;
            }).collect(Collectors.toList());
        }


        public Set<Character> getUselessSymbols() {
            deleteRulesWithSymbols(getNotGenerativeSymbols());
            deleteRulesWithSymbols(getUnreachableSymbols());
            Set<Character> usefulSymbols = new HashSet<>();
            for (Rule rule : rules) {
                usefulSymbols.add(rule.left);
                usefulSymbols.addAll(rule.right);
         //       rule.show();
            }

            Set<Character> uselessSymbols = new HashSet<>(symbols);
            uselessSymbols.removeAll(usefulSymbols);
            return uselessSymbols;
        }

        private Set<Character> getUnreachableSymbols() {
            Set<Character> reachable = new HashSet<>();
            reachable.add(start);
            boolean continueFlag = true;
            Set<Rule> used = new HashSet<>();
            while (continueFlag) {
                continueFlag = false;
                for (Rule rule : rules) {
                    if (!used.contains(rule)) {
                        if (reachable.contains(rule.left)) {
                            reachable.addAll(rule.right);
                            continueFlag = true;
                            used.add(rule);
                        }
                    }
                }
            }

            Set<Character> unreachable = new HashSet<>(symbols);
            unreachable.removeAll(reachable);
            return unreachable;
        }

        private Set<Character> getNotGenerativeSymbols() {
            Set<Character> generative = new HashSet<>();
            Set<Rule> used = new HashSet<>();
            boolean continueFlag = true;
            while (continueFlag) {
                continueFlag = false;
                for (Rule rule : rules) {
                    if (!used.contains(rule)) {
                        if (generative.containsAll(rule.right)) {
                            generative.add(rule.left);
                            continueFlag = true;
                            used.add(rule);
                        }
                    }
                }
            }
            Set<Character> notGenerative = new HashSet<>(symbols);
            notGenerative.removeAll(generative);
            return notGenerative;
        }

        private void putNotTerminal(Character chr) {
            if (!symbols.contains(chr)) {
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
                    if ('A' <= chr && 'Z' >= chr) {
                        right.add(chr);
                        putNotTerminal(chr);
                    }
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
        BufferedReader reader = new BufferedReader(new FileReader("useless.in"));
        BufferedWriter writer = new BufferedWriter(new FileWriter("useless.out"));
        Grammar grammar = readGrammar(reader);
        grammar.getUselessSymbols().stream().sorted().forEach(chr -> {
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

