package personnages;

public class Yakuza extends Humains {
	private String clan;
	private int reputation;
	
	public Yakuza(String nom, String boisson, int argent, String clan) {
		super(nom, boisson, argent);
		this.clan = clan;
		this.reputation = 0;
	}
	

	@Override
	public void direBonjour() {
		parler("Bonjour ! Je m’appelle " + getNom() + " et j’aime boire du " + getBoisson() + ".");
		parler("Mon clan est celui de " + clan + ".");
	}
	
	public int getReputation() {
		return reputation;
	}
	
	public void extorquer(Commercant victime) {
		parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par là ?");
		int argentInitial = getArgent();
		int argent = victime.getArgent();
		gagnerArgent(argent);
		reputation++;
		parler(victime.getNom() + ", si tu tiens à la vie donne moi ta bourse !");
		victime.seFaireExtorquer();
		int argentVole = getArgent() - argentInitial;
		parler("J’ai piqué les " + argentVole + " sous de " + victime.getNom() + ", ce qui me fait " + getArgent() + 
				" sous dans ma poche. Hi ! Hi !");
	}
	
	public int perdre() {
		int argentPerdu = getArgent();
		perdreArgent(argentPerdu);
		reputation--;
		parler("J’ai perdu mon duel et mes " + argentPerdu + " sous, snif... J'ai déshonoré le clan de " + clan + ".");
		return argentPerdu;
	}
	
	public void gagner(int gain) {
		gagnerArgent(gain);
		reputation++;
		parler("Ce ronin pensait vraiment battre " + getNom() + " du clan de " + clan + "? Je l'ai dépouillé de ses " 
				+ gain + " sous.");
	}
}
