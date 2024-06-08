/*
 * 
 */
package JODES.modeles;

// TODO: Auto-generated Javadoc
/**
 * The Class Ville.
 *
 * @author Visual Paradigm
 */
public class Ville extends Entite {

	/** The code postal. */
	protected int codePostal;
	
	// ----------- Constructors -----------
	
	/**
	 * Instantiates a new ville.
	 *
	 * @param nom the nom
	 * @param codePostal the code postal
	 */
	public Ville(String nom, int codePostal) {
		super(nom);
		this.codePostal = codePostal;
	}
	
	// ----------- Getters & setters -----------
	
	/**
	 * Gets the code postal.
	 *
	 * @return the code postal
	 */
	public int getCodePostal() {
		return codePostal;
	}

	/**
	 * Sets the code postal.
	 *
	 * @param codePostal the new code postal
	 */
	public void setCodePostal(int codePostal) {
		this.codePostal = codePostal;
	}

}