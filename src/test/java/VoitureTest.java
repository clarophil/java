
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.BeforeClass;
import app.Voiture;

public class VoitureTest {

    private static  Voiture auto;

    @BeforeClass
    public  static void setupBeforeClass()
    {
        auto = new Voiture(12000,"Ford");
    }

    @Test
    public void getPrice() {
        assertTrue(auto.getPrice() ==  12000);
    }

    @Test
    public void getModele() {
        assertTrue(auto.getModele() == "Ford");
    }

}
