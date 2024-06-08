/*
 * 
 */
package JODES.modeles;
import java.time.LocalDate;


/**
 * The Class Saison.
 *
 * @author Visual Paradigm
 */
public class Saison extends Entite {

	/** The date debut. */
	protected LocalDate dateDebut;
	
	/** The date fin. */
	protected LocalDate dateFin;

	// ----------- Constructors -----------
	
	/**
	 * Instantiates a new saison.
	 *
	 * @param nom the nom
	 * @param dateDebut the date debut
	 * @param dateFin the date fin
	 */
	public Saison(String nom, LocalDate dateDebut, LocalDate dateFin) {
		super(nom);
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
	}
	
	// ----------- Getters & setters -----------
	
	/**
	 * Gets the date debut.
	 *
	 * @return the date debut
	 */
	public LocalDate getDateDebut() {
		return dateDebut;
	}

	/**
	 * Sets the date debut.
	 *
	 * @param dateDebut the new date debut
	 */
	public void setDateDebut(LocalDate dateDebut) {
		this.dateDebut = dateDebut;
	}

	/**
	 * Gets the date fin.
	 *
	 * @return the date fin
	 */
	public LocalDate getDateFin() {
		return dateFin;
	}

	/**
	 * Sets the date fin.
	 *
	 * @param dateFin the new date fin
	 */
	public void setDateFin(LocalDate dateFin) {
		this.dateFin = dateFin;
	}
}