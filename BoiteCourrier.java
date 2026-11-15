package gestioncourriers;

public class BoiteCourrier {

	private Courrier[] courriers;
    private int nbCourriers;
    
    

    public BoiteCourrier(int n) {
        courriers = new Courrier[n];
        nbCourriers = 0;
    }

    
    public void ajouter(Courrier c) {
        if (nbCourriers < courriers.length) {
            courriers[nbCourriers++] = c;
        } else {
            System.out.println("La boîte est pleine : courrier non ajouté.");
        }
    }

   
    
    public double affranchir() {
        double total = 0;
        for (int i = 0; i < nbCourriers; i++) {
            total += courriers[i].affranchir();
        }
        return total;
    }

    
    
    
    public int courriersInvalides() {
        int nb = 0;
        for (int i = 0; i < nbCourriers; i++) {
            if (!courriers[i].estValide()) {
                nb++;
            }
        }
        return nb;
    }

    
    
    
    public void afficher() {
        System.out.println("= Contenu de la boîte aux courriers =");
        for (int i = 0; i < nbCourriers; i++) {
            System.out.println("- Courrier n°" + (i + 1) + " -");
            courriers[i].decrire();
            if (!courriers[i].estValide()) {
                System.out.println("  > COURRIER INVALIDE <");
            }
        }
    }
}
