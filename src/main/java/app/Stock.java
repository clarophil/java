package app;

import java.util.ArrayList;
import java.util.List;

class Stock
{
  private static List<Car> stock = new ArrayList<Car>();

  /**
   * Find the most expensive cars.
   *
   * @param ec      standard diviation
   * @param average average
   * @return array of expensive cars
   */
  private static ArrayList<Car> getMostExpensive(double ec, double average)
  {
    ArrayList x = new ArrayList();
    for (Car car : stock)
    {
        if ((car.getPrice()) > (ec + average))
        {
          x.add(car.getBrand());
        }
    }
    return x;
  }

  /**
   * Process average of cost cars.
   *
   * @return double average
   */
  private static double average()
  {
    double avg = 0;

    for (Car car : stock)
    {
        avg = avg + car.getPrice();
    }
    avg = avg / stock.size();
    return avg;
  }


  /**
   * Process the standard deviation of cars.
   *
   * @param average average of cost cars
   * @return double deviation
   */
  private static double deviation(double average)
  {
    double dev = 0;
    double diff;
    double sum = 0;
    for (Car car : stock)
    {
        diff = car.getPrice() - average;
        sum = sum + Math.pow(diff, 2);
    }
    dev = Math.sqrt(sum / stock.size());
    return dev;
  }

  /**
   * Main.
   *
   * @param args argurments
   */
  public static void main(String[] args)
  {
    Car v1 = new Car(1000, "Polo");
    Car v2 = new Car(4000, "Golf");
    Car v3 = new Car(10000, "C1");
    Car v4 = new Car(20000, "Espace");

    stock.add(v1);
    stock.add(v2);
    stock.add(v3);
    stock.add(v4);

    double avg = average();
    double ec = deviation(avg);
    System.out.println(getMostExpensive(ec, avg));
  }
}
