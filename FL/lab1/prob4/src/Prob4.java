import java.io.*;
import java.util.*;

/**
 * Created by ksenia on 04.11.16.
 */

public class Prob4 {

    private static class Dfa {
        private int MAX_CONDITIONS_COUNT = 101;
        private int ABS = 1000_000_007;
        private List<Integer>[] conditions = new ArrayList[MAX_CONDITIONS_COUNT];
        private final Set<Integer> finalConditions;

        public Dfa(Set<Integer> finalConditions) {
            this.finalConditions = finalConditions;
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
            int[] visited = new int[MAX_CONDITIONS_COUNT];
            visited[0] = 1;

            for (int i = 0; i < length; i++) {
                Set<Integer> to = new HashSet<>();
                int[] newVisited = new int[MAX_CONDITIONS_COUNT];

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

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("problem4.in"));
        BufferedWriter writer = new BufferedWriter(new FileWriter("problem4.out"));
        String[] numbers = reader.readLine().split(" ");
        int m = Integer.parseInt(numbers[1]);
        int l = Integer.parseInt(numbers[3]);

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
        writer.write(Integer.toString(dfa.wordCount(l)));
        writer.flush();
        //dfa.show();
    }
}
