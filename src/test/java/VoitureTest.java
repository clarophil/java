import org.junit.Test;
import static org.junit.Assert.*;

public class VoitureTest {
    Voiture auto = new Voiture(12000,"Ford");

    @Test
    public void getPrice() {
        assertTrue(auto.getPrice() ==  12000);
    }

    @Test
    public void getModele() {
        assertTrue(auto.getModele() == "Ford");
    }

}
