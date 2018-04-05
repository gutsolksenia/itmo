import java.io.*;
import java.util.*;

/**
 * Created by ksenia on 05.11.16.
 */
public class Prob1 {

    private static class Dfa {
        private static final int ALPHABET_SIZE = 26;
        private int[][] conditions;
        private final Set<Integer> finalConditions;
        private final int size;

        public Dfa(int size, Set<Integer> finalConditions) {
            this.finalConditions = finalConditions;
            this.size = size;
            conditions = new int[size + 1][ALPHABET_SIZE];
            for (int[] condition : conditions) {
                Arrays.fill(condition, size);
            }
        }

        public void addTransition(int from, int to, char symbol) {
            conditions[from][symbol - 'a'] = to;
        }

        public boolean equals(Dfa other) {
            boolean[] visited1 = new boolean[size + 1];
            boolean[] visited2 = new boolean[other.size + 1];
            Queue<Integer> queue1 = new LinkedList<>();
            Queue<Integer> queue2 = new LinkedList<>();
            queue1.add(0);
            queue2.add(0);

            while (!queue1.isEmpty()) {
                int v1 = queue1.poll();
                int v2 = queue2.poll();
                if (!(finalConditions.contains(v1) == other.finalConditions.contains(v2))) {
                    return false;
                }
                visited1[v1] = true;
                visited2[v2] = true;
                for (int symbol = 0; symbol < ALPHABET_SIZE; symbol++) {
                    int u1 = conditions[v1][symbol];
                    int u2 = other.conditions[v2][symbol];
                    if (!visited1[u1] || !visited2[u2]) {
                        queue1.add(u1);
                        queue2.add(u2);
                    }

                }
            }
            return true;
        }
    }

    private static Dfa readDfa(BufferedReader reader) throws IOException {
        String[] nmk = reader.readLine().split(" ");
        int n = Integer.parseInt(nmk[0]);
        int m = Integer.parseInt(nmk[1]);

        Set<Integer> finalConditions = new HashSet<>();
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
        BufferedReader reader = new BufferedReader(new FileReader("equivalence.in"));
        BufferedWriter writer = new BufferedWriter(new FileWriter("equivalence.out"));
        Dfa dfa1 = readDfa(reader);
        Dfa dfa2 = readDfa(reader);
        if (dfa1.equals(dfa2)) {
            writer.write("YES");
        } else {
            writer.write("NO");
        }

        writer.flush();
    }
}
