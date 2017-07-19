
public class Voiture
{
    private double price;
    private String modele;
        
        // Constructeur
     public Voiture ( double montant, String marque)
     {
         modele = marque;
         price = montant;
     }
     
     public double getPrice ()
     {
         return price;
        }
        public String getModele ()
     {
         return modele;
        }
    }