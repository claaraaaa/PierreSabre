package personnages;

public enum TypeHumain {
	RONIN("ronin"), GRANDMERE("grand-mère"), YAKUZA("yakuza"),
	HUMAINS("habitant"), SAMOURAI("samouraï"), COMMERCANT("commerçant");
	
	private String nom;
	
	private TypeHumain(String nom) {
		this.nom = nom;
	}
	
	public String toString() {
		return nom;
	}
}
