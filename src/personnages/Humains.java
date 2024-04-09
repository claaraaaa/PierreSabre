package personnages;

public class Humains {
	private String nom;
	private String boisson;
	private int argent;
	protected int nbConnaissance=0;
	protected Humains[] memoire = new Humains[30];
	
	public Humains(String nom, String boisson, int argent) {
		this.nom = nom;
		this.boisson = boisson;
		this.argent = argent;
		
	}
	
	public String getNom() {
		return nom;
	}
	
	public int getArgent() {
		return argent;
	}
	
	public String getBoisson() {
		return boisson;
	}
	
	protected void parler(String texte) {
		System.out.println("(" + nom + ") - " + texte);
	}
	
	public void direBonjour() {
		parler("Bonjour ! Je m’appelle " + nom + " et j’aime boire du " + boisson + ".");
	}
	
	public void boire() {
		parler("Mmmm, un bon verre de " + boisson + " ! GLOUPS !");
	}
	
	public void acheter(String bien, int prix) {
		if (prix <= argent) {
			parler("J'ai " + argent + " sous en poche. Je vais pouvoir m'offrir " + bien + " à " + prix + " sous.");
			perdreArgent(prix);
		} else {
			parler("Je n'ai plus que " + argent + " sous en poche. Je ne peux même pas m'offrir " + bien + " à " + prix + 
					" sous.");
		}
		
	}
	
	protected void perdreArgent(int gain) {
		argent -= gain;
	}
	
	protected void gagnerArgent(int gain) {
		argent += gain;
	}
	
	private void memoriser(Humains humain) {
		if (memoire.length > nbConnaissance) {
			memoire[nbConnaissance] = humain;
			nbConnaissance++;
		} else {
			for (int i=0; i<(nbConnaissance-1); i++) {
				memoire[i] = memoire[i+1];
			}
			memoire[memoire.length-1] = humain;
		}
	}
	
	private void repondre(Humains humain) {
		direBonjour();
		memoriser(humain);
	}
	
	public void faireConnaissanceAvec (Humains autreHumain) {
		this.direBonjour();
		autreHumain.repondre(this);
		this.memoriser(autreHumain);
	}
	
	public void listerConnaissances() {
		String texte = "Je connais beaucoup de monde dont : ";
		for (int i=0; i < nbConnaissance; i++) {
			if (i != nbConnaissance-1) {
				texte += memoire[i].getNom() + ", ";
			}
			else {
				texte += memoire[i].getNom();
			}
		}
		parler(texte);
	}
	
}
