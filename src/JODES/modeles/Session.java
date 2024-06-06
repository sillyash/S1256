package JODES.modeles;
import java.time.LocalDate;

/**
 * @author Ash Merienne
 */
public class Session extends Entite {
    
	public static final String FINALE = "finale";
	public static final String DEMIE = "demie finale";
	public static final String QUART = "quart de finale";
	public static final String HUITIEME = "huitième de finale";
	public static final String QUALIF = "qualifications";
    public static final String AMICAL = "amical";
	protected Lieu sonLieu;
	protected Discipline saDiscipline;
	protected LocalDate date;
    protected String statut;
    
    // ----------- Constructors -----------

    public Session(String nom, Lieu sonLieu, Discipline saDiscipline, LocalDate date, String statut) {
        super(nom);
        this.sonLieu = sonLieu;
        this.saDiscipline = saDiscipline;
        this.date = date;
        setStatut(statut);
    }

    // ----------- Getters & setters -----------

    public Lieu getSonLieu() {
        return sonLieu;
    }

    public void setSonLieu(Lieu sonLieu) {
        this.sonLieu = sonLieu;
    }

    public Discipline getSaDiscipline() {
        return saDiscipline;
    }

    public void setSaDiscipline(Discipline saDiscipline) {
        this.saDiscipline = saDiscipline;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public void setStatut(String statut) {
        if (statut == QUALIF || statut == HUITIEME || statut == QUART
            || statut == DEMIE || statut == FINALE)
            this.statut = statut;
        else this.statut = AMICAL;
    }

    public String getStatut() {
        return this.statut;
    }

    // ----------- Methods ----------

    @Override
    public void menuModification() {
        return;
    }

    @Override
    public void menuModificationVisuel() {
        return;
    }
    
}
