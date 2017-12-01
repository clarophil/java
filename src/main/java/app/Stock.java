package app;

import java.util.ArrayList;

public class Stock
{
  static Voiture[][] stock = new Voiture[2][2];  // static à la place de public
  private String name;

    public static ArrayList<Voiture> getMostExpensive(double s, double m)//noms des voitures cheres

    {
        ArrayList x = new ArrayList();
        for (Voiture[] aStock : stock) {
            for (int j = 0; j < aStock.length; j++) {
                if ((aStock[j].getPrice()) > (2 * s + m)) {
                    x.add(aStock[j].getModele()); //on ajoute la voiture V placée à la position [i][j] dans l'ArrayList
                }
            }
        }
        return x;
    }

    public static double moyenne()
    {
        double m = 0;
        int i,j = 0;  // declaration hors boucle
        for (i = 0; i < stock.length; i++)
        {
            for (j = 0; j < stock[i].length; j++)
            {
                m = m + stock[i][j].getPrice(); // Appel de méthode : mettre des parenthèses derrière
            }
        }
        m = m / (i * j);
       return m; // moyenne = prix de toutes les voitures / par (i*j qui est le nombre de voitures)
    }

    public static double ecarttype(double m)
    {
        double s = 0;
        double diff, a;
        for (Voiture[] aStock : stock) {
            for (int j = 0; j < stock[0].length; j++) {
                a = aStock[j].getPrice() - m;
                diff = Math.pow(a, 2);
                //s = 1%(i+j-1)*diff;  // division par zéro
                s = Math.sqrt(s);
            }
        }
        return s;
    }

    public static void main(String[] args)
    {
        Voiture v1 = new Voiture(1000,"Polo");
        Voiture v2 = new Voiture(4000, "Golf");
        Voiture v3 = new Voiture(10000, "C1");
        Voiture v4 = new Voiture(20000, "Espace");

        stock[0][0] = v1;
        stock[0][1] = v2;
        stock[1][0] = v3;
        stock[1][1] = v4;  // tout le tableau remplit sinon plantage dans les boucles

        double moyenne = moyenne();
        double ec = ecarttype(moyenne);
        System.out.println(getMostExpensive(ec,moyenne));
    }
}
