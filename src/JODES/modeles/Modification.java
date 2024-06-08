package JODES.modeles;
import java.time.LocalDate;
import java.time.LocalTime;
import JODES.JO2024;

/**
 * @author Nicolas Vouilloux
 */
public class Modification {

	protected LocalDate dateModif;
	protected LocalTime heureModif;
	protected Entite sonEntite;
	protected Administrateur sonAdmin;
	protected String typeModif;
	public static final String DELETE = "DELETE";
	public static final String UPDATE = "UPDATE";
	public static final String CREATE = "CREATE";
	
	// ----------- Constructors -----------
	
	public Modification(Entite sonEntite, Administrateur sonAdmin, String typeModif) {
		this.dateModif = LocalDate.now();
		this.heureModif = LocalTime.now();
		this.sonEntite = sonEntite;
		this.sonAdmin = sonAdmin;
		this.typeModif = typeModif;
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

	public String getTypeModif() {
		return typeModif;
	}

	public void setTypeModif(String typeModif) {
		this.typeModif = typeModif;
	}
	
	// ----------- Methods -----------

	/**
	 * @author Ash Merienne
	 */
	protected void envoyerModifServeur() {
		int index;
		if (this.typeModif == DELETE) {
			JO2024.removeEntite(sonEntite);
		}
		else if (this.typeModif == UPDATE) {
			index = JO2024.rechercheEntite(this.sonEntite.getIdEntite()).getIdEntite();
			JO2024.sesEntites.set(index, sonEntite);
		}
		else JO2024.addEntite(sonEntite);
	}
}