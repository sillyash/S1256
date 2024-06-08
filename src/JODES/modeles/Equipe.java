/*
 * 
 */
package JODES.modeles;
import java.util.*;


/**
 * The Class Equipe.
 *
 * @author Visual Paradigm
 */
public class Equipe extends Entite {

	/** The ses athletes. */
	protected ArrayList<Athlete> sesAthletes;
	
	/** The son pays. */
	protected Pays sonPays;
	
	// ----------- Constructors -----------
	
	/**
	 * Instantiates a new equipe.
	 *
	 * @param nom the nom
	 * @param sonPays the son pays
	 * @param sesAthletes the ses athletes
	 */
	public Equipe(String nom, Pays sonPays, ArrayList<Athlete> sesAthletes) {
		super(nom);
		this.sesAthletes = sesAthletes;
		this.sonPays = sonPays;
	}
	
	/**
	 * Instantiates a new equipe.
	 *
	 * @param nom the nom
	 * @param sonPays the son pays
	 */
	public Equipe(String nom, Pays sonPays) {
		this(nom, sonPays, new ArrayList<Athlete>());
	}
	
	// ----------- Getters & setters -----------
	
	/**
	 * Gets the ses athletes.
	 *
	 * @return the ses athletes
	 */
	public ArrayList<Athlete> getSesAthletes() {
		return sesAthletes;
	}

	/**
	 * Sets the ses athletes.
	 *
	 * @param sesAthletes the new ses athletes
	 */
	public void setSesAthletes(ArrayList<Athlete> sesAthletes) {
		this.sesAthletes = sesAthletes;
	}

	/**
	 * Gets the son pays.
	 *
	 * @return the son pays
	 */
	public Pays getSonPays() {
		return sonPays;
	}

	/**
	 * Sets the son pays.
	 *
	 * @param sonPays the new son pays
	 */
	public void setSonPays(Pays sonPays) {
		this.sonPays = sonPays;
	}

}