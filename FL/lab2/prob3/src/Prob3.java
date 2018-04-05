import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Prob3 {
    private static class Dfa {
        private static final int ALPHABET_SIZE = 26;
        private int[][] conditions;
        private Set<Integer>[][] revConditions;
        private Set<Integer> finalConditions;
        private int size;
        private Set<Integer> reachable;


        public Dfa(int size, Set<Integer> finalConditions) {
            this.finalConditions = finalConditions;
            this.size = size;
            conditions = new int[size + 1][ALPHABET_SIZE];
            for (int[] condition : conditions) {
                Arrays.fill(condition, size);
            }
            revConditions = new Set[size + 1][ALPHABET_SIZE];
        }

        public void addTransition(int from, int to, char symbol) {
            conditions[from][symbol - 'a'] = to;
        }

        public Dfa minimize() {
            markUnreachable();
            Queue<IntPair> queue = new LinkedList<>();
            boolean[][] marked = new boolean[size + 1][size + 1];
            findRevConditions();
            for (int first = 0; first <= size; first++) {
                for (int second = first; second <= size; second++) {
                    if (finalConditions.contains(first) != finalConditions.contains(second)) {
                        marked[first][second] = true;
                        marked[second][first] = true;
                        queue.add(new IntPair(first, second));
                    }
                }
            }

            while (!queue.isEmpty()) {
                IntPair pair = queue.poll();
                int u = pair.first;
                int v = pair.second;
                for (int c = 0; c < ALPHABET_SIZE; c++) {
                    for (Integer u1 : revConditions[u][c]) {
                        for (Integer v1 : revConditions[v][c])
                            if (!marked[u1][v1]) {
                                marked[u1][v1] = true;
                                marked[v1][u1] = true;
                                queue.add(new IntPair(u1, v1));
                            }
                    }
                }
            }
            return makeDfaFromTable(marked);
        }

        public void print(BufferedWriter writer) throws IOException {
            int m = 0;
            for (int[] cond : conditions) {
                for (int transition : cond) {
                    if (transition < size) {
                        m++;
                    }
                }
            }
            writer.write(Integer.toString(size) + " " + m +
                    " " + Integer.toString(finalConditions.size()));
            writer.newLine();
            for (Integer cond : finalConditions) {
                writer.write(Integer.toString(++cond) + " ");
            }

            for (int from = 0; from < size; from++) {
                int[] cond = conditions[from];
                for (char chr = 'a'; chr < 'a' + ALPHABET_SIZE; chr++) {
                    int to = cond[chr - 'a'];
                    if (to < size) {
                        writer.newLine();
                        writer.write(Integer.toString(from + 1) + " " +
                                Integer.toString(to + 1) + " " + chr);
                    }
                }
            }
        }

        private Dfa makeDfaFromTable(boolean[][] marked) {
            List<Set<Integer>> newConditions = getNewConditions(marked);
            Set<Integer> newFinalConds = new HashSet<>();
            for (int cond = 0; cond < newConditions.size(); cond++) {
                if (finalConditions.contains(newConditions.get(cond).toArray()[0])) {
                    newFinalConds.add(cond);
                }
            }

            Dfa dfa = new Dfa(newConditions.size(), newFinalConds);
            for (int newCond = 0; newCond < newConditions.size(); newCond++) {
                for (int from : newConditions.get(newCond)) {
                    for (char chr = 0; chr < ALPHABET_SIZE; chr++) {
                        int to = conditions[from][chr];
                        for (int newTo = 0; newTo < newConditions.size(); newTo++) {
                            if (newConditions.get(newTo).contains(to)) {
                                dfa.addTransition(newCond, newTo, (char) (chr + 'a'));
                            }
                        }
                    }
                }
            }
            return dfa;
        }

        private void markUnreachable() {
            reachable = new HashSet<>();
            dfs(0, reachable);
            reachable.add(size);
        }

        private void dfs(int from, Set<Integer> visited) {
            visited.add(from);
            for (int to : conditions[from]) {
                if (!visited.contains(to)) {
                    visited.add(to);
                    dfs(to, visited);
                }
            }
        }

        private List<Set<Integer>> getNewConditions(boolean[][] marked) {
            List<Set<Integer>> newConditions = new ArrayList<>();
            Set<Integer> firstSet = new HashSet<>();
            for (int i = 0;  i <= size; i++) {
                if (reachable.contains(i) && !marked[0][i]) {
                    firstSet.add(i);
                }
            }
            newConditions.add(firstSet);
            for (int first = 1; first <= size; first++) {
                if (reachable.contains(first)) {
                    boolean newCondFlag = true;
                    for (int second = 0; second < first; second++) {
                        if (!marked[first][second] && reachable.contains(second)) {
                            newCondFlag = false;
                        }
                    }
                    if (newCondFlag) {
                        Set<Integer> newCond = new HashSet<>();
                        for (int second = first; second <= size; second++) {
                            if (!marked[first][second] && reachable.contains(second)) {
                                newCond.add(second);
                            }
                        }
                        newConditions.add(newCond);
                    }
                }
            }
            newConditions = newConditions.stream().filter(s -> !s.contains(size)).collect(Collectors.toList());
            return newConditions;
        }

        private void findRevConditions() {
            for (int i = 0; i <= size; i++) {
                for (int j = 0; j < ALPHABET_SIZE; j++) {
                    revConditions[i][j] = new HashSet<>();
                }
            }
            for (int from = 0; from <= size; from++) {
                for (int chr = 0; chr < ALPHABET_SIZE; chr++) {
                    int to = conditions[from][chr];
                    revConditions[to][chr].add(from);
                }
            }
        }

        private class IntPair {
            public final int first;
            public final int second;

            public IntPair(int first, int second) {
                this.first = first;
                this.second = second;
            }
        }
    }

    private static Dfa readDfa(BufferedReader reader) throws IOException {
        String[] nmk = reader.readLine().split(" ");
        int n = Integer.parseInt(nmk[0]);
        int m = Integer.parseInt(nmk[1]);
        int k = Integer.parseInt(nmk[2]);

        Set<Integer> finalConditions = new HashSet<>();

        if (k == 0) {
            return new Dfa(0, new HashSet<>());
        }
        Arrays.stream(reader.readLine().split(" "))
                .forEach(s -> finalConditions.add(Integer.parseInt(s) - 1));

        Dfa dfa = new Dfa(n, finalConditions);

        for (int i = 0; i < m; i++) {
            String[] input = reader.readLine().split(" ");
            int from = Integer.parseInt(input[0]);
            int to = Integer.parseInt(input[1]);
            char symbol = input[2].charAt(0);

            dfa.addTransition(--from, --to, symbol);
        }
        return dfa;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("minimization.in"));
        BufferedWriter writer = new BufferedWriter(new FileWriter("minimization.out"));
        Dfa dfa = readDfa(reader);
        dfa.minimize().print(writer);
        writer.flush();
    }
}