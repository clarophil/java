import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by dkp on 01-12-2017.
 */
public class SampleTest {
    @Test
    public void simpleTestPass() {
        int a = 1;
        int b = 2;
        assertTrue(a + b == 3);
    }

    @Test
    public void simpleTestFail() {
        int a = 1;
        int b = 2;
        assertTrue(a + b == 3);
    }

}