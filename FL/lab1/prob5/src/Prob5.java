import java.io.*;
import java.util.*;

/**
 * Created by ksenia on 13.11.16.
 */
public class Prob5 {
    private static class Dfa {
        private int ABS = 1000_000_007;
        private final List<Integer>[] conditions;
        private final Set<Integer> finalConditions;
        private final int size;

        public Dfa(int size, Set<Integer> finalConditions) {
            this.finalConditions = finalConditions;
            this.size = size;
            conditions = new ArrayList[size];
            for (int i = 0; i < conditions.length; i++) {
                conditions[i] = new ArrayList<>();
            }
        }

        public void addTransition(int from, int to) {
            conditions[from].add(to);
        }

        public int wordCount(int length) {
            Set<Integer> from = new HashSet<>();
            from.add(0);
            int[] visited = new int[size];
            visited[0] = 1;

            for (int i = 0; i < length; i++) {
                Set<Integer> to = new HashSet<>();
                int[] newVisited = new int[size];

                for (Integer fromCond : from) {
                    for (Integer toCond : conditions[fromCond]) {
                        newVisited[toCond] = (newVisited[toCond] + visited[fromCond]) % ABS;
                    }
                    to.addAll(conditions[fromCond]);
                }
                visited = newVisited;
                from = to;
            }

            int answ = 0;
            for (Integer cond : from)
                if (finalConditions.contains(cond)) {
                    answ = (answ +  visited[cond]) % ABS;
                }
            return answ;
        }

        public void show() {
            for (int i = 0; i < 10; i++) {
                for (Integer c : conditions[i]) {
                    System.out.print(c);
                    System.out.print(" ");
                }
                System.out.println();
            }
        }
    }

    private static class Nfa {
        private static final int ALPHABET_SIZE = 26;
        private Set<Integer> finalConditions;
        private final Condition[] conditions;
        private final List<Set<Integer> > dfaConds = new ArrayList<>();
        private final Map<Set<Integer>, Integer> dfaCondsNumbers = new HashMap<>();
        private final List<int[]> dfaTransitions = new ArrayList<>();

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

        private static class Condition {
            protected final List<Integer>[] transitions = new ArrayList[ALPHABET_SIZE];

            {
                for (int i = 0; i < transitions.length; i++) {
                    transitions[i] = new ArrayList<>();
                }
            }

            public List<Integer> transition(int symbol) {
                return transitions[symbol];
            }
        }

        public Dfa dfa() {
            findDfaConds();
            Set<Integer> dfaFinalConds = getDfaFinalConds();
            Dfa dfa = new Dfa(dfaConds.size(), dfaFinalConds);
            for (int from = 0; from < dfaConds.size(); from++) {
                for (int chr = 0; chr < ALPHABET_SIZE; chr++) {
                    int to = dfaTransitions.get(from)[chr];
                    if (!(to == -1)) {
                        dfa.addTransition(from, to);
                    }
                }
            }
            return dfa;
        }

        private void findDfaConds() {
            Queue<Set<Integer> > queue = new LinkedList<>();
            Set<Integer> startSet = new HashSet<>();
            startSet.add(0);
            queue.add(startSet);
            addDfaCond(startSet);

            while (!queue.isEmpty()) {
                Set<Integer> from = queue.poll();
                for (int chr = 0; chr < ALPHABET_SIZE; chr++) {
                    Set<Integer> to = new HashSet<>();
                    for (Integer cond: from) {
                        to.addAll(conditions[cond].transition(chr));
                    }

                    if (! dfaCondsNumbers.containsKey(to)) {
                        queue.add(to);
                        addDfaCond(to);
                    }
                    addDfaTransition(from, to, chr);
                }
            }
        }

        private  Set<Integer> getDfaFinalConds() {
            Set<Integer> dfaFinalConds = new HashSet<>();
            for (int i = 0; i < dfaConds.size(); i++) {
                if (dfaConds.get(i).stream()
                        .anyMatch(finalConditions::contains)) {
                    dfaFinalConds.add(i);
                }
            }
            return dfaFinalConds;
        }

        private void addDfaTransition(Set<Integer> from, Set<Integer> to, int chr) {
            Integer fromNumber =  dfaCondsNumbers.get(from);
            Integer toNumber =  dfaCondsNumbers.get(to);
            dfaTransitions.get(fromNumber)[chr] = toNumber;
        }

        private void addDfaCond(Set<Integer> cond) {
            if (! dfaCondsNumbers.containsKey(cond)) {
                 dfaCondsNumbers.put(cond, dfaConds.size());
                dfaTransitions.add(new int[ALPHABET_SIZE]);
                Arrays.fill(dfaTransitions.get(dfaConds.size()), -1);
                dfaConds.add(cond);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("problem5.in"));
        BufferedWriter writer = new BufferedWriter(new FileWriter("problem5.out"));
        String[] nmkl = reader.readLine().split(" ");
        int n = Integer.parseInt(nmkl[0]);
        int m = Integer.parseInt(nmkl[1]);
        int l = Integer.parseInt(nmkl[3]);

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

        writer.write(Integer.toString(nfa.dfa().wordCount(l)));
        writer.flush();
    }
}
