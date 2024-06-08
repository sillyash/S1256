/*
 * 
 */
package JODES.modeles;


/**
 * The Class CompteAthlete.
 *
 * @author Visual Paradigm
 */
public class CompteAthlete extends Utilisateur {
	
	/** The son athlete. */
	protected Athlete sonAthlete;
	
	// ----------- Constructors -----------
	
	/**
	 * Instantiates a new compte athlete.
	 *
	 * @param login the login
	 * @param password the password
	 * @param prenom the prenom
	 * @param nom the nom
	 * @param sonAthlete the son athlete
	 */
	public CompteAthlete(String login, String password, String prenom, String nom, Athlete sonAthlete) {
		super(login, password, prenom, nom);
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
}