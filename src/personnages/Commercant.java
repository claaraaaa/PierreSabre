package personnages;


public class Commercant extends Humains {
	
	public Commercant(String nom, int argent) {
		super(nom, "thé", argent);
	}
	
	public int seFaireExtorquer() {
		int argentVole = getArgent();
		perdreArgent(argentVole);
		parler("J’ai tout perdu! Le monde est trop injuste...");
		return argentVole;
	}
	
	public void recevoir(int argent) {
		gagnerArgent(argent);
		parler(argent + " sous ! Je te remercie généreux donateur!");
	}
	
	
	
}
