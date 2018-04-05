import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

/**
 * Created by ksenia on 03.01.17.
 */
public class Fact {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new FileReader("fact.in"));
        BufferedWriter writer = new BufferedWriter(new FileWriter("factorial.out"));
        /*writer.write("1");
        writer.newLine();*/
        writer.write("s 1 -> read1 _ >");
        writer.newLine();
        for (int i = 1; i <= 30; i++) {
            writer.write("read" + Integer.toBinaryString(i) +
                    " 0 -> read" + Integer.toBinaryString(i) + "0 _ >");
            writer.newLine();
            writer.write("read" + Integer.toBinaryString(i) +
                    " 1 -> read" + Integer.toBinaryString(i) + "1 _ >");
            writer.newLine();
            writer.write("read" + Integer.toBinaryString(i) +
                    " _ -> writeFactOf" + Integer.toBinaryString(i) + "s0 _ >");
            writer.newLine();
        }

        for (int i = 1; i <= 30; i++) {
            String s = reader.readLine();
            for (int j = 0; j < s.length(); j++) {
                Character c = s.charAt(j);
                writer.write("writeFactOf" + Integer.toBinaryString(i) + "s" + Integer.toString(j) +
                        " _ -> writeFactOf" + Integer.toBinaryString(i) + "s" + Integer.toString(j + 1) + " " +
                        c.toString() + " >");
                writer.newLine();
            }
            int l = s.length();
            writer.write("writeFactOf" + Integer.toBinaryString(i) + "s" + Integer.toString(l) +
                    " _ -> findFirstHexDigit * <");
            writer.newLine();
        }

        for (int i = 0; i < 16; i++) {
            writer.write("findFirstHexDigit " + Integer.toHexString(i) +
            " -> findFirstHexDigit "  + Integer.toHexString(i) + " <");
            writer.newLine();
        }
        writer.write("findFirstHexDigit * -> findFirstHexDigit * <");
        writer.newLine();

        writer.write("findFirstHexDigit _ -> readFirstHexDigit _ >");
        writer.newLine();

        for (int i = 0; i < 16; i++) {
            String numbers = "000" + Integer.toBinaryString(i);
            numbers = numbers.substring(numbers.length() - 4);
            writer.write("readFirstHexDigit " + Integer.toHexString(i) +
                    " -> add" + numbers + "toEnds0 _ >");
            writer.newLine();
        }
        writer.write("readFirstHexDigit * -> deleteLeadingZeroes _ >");
        writer.newLine();

        for (int i = 0; i < 16; i++) {
            String numbers = "000" + Integer.toBinaryString(i);
            numbers = numbers.substring(numbers.length() - 4);
            for (int j = 0; j < 16; j++) {
                writer.write("add" + numbers + "toEnds0 " + Integer.toHexString(j) +
                        " -> add" + numbers + "toEnds0 "  + Integer.toHexString(j) + " >");
                writer.newLine();
            }
            writer.write("add" + numbers + "toEnds0 * -> add" + numbers + "toEnds0 * >");
            writer.newLine();
            for (int j = 0; j < 3; j++) {
                writer.write("add" + numbers + "toEnds" + Integer.toString(j) +
                        " _ -> add" + numbers + "toEnds" + Integer.toString(j + 1) + " ");
                writer.write(numbers.charAt(j));
                writer.write(" >");
                writer.newLine();
            }
            writer.write("add" + numbers + "toEnds3" +
                    " _ -> findFirstHexDigit ");
            writer.write(numbers.charAt(3));
            writer.write(" <");
            writer.newLine();
        }


        writer.write("deleteLeadingZeroes 0 -> deleteLeadingZeroes _ >");
        writer.newLine();
        writer.write("deleteLeadingZeroes 1 -> ac 1 ^");
        writer.newLine();

        writer.flush();

    }
}
