import java.io.*;

/**
 * Created by ksenia on 26.10.16.
 */
public class Prob1 {


    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("problem1.in"));
        BufferedWriter writer = new BufferedWriter(new FileWriter("problem1.out"));
        reader.lines().forEach(s -> {
            try {
                writer.write(s);
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
        writer.flush();
    }
}
