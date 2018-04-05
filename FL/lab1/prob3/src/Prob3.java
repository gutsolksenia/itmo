import java.io.*;
import java.util.*;

/**
 * Created by ksenia on 04.11.16.
 */

public class Prob3 {

    private static class Dfa {
        private static final int MAX_CONDITIONS_COUNT = 100001;
        private static final int ABS = 1000_000_007;
        private final Set<Integer> finalConditions;
        private final Map<Integer, Integer>[] conditions= new Map[MAX_CONDITIONS_COUNT];
        private final Set<Integer> usefulConditions = new HashSet<>();

        public Dfa(Set<Integer> finalConditions) {
            this.finalConditions = finalConditions;
            for (int i = 0; i < conditions.length; i++) {
                conditions[i] = new HashMap<>();
            }
        }

        private void markUslessConditions() {
            List<Integer>[] edges = new ArrayList[MAX_CONDITIONS_COUNT];
            for (int i = 0; i < MAX_CONDITIONS_COUNT; i++) {
                edges[i] = new ArrayList<>();
            }//initialize

            for (int fromCond = 0; fromCond < MAX_CONDITIONS_COUNT; fromCond++) {
                for (Integer toCond: conditions[fromCond].keySet()) {
                    edges[toCond].add(fromCond);
                }
            }

            for (Integer condition = 0; condition < MAX_CONDITIONS_COUNT; condition++) {
                if (finalConditions.contains(condition)) {
                    dfs(condition, edges);
                }
            }
        }

        private void dfs(Integer fromCond, List<Integer>[] graph) {
            usefulConditions.add(fromCond);
            for (Integer toCond: graph[fromCond]) {
                if (!usefulConditions.contains(toCond)) {
                    usefulConditions.add(toCond);
                    dfs(toCond, graph);
                }
            }
        }

        public void addTransition(int from, int to) {
            Integer edgeCount = conditions[from].get(to);
            if (edgeCount == null) {
                edgeCount = 0;
            }
            conditions[from].put(to, edgeCount + 1);
        }

        public int wordCount(int length) {
            markUslessConditions();
            if (isInf(new HashSet<>(), 0)) {
                return -1;
            }

            int[] paths = new int[MAX_CONDITIONS_COUNT];
            for (int cond: finalConditions) {
                paths[cond] = 1;
            }
            countPaths(paths, 0);
            /*for (int i = 0; i < 8; i++) {
                System.out.println((i + 1) + " "  + paths[i]);
            }*/
            return paths[0];
        }

        public void show() {
            for (int i = 0; i < 10; i++) {
                for (Integer c : conditions[i].values()) {
                    System.out.print(c);
                    System.out.print(" ");
                }
                System.out.println();
            }
        }

        private boolean isInf(Set<Integer> processed, int cond) {
            if (processed.contains(cond)) return true;
            processed.add(cond);

            for (int to: conditions[cond].keySet()) {
                if (usefulConditions.contains(to) && isInf(processed, to)) {
                   return true;
                }
            }
            processed.remove(cond);
            return false;
        }

        boolean used[] = new boolean[100001];
        private void countPaths(int[] paths, int v) {
            used[v] = true;
            for (int u: conditions[v].keySet()) {
                if (usefulConditions.contains(u)) {
                    if (!used[u]) {
                        countPaths(paths, u);
                    }
                    paths[v] = ((paths[u] * conditions[v].get(u)) % ABS + paths[v]) % ABS;
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("problem3.in"));
        BufferedWriter writer = new BufferedWriter(new FileWriter("problem3.out"));
        String[] numbers = reader.readLine().split(" ");
        int m = Integer.parseInt(numbers[1]);
        int n = Integer.parseInt(numbers[0]);

        Set<Integer> finalConditions = new HashSet<>();
        Arrays.stream(reader.readLine().split(" "))
                .forEach(s -> finalConditions.add(Integer.parseInt(s) - 1));


        Dfa dfa = new Dfa(finalConditions);
        for (int i = 0; i < m; i++) {
            String[] input = reader.readLine().split(" ");
            int from = Integer.parseInt(input[0]);
            int to = Integer.parseInt(input[1]);
            dfa.addTransition(--from, --to);
        }

        //dfa.show();
        writer.write(Integer.toString(dfa.wordCount(n)));
        writer.flush();
        //dfa.show();
    }

    class Pair<T, U> {
        final T a;
        final U b;

        public Pair(T a, U b) {
            this.a = a;
            this.b = b;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Pair<?, ?> pair = (Pair<?, ?>) o;

            if (a != null ? !a.equals(pair.a) : pair.a != null) return false;
            return b != null ? b.equals(pair.b) : pair.b == null;

        }

        @Override
        public int hashCode() {
            int result = a != null ? a.hashCode() : 0;
            result = 31 * result + (b != null ? b.hashCode() : 0);
            return result;
        }
    }
}
