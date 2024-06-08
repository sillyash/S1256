/*
 * 
 */
package JODES.modeles;
import java.time.LocalDate;
import java.time.LocalTime;
import JODES.JO2024;

// TODO: Auto-generated Javadoc
/**
 * The Class Modification.
 *
 * @author Nicolas Vouilloux
 */
public class Modification {

	/** The date modif. */
	protected LocalDate dateModif;
	
	/** The heure modif. */
	protected LocalTime heureModif;
	
	/** The son entite. */
	protected Entite sonEntite;
	
	/** The entite new. */
	protected Entite entiteNew;
	
	/** The son admin. */
	protected Administrateur sonAdmin;
	
	/** The type modif. */
	protected String typeModif;
	
	/** The Constant DELETE. */
	public static final String DELETE = "DELETE";
	
	/** The Constant UPDATE. */
	public static final String UPDATE = "UPDATE";
	
	/** The Constant CREATE. */
	public static final String CREATE = "CREATE";
	
	// ----------- Constructors -----------
	
	/**
	 * Instantiates a new modification.
	 *
	 * @param sonEntite the son entite
	 * @param sonAdmin the son admin
	 * @param typeModif the type modif
	 */
	public Modification(Entite sonEntite, Administrateur sonAdmin, String typeModif) {
		this.dateModif = LocalDate.now();
		this.heureModif = LocalTime.now();
		this.sonEntite = sonEntite;
		this.sonAdmin = sonAdmin;
		this.typeModif = typeModif;
	}

	/**
	 * Instantiates a new modification.
	 *
	 * @param entiteOld the entite old
	 * @param entiteNew the entite new
	 * @param sonAdmin the son admin
	 * @param typeModif the type modif
	 */
	public Modification(Entite entiteOld, Entite entiteNew, Administrateur sonAdmin, String typeModif) {
		this.dateModif = LocalDate.now();
		this.heureModif = LocalTime.now();
		this.sonEntite = entiteOld;
		this.entiteNew = entiteNew;
		this.sonAdmin = sonAdmin;
		this.typeModif = typeModif;
	}
	
	// ----------- Getters & setters -----------
	
	/**
	 * Gets the date modif.
	 *
	 * @return the date modif
	 */
	public LocalDate getDateModif() {
		return dateModif;
	}

	/**
	 * Sets the date modif.
	 *
	 * @param dateModif the new date modif
	 */
	public void setDateModif(LocalDate dateModif) {
		this.dateModif = dateModif;
	}

	/**
	 * Gets the heure modif.
	 *
	 * @return the heure modif
	 */
	public LocalTime getHeureModif() {
		return heureModif;
	}

	/**
	 * Sets the heure modif.
	 *
	 * @param heureModif the new heure modif
	 */
	public void setHeureModif(LocalTime heureModif) {
		this.heureModif = heureModif;
	}

	/**
	 * Gets the son entite.
	 *
	 * @return the son entite
	 */
	public Entite getSonEntite() {
		return sonEntite;
	}

	/**
	 * Sets the son entite.
	 *
	 * @param sonEntite the new son entite
	 */
	public void setSonEntite(Entite sonEntite) {
		this.sonEntite = sonEntite;
	}

	/**
	 * Gets the son admin.
	 *
	 * @return the son admin
	 */
	public Administrateur getSonAdmin() {
		return sonAdmin;
	}

	/**
	 * Sets the son admin.
	 *
	 * @param sonAdmin the new son admin
	 */
	public void setSonAdmin(Administrateur sonAdmin) {
		this.sonAdmin = sonAdmin;
	}

	/**
	 * Gets the type modif.
	 *
	 * @return the type modif
	 */
	public String getTypeModif() {
		return typeModif;
	}

	/**
	 * Sets the type modif.
	 *
	 * @param typeModif the new type modif
	 */
	public void setTypeModif(String typeModif) {
		this.typeModif = typeModif;
	}
	
	// ----------- Methods -----------

	/**
	 * Envoyer modif serveur.
	 *
	 * @author Ash Merienne
	 */
	protected void envoyerModifServeur() {
		int index;
		if (this.typeModif == DELETE) {
			JO2024.removeEntite(sonEntite);
		}
		else if (this.typeModif == UPDATE) {
			Entite recherche = JO2024.rechercheEntite(sonEntite.getIdEntite());
			index = JO2024.getSesEntites().indexOf(recherche);
			JO2024.getSesEntites().set(index, entiteNew);
		}
		else JO2024.addEntite(sonEntite);
	}
}