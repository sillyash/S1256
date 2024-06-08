/*
 * 
 */
package JODES.modeles;
import java.time.LocalDate;
import java.time.LocalTime;


/**
 * The Class Session.
 *
 * @author Visual Paradigm
 */
public class Session extends Entite {

	/** The Constant FINALE. */
	public static final String FINALE = "finale";
	
	/** The Constant DEMIE. */
	public static final String DEMIE = "demie finale";
	
	/** The Constant QUART. */
	public static final String QUART = "quart de finale";
	
	/** The Constant HUITIEME. */
	public static final String HUITIEME = "huitième de finale";
	
	/** The Constant QUALIF. */
	public static final String QUALIF = "qualifications";
    
    /** The Constant AMICAL. */
    public static final String AMICAL = "amical";
    
    /** The statut. */
    protected String statut;
	
	/** The sa saison. */
	protected Saison saSaison;
	
	/** The horaire debut. */
	protected LocalTime horaireDebut;
	
	/** The horaire fin. */
	protected LocalTime horaireFin;
	
	/** The date. */
	protected LocalDate date;
	
	/** The son lieu. */
	protected Lieu sonLieu;
	
	/** The sa discipline. */
	protected Discipline saDiscipline;

	// ----------- Constructors -----------

	/**
	 * Instantiates a new session.
	 *
	 * @param nom the nom
	 * @param statut the statut
	 * @param saSaison the sa saison
	 * @param horaireDebut the horaire debut
	 * @param horaireFin the horaire fin
	 * @param date the date
	 * @param sonLieu the son lieu
	 * @param saDiscipline the sa discipline
	 */
	public Session(String nom, String statut, Saison saSaison, LocalTime horaireDebut,
			LocalTime horaireFin, LocalDate date, Lieu sonLieu, Discipline saDiscipline) {
		super(nom);
		this.setStatut(statut);
		this.saSaison = saSaison;
		this.horaireDebut = horaireDebut;
		this.horaireFin = horaireFin;
		this.date = date;
		this.sonLieu = sonLieu;
		this.saDiscipline = saDiscipline;
	}

	// ----------- Getters & setters -----------

	/**
	 * Gets the statut.
	 *
	 * @return the statut
	 */
	public String getStatut() {
		return statut;
	}

	/**
	 * Sets the statut.
	 *
	 * @author Ash Merienne
	 * @param statut the new statut
	 */
    public void setStatut(String statut) {
        if (statut == QUALIF || statut == HUITIEME || statut == QUART
            || statut == DEMIE || statut == FINALE)
            this.statut = statut;
        else this.statut = AMICAL;
    }

	

	/**
	 * Gets the sa saison.
	 *
	 * @return the sa saison
	 */
	public Saison getSaSaison() {
		return saSaison;
	}

	/**
	 * Sets the sa saison.
	 *
	 * @param saSaison the new sa saison
	 */
	public void setSaSaison(Saison saSaison) {
		this.saSaison = saSaison;
	}

	/**
	 * Gets the horaire debut.
	 *
	 * @return the horaire debut
	 */
	public LocalTime getHoraireDebut() {
		return horaireDebut;
	}

	/**
	 * Sets the horaire debut.
	 *
	 * @param horaireDebut the new horaire debut
	 */
	public void setHoraireDebut(LocalTime horaireDebut) {
		this.horaireDebut = horaireDebut;
	}

	/**
	 * Gets the horaire fin.
	 *
	 * @return the horaire fin
	 */
	public LocalTime getHoraireFin() {
		return horaireFin;
	}

	/**
	 * Sets the horaire fin.
	 *
	 * @param horaireFin the new horaire fin
	 */
	public void setHoraireFin(LocalTime horaireFin) {
		this.horaireFin = horaireFin;
	}

	/**
	 * Gets the date.
	 *
	 * @return the date
	 */
	public LocalDate getDate() {
		return date;
	}

	/**
	 * Sets the date.
	 *
	 * @param date the new date
	 */
	public void setDate(LocalDate date) {
		this.date = date;
	}

	/**
	 * Gets the son lieu.
	 *
	 * @return the son lieu
	 */
	public Lieu getSonLieu() {
		return sonLieu;
	}

	/**
	 * Sets the son lieu.
	 *
	 * @param sonLieu the new son lieu
	 */
	public void setSonLieu(Lieu sonLieu) {
		this.sonLieu = sonLieu;
	}

	/**
	 * Gets the sa discipline.
	 *
	 * @return the sa discipline
	 */
	public Discipline getSaDiscipline() {
		return saDiscipline;
	}

	/**
	 * Sets the sa discipline.
	 *
	 * @param saDiscipline the new sa discipline
	 */
	public void setSaDiscipline(Discipline saDiscipline) {
		this.saDiscipline = saDiscipline;
	}
	
	// ----------- Methods -----------

	/**
	 * Gets the longueur en demi heure.
	 *
	 * @return the longueur en demi heure
	 */
	public int getLongueurEnDemiHeure() {
		int minutesDeb, minutesFin;
		minutesDeb = horaireDebut.getHour()*60 + horaireDebut.getMinute();
		minutesFin = horaireFin.getHour()*60 + horaireFin.getMinute();
		return (minutesFin - minutesDeb)/30;
	}
}