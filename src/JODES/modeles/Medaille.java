/*
 * 
 */
package JODES.modeles;

// TODO: Auto-generated Javadoc
/**
 * The Class Medaille.
 *
 * @author Visual Paradigm
 */
public class Medaille extends Entite {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;
	
	/** The son athlete. */
	protected Athlete sonAthlete;
	
	/** The valeur. */
	protected String valeur;
	
	/** The Constant OR. */
	public static final String OR = "Or";
	
	/** The Constant ARGENT. */
	public static final String ARGENT = "Argent";
	
	/** The Constant BRONZE. */
	public static final String BRONZE = "Bronze";
	
	/** The Constant PARTICIPATION. */
	public static final String PARTICIPATION = "Participation";
	
	// ----------- Constructors -----------
	
	/**
	 * Instantiates a new medaille.
	 *
	 * @param nom the nom
	 * @param valeur the valeur
	 * @param sonAthlete the son athlete
	 */
	public Medaille(String nom, String valeur, Athlete sonAthlete) {
		super(nom);
		this.valeur = valeur;
		this.sonAthlete = sonAthlete;
	}
	
	// ----------- Getters & setters -----------
	
	/**
	 * Gets the son athlete.
	 *
	 * @return the son athlete
	 */
	public Athlete getSonAthlete() {
		return sonAthlete;
	}

	/**
	 * Sets the son athlete.
	 *
	 * @param sonAthlete the new son athlete
	 */
	public void setSonAthlete(Athlete sonAthlete) {
		this.sonAthlete = sonAthlete;
	}

	/**
	 * Gets the valeur.
	 *
	 * @return the valeur
	 */
	public String getValeur() {
		return valeur;
	}

	/**
	 * Sets the valeur.
	 *
	 * @param valeur the new valeur
	 */
	public void setValeur(String valeur) {
		this.valeur = valeur;
	}
}