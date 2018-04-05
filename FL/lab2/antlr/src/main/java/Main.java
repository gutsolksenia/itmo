import java.io.*;

/**
 * Created by ksenia on 29.05.17.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        processFile("AplusB");
        processFile("HelloWorld");
        processFile("IfCase");
        processFile("whilecase");
    }
    private static String readFile(String file) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(file));
        String line = null;
        StringBuilder stringBuilder = new StringBuilder();
        String ls = System.getProperty("line.separator");

        try {
            while((line = reader.readLine()) != null) {
                stringBuilder.append(line);
                stringBuilder.append(ls);
            }

            return stringBuilder.toString();
        } finally {
            reader.close();
        }
    }

    private static void writeToFile(String file, String content) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(file));
        writer.write(content);
        writer.flush();
        writer.close();
    }

    private static void processFile(String filename) throws IOException {
        String pascalCode = readFile("input/" + filename + ".pas");
        String cCode = new Converter(pascalCode).convert();
        writeToFile("output/" + filename + ".c", cCode);
    }
}
