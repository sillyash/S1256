package JODES;

import java.time.LocalDate;
import java.time.LocalTime;

public class Epreuve extends Entite {

	protected LocalDate date;
	protected LocalTime horaireDebut;
	protected LocalTime horaireFin;
	protected String session;
	protected Saison saSaison;
	public static final String FINALE = "finale";
	public static final String DEMIE = "demie finale";
	public static final String QUART = "quart de finale";
	public static final String HUITIEME = "huitième de finale";
	public static final String QUALIF = "qualifications";
	protected Lieu sonLieu;
	protected Discipline saDiscipline;
	
	// ----------- Constructors -----------
	
	public Epreuve(String nom, LocalDate date, LocalTime horaireDebut,
			LocalTime horaireFin, String session, Saison saSaison, 
			Lieu sonLieu, Discipline saDiscipline) {
		super(nom);
		this.date = date;
		this.horaireDebut = horaireDebut;
		this.horaireFin = horaireFin;
		this.session = session;
		this.saSaison = saSaison;
		this.sonLieu = sonLieu;
		this.saDiscipline = saDiscipline;
	}
	
	// ----------- Getters & setters -----------
	
	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}
	
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
	
	public String getSession() {
		return session;
	}
	
	public void setSession(String session) {
		this.session = session;
	}
	
	public Saison getSaSaison() {
		return saSaison;
	}
	
	public void setSaSaison(Saison saSaison) {
		this.saSaison = saSaison;
	}
	
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
	
	// ----------- Methods -----------

}