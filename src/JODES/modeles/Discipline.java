/*
 * 
 */
package JODES.modeles;

// TODO: Auto-generated Javadoc
/**
 * The Class Discipline.
 *
 * @author Visual Paradigm
 */
public class Discipline extends Entite {

	/** The description. */
	protected String description;
	
	// ----------- Constructors -----------
	
	/**
	 * Instantiates a new discipline.
	 *
	 * @param nom the nom
	 * @param description the description
	 */
	public Discipline(String nom, String description) {
		super(nom);
		this.description = description;
	}
	
	/**
	 * Instantiates a new discipline.
	 *
	 * @param nom the nom
	 */
	public Discipline(String nom) {
		this(nom, "");
	}
	
	// ----------- Getters & setters -----------
	
	/**
	 * Gets the description.
	 *
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * Sets the description.
	 *
	 * @param description the new description
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	
}