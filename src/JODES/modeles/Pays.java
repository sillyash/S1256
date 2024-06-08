/*
 * 
 */
package JODES.modeles;

// TODO: Auto-generated Javadoc
/**
 * The Class Pays.
 *
 * @author Visual Paradigm
 */
public class Pays extends Entite {
	
	/** The code pays. */
	protected String codePays; // FRA, USA, GER...

	// ----------- Constructors -----------
	
	/**
	 * Instantiates a new pays.
	 *
	 * @param nom the nom
	 * @param codePays the code pays
	 */
	public Pays(String nom, String codePays) {
		super(nom);
		this.codePays = codePays;
	}
	
	// ----------- Getters & setters -----------
	
	/**
	 * Gets the code pays.
	 *
	 * @return the code pays
	 */
	public String getCodePays() {
		return codePays;
	}

	/**
	 * Sets the code pays.
	 *
	 * @param codePays the new code pays
	 */
	public void setCodePays(String codePays) {
		this.codePays = codePays;
	}
}