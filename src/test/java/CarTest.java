import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.BeforeClass;
import app.Car;

public class CarTest {

    private static  Car auto;

    @BeforeClass
    public  static void setupBeforeClass()
    {
        auto = new Car(12000,"Ford");
    }

    @Test
    public void getPrice() {
        assertTrue(auto.getPrice() ==  12000);
    }

    @Test
    public void getBrand() {
        assertTrue(auto.getBrand() == "Ford");
    }

}
