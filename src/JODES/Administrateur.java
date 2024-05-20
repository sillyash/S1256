package JODES;

import java.util.ArrayList;

public class Administrateur extends Utilisateur {

	ArrayList<Modification> sesModifications;
	
	// ----------- Constructors -----------
	
	public Administrateur(String login, int password, String prenom, String nom) {
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
	
	protected void enregisterModification(Entite entiteModifiee) {
		// TODO - implement Administrateur.enregisterModification
		throw new UnsupportedOperationException();
	}

	protected void modifierEntite(Entite entite) {
		// TODO - implement Administrateur.modifierEntite
		throw new UnsupportedOperationException();
	}

	protected void annulerModification(Modification modification) {
		// TODO - implement Administrateur.annulerModification
		throw new UnsupportedOperationException();
	}

	protected Entite creerEntite() {
		// TODO - implement Administrateur.creerEntite
		throw new UnsupportedOperationException();
	}

	protected void supprimerEntite(Entite entite) {
		// TODO - implement Administrateur.supprimerEntite
		throw new UnsupportedOperationException();
	}

}