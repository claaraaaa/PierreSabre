package personnages;
import java.util.Random;


public class GrandMere extends Humains {
	private static final int MEMOIRE_MAX = 5;
	private static final TypeHumain[] TYPE = TypeHumain.values();
	
	public GrandMere(String nom, int argent) {
		super(nom, "tisane", argent);
	}
	
	@Override
	protected void memoriser(Humains humain) {
		if (nbConnaissance < MEMOIRE_MAX) {
			super.memoriser(humain);
		} else {
			parler("Oh ma tête ! Je ne peux plus retenir le nom d'une personne supplémentaire !");
		}
	}
	
	private String humainHasard() {
		 Random rand = new Random();
		 int index = rand.nextInt(TYPE.length);
		 return TYPE[index].toString();
	}
	
	public void ragoter() {
		for (int i=0; i<nbConnaissance; i++) {
			String nom = memoire[i].getNom();
			if (memoire[i] instanceof Traitre) {
				parler("Je sais que " + nom + " est un traître. Petit chenapan !");
			} else {
				String pers = humainHasard();
				if (pers == "grand-mère") {
					parler("Je crois que " + nom + " est une " + pers);
				} else {
					parler("Je crois que " + nom + " est un " + pers);
				}
				
			}
		}
	}
}
