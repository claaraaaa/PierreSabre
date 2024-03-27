package personnages;

public class Ronin extends Humains {
	private int honneur;
	
	public Ronin(String nom, String boisson, int argent) {
		super(nom, boisson, argent);
		this.honneur = 1;
	}
	
	public void donner(Commercant beneficiaire) {
		int don = getArgent() / 10;
		parler(beneficiaire.getNom() + " prend ces " + don + " sous");
		perdreArgent(don);
		beneficiaire.recevoir(don);
	}
	
	public void provoquer(Yakuza adversaire) {
		
		int force = 2 * honneur;
		
		if (force >= adversaire.getReputation()) {
			parler("Je t'ai retrouvé vermine, tu vas payer pour ce que tu as fait à ce pauvre marchand!");
			gagnerArgent(adversaire.getArgent());
			honneur++;
			parler("Je t’ai eu petit yakusa!");
			adversaire.perdre();
		} else {
			honneur--;
			int argentPerdu = getArgent();
			perdreArgent(argentPerdu);
			parler("J'ai perdu contre ce yakuza, mon honneur et ma bourse ont en pris un coup.");
			adversaire.gagner(argentPerdu);
		}
	}
	
}
