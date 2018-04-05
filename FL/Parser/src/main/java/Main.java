import java.io.IOException;

/**
 * Created by ksenia on 06.06.17.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        LL1ParserGen ll1ParserGen = new LL1ParserGen("in/arifmetics.in", "out/arifmetics.out");
        ll1ParserGen.generate();
    }
}