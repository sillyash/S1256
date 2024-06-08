package JODES.modeles;
import java.io.Serializable;
import java.util.ArrayList;

/**
 * @author Nicolas Vouilloux
 */
public class Administrateur extends Utilisateur implements Serializable {

	private static final long serialVersionUID = 1L;
	ArrayList<Modification> sesModifications;
	
	// ----------- Constructors -----------
	
	public Administrateur(String login, String password, String prenom, String nom) {
		super(login, password, prenom, nom);
		this.sesModifications = new ArrayList<Modification>();
	}
	
	// ----------- Getters & setters -----------
	
	public ArrayList<Modification> getSesModifications() {
		return sesModifications;
	}

	public void setSesModifications(ArrayList<Modification> sesModifications) {
		this.sesModifications = sesModifications;
	}
	
	// ----------- Methods -----------
	
	public void enregisterModifications() {
		// - Nicolas Vouilloux
		for (int i=0; i<sesModifications.size(); i++){
			sesModifications.get(i).envoyerModifServeur();
			this.sesModifications.remove(i);
		}
	}

	public void modifierEntite(Entite entite) {
		// - Nicolas Vouilloux
		Modification Modif = new Modification(entite,this,Modification.UPDATE);
		sesModifications.add(Modif);
	}

	public void annulerModifications(Modification modification) {
		// - Nicolas Vouilloux
		for (Modification modif : sesModifications){
			if (modif == modification)
				sesModifications.remove(modif);
		}
	}

	public void creerEntite(Entite entite) {
		// - Nicolas Vouilloux
		Modification modif = new Modification(entite,this,Modification.CREATE);
		this.sesModifications.add(modif);
	}

	public void supprimerEntite(Entite entite) {
		// - Nicolas Vouilloux
		Modification modif = new Modification(entite,this,Modification.DELETE);
		this.sesModifications.add(modif);
	}
}