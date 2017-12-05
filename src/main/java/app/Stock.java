package app;

import java.util.ArrayList;
import java.util.List;

class Stock
{
  private static List<Car> listCar = new ArrayList<>();

  /**
   * Constructor.
   *
   */
  private Stock()
  {
    //not called
  }

  /**
   * Find the most expensive cars.
   *
   * @param ec      standard diviation
   * @param average average
   * @return array of expensive cars
   */
  private static ArrayList<String> getMostExpensive(double ec, double average)
  {
    ArrayList<String> list = new ArrayList();
    for (Car car : listCar)
    {
        if ((car.getPrice()) > (ec + average))
        {
          list.add(car.getBrand());
        }
    }
    return list;
  }

  /**
   * Process average of cost cars.
   *
   * @return double average
   */
  private static double average()
  {
    double avg = 0;

    for (Car car : listCar)
    {
        avg = avg + car.getPrice();
    }
    avg = avg / listCar.size();
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
    double dev;
    double diff;
    double sum = 0;
    for (Car car : listCar)
    {
        diff = car.getPrice() - average;
        sum = sum + Math.pow(diff, 2);
    }
    dev = Math.sqrt(sum / listCar.size());
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

    listCar.add(v1);
    listCar.add(v2);
    listCar.add(v3);
    listCar.add(v4);

    double avg = average();
    double ec = deviation(avg);
    System.out.println(getMostExpensive(ec, avg));
  }
}
