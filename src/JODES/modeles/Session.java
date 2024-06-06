package JODES.modeles;
import java.time.LocalDate;
import java.time.LocalTime;

/**
 * @author Visual Paradigm
 */
public class Session extends Entite {

	protected Session session;
	protected Saison saSaison;
	protected LocalTime horaireDebut;
	protected LocalTime horaireFin;
	protected LocalDate date;

	// ----------- Constructors -----------
	
	public Session(String nom, Session session, Saison saSaison, LocalDate date, LocalTime horaireDebut, LocalTime horaireFin) {
		super(nom);
		this.session = session;
		this.saSaison = saSaison;
		this.date = date;
	}
	
	// ----------- Getters & setters -----------
	
	public LocalTime getHoraireDebut() {
		return horaireDebut;
	}
	
	public void setHoraireDebut(LocalTime horaireDebut) {
		this.horaireDebut = horaireDebut;
	}
	
	public LocalTime getHoraireFin() {
		return horaireFin;
	}
	
	public void setHoraireFin(LocalTime horaireFin) {
		this.horaireFin = horaireFin;
	}
	
	public void setSession(Session session) {
		this.session = session;
	}
	
	public Saison getSaSaison() {
		return saSaison;
	}
	
	public void setSaSaison(Saison saSaison) {
		this.saSaison = saSaison;
	}
	
	// ----------- Methods -----------

	@Override
	public void menuModification() {
		return;
	}

	@Override
	public void menuModificationVisuel() {
		return;
	}

}