package app;

import app.Car;

import java.util.ArrayList;
import java.util.List;


public class Stock {
  public static List<Car> stck = new ArrayList<Car>();

  /**
   * Find the most expensive cars.
   *
   * @param ec      standard diviation
   * @param average average
   * @return array of expensive cars
   */
  public static ArrayList<Car> getMostExpensive(double ec, double average) {
    ArrayList x = new ArrayList();
    for ( Car car : stck) {
        if ((car.getPrice()) > ( ec + average)) {
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
  public static double average() {
    double avg = 0;
    int i = 0;
    int j = 0;

    for (Car car : stck) {
        avg = avg + car.getPrice();
    }
    avg = avg / stck.size() ;
    return avg;
  }


  /**
   * Process the standard deviation of cars.
   *
   * @param average average of cost cars
   * @return double deviation
   */
  public static double deviation(double average) {
    double dev = 0;
    double diff;
    double sum = 0;
    for (Car car : stck) {
        diff = car.getPrice() - average;
        sum =+ Math.pow(diff, 2);
    }
    dev = Math.sqrt(sum / stck.size());
    return dev;
  }

  /**
   * Main.
   *
   * @param args argurments
   */
  public static void main(String[] args) {
    Car v1 = new Car(1000, "Polo");
    Car v2 = new Car(4000, "Golf");
    Car v3 = new Car(10000, "C1");
    Car v4 = new Car(20000, "Espace");

    stck.add(v1);
    stck.add(v2);
    stck.add(v3);
    stck.add(v4);

    double avg = average();
    double ec = deviation(avg);
    System.out.println(getMostExpensive(ec, avg));
  }
}
