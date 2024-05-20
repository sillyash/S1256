package JODES.modeles;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.*;

public class Modification {

	protected LocalDate dateModif;
	protected LocalTime heureModif;
	protected Entite sonEntite;
	protected Administrateur sonAdmin;
	
	// ----------- Constructors -----------
	
	public Modification(LocalDate dateModif, LocalTime heureModif, Entite sonEntite, Administrateur sonAdmin) {
		this.dateModif = dateModif;
		this.heureModif = heureModif;
		this.sonEntite = sonEntite;
		this.sonAdmin = sonAdmin;
	}
	
	public Modification(Entite sonEntite, Administrateur sonAdmin) {
		this.dateModif = LocalDate.now();
		this.heureModif = LocalTime.now();
		this.sonEntite = sonEntite;
		this.sonAdmin = sonAdmin;
	}
	
	// ----------- Getters & setters -----------
	
	public LocalDate getDateModif() {
		return dateModif;
	}

	public void setDateModif(LocalDate dateModif) {
		this.dateModif = dateModif;
	}

	public LocalTime getHeureModif() {
		return heureModif;
	}

	public void setHeureModif(LocalTime heureModif) {
		this.heureModif = heureModif;
	}

	public Entite getSonEntite() {
		return sonEntite;
	}

	public void setSonEntite(Entite sonEntite) {
		this.sonEntite = sonEntite;
	}

	public Administrateur getSonAdmin() {
		return sonAdmin;
	}

	public void setSonAdmin(Administrateur sonAdmin) {
		this.sonAdmin = sonAdmin;
	}
	
	// ----------- Methods -----------

	protected void envoyerModifServeur() {
		// TODO - implement Modification.envoyerModifServeur
		throw new UnsupportedOperationException();
	}
}