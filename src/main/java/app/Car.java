package app;

public class Car
{
  private double price;
  private String brand;

  /**
   * Constructor.
   *
   * @param price double price
   * @param brand string brand
   */
  public Car(double price, String brand)
  {
    this.brand = brand;
    this.price = price;
  }


  /**
   * Getter to price.
   *
   * @return  double price
   */
  public double getPrice()
  {
    return price;
  }

  /**
   * Getter to brand.
   *
   * @return string brand
   */
  public String getBrand()
  {
    return brand;
  }
}
class test {
  // Cyclomatic Complexity = 12
  public void doSmth()  {         // 1
    if (a == b)  {                // 2
      if (a1 == b1                // 3
        && c1 == d1) {            // 4
        fiddle();
      }
      else if (a2 == b2           // 5
              || c1 < d1) {       // 6
        fiddle();
      }
      else {
        fiddle();
      }
    }
    else if (c == d) {            // 7
      while (c == d) {            // 8
        fiddle();
      }
    }
    else if (e == f) {
      for (n = 0; n < h            // 9
            || n < 6; n++) {       // 10
        fiddle();
      }
    }
      else {
        switch (z) {
          case 1:                  // 11
            fiddle();
            break;
          case 2:                  // 12
            fiddle();
            break;
          default:
            fiddle();
            break;
      }
    }
  }
}  
