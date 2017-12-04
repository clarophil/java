package app;

import java.util.ArrayList;

public class Stock {
  private static Car[][] stock = new Car[2][2];

  /**
   * Find the most expensive cars.
   *
   * @param ec standard diviation
   * @param average average
   * @return array of expensive cars
   */
  private static ArrayList<Car> getMostExpensive(double ec, double average) {
    ArrayList x = new ArrayList();
    for (Car[] car : stock) {
      for (int j = 0; j < car.length; j++) {
        if ((car[j].getPrice()) > (2 * ec + average)) {
          x.add(car[j].getBrand());
        }
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

    for (i = 0; i < stock.length; i++) {
      for (j = 0; j < stock[i].length; j++) {
        avg = avg + stock[i][j].getPrice();
      }
    }
    avg = avg / (i * j);
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
    double a;
    for (Car[] car : stock) {
      for (int j = 0; j < stock[0].length; j++) {
        a = car[j].getPrice() - average;
        diff = Math.pow(a, 2);
        dev = Math.sqrt(dev);
      }
    }
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

    stock[0][0] = v1;
    stock[0][1] = v2;
    stock[1][0] = v3;
    stock[1][1] = v4;

    double moyenne = average();
    double ec = deviation(moyenne);
    System.out.println(getMostExpensive(ec, moyenne));
  }
}
