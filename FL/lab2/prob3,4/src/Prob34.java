import java.io.*;
import java.util.*;

/**
 * Created by ksenia on 05.11.16.
 */
public class Prob34 {

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

        public void minimize() {
            List<Integer>[][] inv = new List[size][ALPHABET_SIZE];
            for (int i = 0; i < size; i++) {
                for (int c = 0; c < ALPHABET_SIZE; c++) {
                    inv[i][c] = new ArrayList<>();
                }
            }
            for (int from = 0; from < size; from++) {
                for (int symbol = 0; symbol < ALPHABET_SIZE; symbol++) {
                    int to = conditions[from][symbol];
                    inv[to][symbol].add(from);
                }
            }//init inv

            int[] classForCond = new int[size];
            List<Set<Integer>> classes = new ArrayList<>();
            Set<Integer> notFinalConditions = new HashSet<>();
            for (int cond = 0; cond < size; cond++) {
                if (!finalConditions.contains(cond)) {
                    notFinalConditions.add(cond);
                    classForCond[cond] = 1;
                }
            }
            classes.add(finalConditions);
            classes.add(notFinalConditions);

            Queue<Integer> classQueue = new LinkedList<>();
            Queue<Integer> symbolQueue = new LinkedList<>();
            for (int symbol = 0; symbol < ALPHABET_SIZE; symbol++) {
                classQueue.add(0);
                symbolQueue.add(symbol);
                classQueue.add(1);
                symbolQueue.add(symbol);
            }

            while (!classQueue.isEmpty()) {
                int cond = classQueue.poll();
                int symbol = symbolQueue.poll();
                List<List<Integer>> involved = new ArrayList<>();
                for (int i = 0; i < size; i++) {
                    involved.add(new ArrayList<>());
                }
            }


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
        Dfa dfa = readDfa(reader);

        writer.flush();
    }
}

