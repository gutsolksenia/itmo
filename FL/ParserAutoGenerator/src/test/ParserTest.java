import org.junit.Test;
import ru.itmo.gutsol.translation.autogen.Parser;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.text.ParseException;

import static junit.framework.TestCase.fail;
import static org.junit.Assert.assertEquals;

/**
 * Created by ksenia on 15.06.17.
 */
public class ParserTest {
    @Test
    public void test1() {
        test("1 - 2 + (4 + 5 * (10 - 15 + 2) + 3) - 3", -12);
    }

    @Test
    public void test2() {
        test("2 * (4 + 5 * (10 - 15 + 2) + 3) - 3 + 3*8", 5);
    }

    @Test
    public void degTest(){
        test("2**3**2*3 - 1", 1535);
        test("2**0", 1);
    }


    public void test(String input, Integer result) {
        InputStream is = new ByteArrayInputStream(input.getBytes(StandardCharsets.UTF_8));
        try {
            assertEquals(result, new Parser().parse(is));
        } catch (ParseException e) {
            fail(e.getMessage());
        } catch (IOException e) {
            fail(e.getMessage());
        }
    }
}