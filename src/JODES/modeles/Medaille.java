package JODES.modeles;

/**
 * @author Visual Paradigm
 */
public class Medaille extends Entite {

	protected Athlete sonAthlète;
	protected String valeur;
	public static final String OR = "Or";
	public static final String ARGENT = "Argent";
	public static final String BRONZE = "Bronze";
	public static final String PARTICIPATION = "Participation";
	
	// ----------- Constructors -----------
	
	public Medaille(String nom, String valeur, Athlete sonAthlète) {
		super(nom);
		this.valeur = valeur;
		this.sonAthlète = sonAthlète;
	}
	
	// ----------- Getters & setters -----------
	
	public Athlete getSonAthlète() {
		return sonAthlète;
	}

	public void setSonAthlète(Athlete sonAthlète) {
		this.sonAthlète = sonAthlète;
	}

	public String getValeur() {
		return valeur;
	}

	public void setValeur(String valeur) {
		this.valeur = valeur;
	}
	
	// ----------- Methods -----------

	@Override
	public void menuModification() {
		return;
	}

	@Override
	public void menuModificationVisuel() {
		return;
	}
}