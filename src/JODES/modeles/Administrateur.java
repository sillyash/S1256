/*
 * 
 */
package JODES.modeles;
import java.io.Serializable;
import java.util.ArrayList;


/**
 * The Class Administrateur.
 *
 * @author Nicolas Vouilloux
 */
public class Administrateur extends Utilisateur implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;
	
	/** The ses modifications. */
	ArrayList<Modification> sesModifications;
	
	// ----------- Constructors -----------
	
	/**
	 * Instantiates a new administrateur.
	 *
	 * @param login the login
	 * @param password the password
	 * @param prenom the prenom
	 * @param nom the nom
	 */
	public Administrateur(String login, String password, String prenom, String nom) {
		super(login, password, prenom, nom);
		this.sesModifications = new ArrayList<Modification>();
	}
	
	// ----------- Getters & setters -----------
	
	/**
	 * Gets the ses modifications.
	 *
	 * @return the ses modifications
	 */
	public ArrayList<Modification> getSesModifications() {
		return sesModifications;
	}

	/**
	 * Sets the ses modifications.
	 *
	 * @param sesModifications the new ses modifications
	 */
	public void setSesModifications(ArrayList<Modification> sesModifications) {
		this.sesModifications = sesModifications;
	}
	
	// ----------- Methods -----------
	
	/**
	 * Enregister modifications.
	 */
	public void enregisterModifications() {
		// - Nicolas Vouilloux
		for (int i=0; i<sesModifications.size(); i++){
			sesModifications.get(i).envoyerModifServeur();
			this.sesModifications.remove(i);
		}
	}

	/**
	 * Modifier entite.
	 *
	 * @param entiteOld the entite old
	 * @param entiteNew the entite new
	 */
	public void modifierEntite(Entite entiteOld, Entite entiteNew) {
		// - Nicolas Vouilloux
		Modification Modif = new Modification(entiteOld, entiteNew, this, Modification.UPDATE);
		sesModifications.add(Modif);
	}

	/**
	 * Annuler modifications.
	 *
	 * @param modification the modification
	 */
	public void annulerModifications(Modification modification) {
		// - Nicolas Vouilloux
		for (Modification modif : sesModifications){
			if (modif == modification)
				sesModifications.remove(modif);
		}
	}

	/**
	 * Creer entite.
	 *
	 * @param entite the entite
	 */
	public void creerEntite(Entite entite) {
		// - Nicolas Vouilloux
		Modification modif = new Modification(entite,this,Modification.CREATE);
		this.sesModifications.add(modif);
	}

	/**
	 * Supprimer entite.
	 *
	 * @param entite the entite
	 */
	public void supprimerEntite(Entite entite) {
		// - Nicolas Vouilloux
		Modification modif = new Modification(entite,this,Modification.DELETE);
		this.sesModifications.add(modif);
	}
}