/*
 * 
 */
package JODES.modeles;


/**
 * The Class Lieu.
 *
 * @author Visual Paradigm
 */
public class Lieu extends Entite {

	/** The sa ville. */
	protected Ville saVille;
	
	/** The code postal. */
	protected int codePostal;
	
	// ----------- Constructors -----------
	
	/**
	 * Instantiates a new lieu.
	 *
	 * @param nom the nom
	 * @param codePostal the code postal
	 * @param saVille the sa ville
	 */
	public Lieu(String nom, int codePostal, Ville saVille) {
		super(nom);
		this.codePostal = codePostal;
		this.saVille = saVille;
	}
	
	/**
	 * Instantiates a new lieu.
	 *
	 * @param nom the nom
	 * @param saVille the sa ville
	 */
	public Lieu(String nom, Ville saVille) {
		this(nom, saVille.getCodePostal(), saVille);
	}
	
	// ----------- Getters & setters -----------
	
	/**
	 * Gets the sa ville.
	 *
	 * @return the sa ville
	 */
	public Ville getSaVille() {
		return saVille;
	}

	/**
	 * Sets the sa ville.
	 *
	 * @param saVille the new sa ville
	 */
	public void setSaVille(Ville saVille) {
		this.saVille = saVille;
	}
}