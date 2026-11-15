package gestioncourriers;

public class Courrier {
	protected static final double TARIF_BASE = 0.5;

    protected boolean express;
    protected String adresse;
    
    

    public Courrier(boolean express, String adresse) {
        this.express = express;
        this.adresse = adresse;
    }

    
    
    public boolean estValide() {
        return adresse != null;
    }
    
    

    public void decrire() {
        System.out.println("Courrier " + (express ? "express" : "normal")
                + " - adresse : " + adresse
                + (estValide() ? "" : " (INVALIDE)"));
    }

    
    
    public double affranchir() {
        if (!estValide()) {
            return 0;
        }
        return express ? 2 * TARIF_BASE : TARIF_BASE;
    }

}
