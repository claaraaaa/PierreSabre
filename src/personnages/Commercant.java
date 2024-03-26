package personnages;


public class Commercant extends Humains {
	
	public Commercant(String nom, String boisson, int argent) {
		super(nom, boisson = "the", argent);
	}
	
	public int seFaireExtorquer() {
		int argent = getArgent();
		perdreArgent(argent);
		parler("J’ai tout perdu! Le monde est trop injuste...");
		return argent;
	}
	
	public void recevoir(int argent) {
		gagnerArgent(argent);
		parler(argent + " sous ! Je te remercie généreux donateur!");
	}
	
	
	
}
