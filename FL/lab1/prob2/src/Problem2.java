import java.io.*;
import java.util.*;

/**
 * Created by ksenia on 27.10.16.
 */
public class Problem2 {

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

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("problem2.in"));
        BufferedWriter writer = new BufferedWriter(new FileWriter("problem2.out"));
        String string = reader.readLine();
        String[] nmk = reader.readLine().split(" ");
        int n = Integer.parseInt(nmk[0]);
        int m = Integer.parseInt(nmk[1]);

        Set<Integer> finalConditions = new HashSet<>();
        Arrays.stream(reader.readLine().split(" "))
                .forEach(s->finalConditions.add(Integer.parseInt(s) - 1));
        Nfa nfa = new Nfa(n, finalConditions);
        for (int i = 0; i < m;  i++) {
            String[] input = reader.readLine().split(" ");
            int from = Integer.parseInt(input[0]);
            int to = Integer.parseInt(input[1]);
            char symbol = input[2].charAt(0);
            nfa.addTransition(--from, --to, symbol);
        }

        if (nfa.accepts(string)) {
            writer.write("Accepts");
        } else {
            writer.write("Rejects");
        }
        writer.flush();
    }
}
