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
