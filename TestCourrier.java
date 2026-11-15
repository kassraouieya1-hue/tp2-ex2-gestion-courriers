package gestioncourriers;

public class TestCourrier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 BoiteCourrier boite = new BoiteCourrier(5);

	        boite.ajouter(new Lettre(false, "12 Avenue Habib Bourguiba, Tunis", 200, "A4"));
	        boite.ajouter(new Lettre(true, "5 Rue de Marseille, Sfax", 500, "A3"));
	        boite.ajouter(new Colis(false, "8 Rue Ibn Khaldoun, Sousse", 2000, 10));
	        boite.ajouter(new Colis(true, null, 1500, 8));      
	        boite.ajouter(new Lettre(false, null, 100, "A4"));  

	        boite.afficher();

	        System.out.println();
	        System.out.println("Montant total d'affranchissement : " + boite.affranchir() + " dinars");
	        System.out.println("Nombre de courriers invalides : " + boite.courriersInvalides());
	    }
	}


