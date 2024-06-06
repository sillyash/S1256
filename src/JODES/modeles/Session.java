package JODES.modeles;
import java.time.LocalDate;

/**
 * @author Ash Merienne
 */
public class Session {
    
	public static final String FINALE = "finale";
	public static final String DEMIE = "demie finale";
	public static final String QUART = "quart de finale";
	public static final String HUITIEME = "huitième de finale";
	public static final String QUALIF = "qualifications";
	protected Lieu sonLieu;
	protected Discipline saDiscipline;
	protected LocalDate date;
    
    // ----------- Constructors -----------

    public Session(Lieu sonLieu, Discipline saDiscipline, LocalDate date) {
        this.sonLieu = sonLieu;
        this.saDiscipline = saDiscipline;
        this.date = date;
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

    // ----------- Methods -----------

    
}
