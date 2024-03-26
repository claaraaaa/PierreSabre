package histoire;

import personnages.Commercant;
import personnages.Humains;

public class HistoireTP4 {
	
	public static void main(String[] args) {
		
		Humains prof = new Humains("Prof", "kombucha", 54);
		
		prof.direBonjour();
		prof.acheter("une boisson", 12);
		prof.boire();
		prof.acheter("un jeu", 2);
		prof.acheter("un kimono", 50);
		
		System.out.println("\n");
		
		Commercant marco = new Commercant("Marco", "boisson", 20);
		marco.direBonjour();
		marco.seFaireExtorquer();
		marco.recevoir(15);
		marco.boire();
	}
}
