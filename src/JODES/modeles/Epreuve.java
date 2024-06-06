package JODES.modeles;
import java.time.LocalTime;

/**
 * @author Visual Paradigm
 */
public class Epreuve extends Entite {

	protected LocalTime horaireDebut;
	protected LocalTime horaireFin;
	protected Session session;
	protected Saison saSaison;

	// ----------- Constructors -----------
	
	public Epreuve(String nom, LocalTime horaireDebut, LocalTime horaireFin, Session session, Saison saSaison) {
		super(nom);
		this.horaireDebut = horaireDebut;
		this.horaireFin = horaireFin;
		this.session = session;
		this.saSaison = saSaison;
	}
	public Epreuve(String nom, LocalTime horaireDebut, LocalTime horaireFin, Session session) {
		super(nom);
		this.horaireDebut = horaireDebut;
		this.horaireFin = horaireFin;
		this.session = session;
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