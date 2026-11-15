package gestioncourriers;

public class Lettre extends Courrier {

    private double poids;   // en grammes
    private String format;  // "A3" ou "A4"
    
    

    public Lettre(boolean express, String adresse, double poids, String format) {
        super(express, adresse);
        this.poids = poids;
        this.format = format;
    }

    
    
       public void decrire() {
        super.decrire();
        System.out.println("  Type : Lettre");
        System.out.println("  Poids : " + poids + " g");
        System.out.println("  Format : " + format);
    }

       
       
        public double affranchir() {
        if (!estValide()) {
            return 0;
        }
        
        
        double tarif = format.equals("A3") ? 3.50 : 2.50;
        double montant = tarif + 0.5 * (poids / 1000.0);
        return express ? 2 * montant : montant;
    }
}


