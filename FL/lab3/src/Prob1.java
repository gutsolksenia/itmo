import java.io.*;
import java.util.*;

/**
 * Created by ksenia on 08.11.16.
 */
public class Prob1 {
    private static class Nfa {
        private final Set<Integer> finalConditions;
        private final Condition[] conditions;

        public Nfa(int size, Set<Integer> finalConditions) {
            this.finalConditions = finalConditions;
            conditions = new Condition[size + 1];
            for (int i = 0; i < conditions.length; i++) {
                conditions[i] = new Condition();
            }
        }

        public void addTransition(int from, int to, char symbol) {
            conditions[from].transitions[symbol - 'a'].add(to);
        }

        public boolean accepts(String string) {
            Set<Integer> from = new HashSet<>();
            from.add(0);
            for (char symbol: string.toCharArray()) {
                Set<Integer> to = new HashSet<>();
                for (Integer index: from) {
                    to.addAll(conditions[index].transition(symbol));
                    from = to;
                }
            }

            from.retainAll(finalConditions);
            return (from.size() > 0);
        }

        private static class Condition {
            private static final int ALPHABET_SIZE = 26;
            protected final List<Integer>[] transitions = new ArrayList[ALPHABET_SIZE];
            {
                for (int i = 0; i < transitions.length; i++) {
                    transitions[i] = new ArrayList<>();
                }
            }

            public List<Integer> transition(char symbol) {
                return transitions[symbol - 'a'];
            }
        }
    }

    private static Integer getNotTerminal(String s, Map<Character, Integer> map) {
        Character chr = s.charAt(s.length() - 1);
        if (!map.containsKey(chr)) {
            map.put(chr, map.size());
        }
        return map.get(chr);
    }

    private static Nfa readNfa(BufferedReader reader) throws IOException {
        String[] strings = reader.readLine().split(" ");
        Integer n = Integer.parseInt(strings[0]);
        Character start = strings[1].charAt(0);
        Set<Integer> finalConditions = new HashSet<>();
        finalConditions.add(n);
        Map<Character, Integer> charToCond = new HashMap<>();
        charToCond.put(start, 0);
        Nfa nfa = new Nfa(n + 1, finalConditions);

        for (int i = 0; i < n; i++) {
            strings = reader.readLine().split(" ");
            Integer from = getNotTerminal(strings[0], charToCond);
            String transition = strings[2];
            if (transition.length() == 1) {
                nfa.addTransition(from, n, transition.charAt(0));
            } else {
                nfa.addTransition(from, getNotTerminal(transition , charToCond), transition .charAt(0));
            }
        }
        return nfa;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("automaton.in"));
        BufferedWriter writer = new BufferedWriter(new FileWriter("automaton.out"));
        Nfa nfa = readNfa(reader);
        int m = Integer.parseInt(reader.readLine());
        for (int i = 0; i < m; i++) {
            String w = reader.readLine();
            if (nfa.accepts(w)) {
                writer.write("yes");
            } else {
                writer.write("no");
            }
            writer.newLine();
        }
        writer.flush();
    }
}
