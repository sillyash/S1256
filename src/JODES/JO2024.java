package JODES;

import java.util.ArrayList;

public class JO2024 {

	ArrayList<Entite> sesEntites;
	protected ArrayList<Utilisateur> sesUtilisateurs;
	
	// ----------- Constructors -----------
	
	public JO2024() {
		this.sesEntites = new ArrayList<Entite>();
		this.sesUtilisateurs = new ArrayList<Utilisateur>();
	}
	
	// ----------- Getters & setters -----------
	
	public ArrayList<Entite> getSesEntites() {
		return sesEntites;
	}

	public void setSesEntites(ArrayList<Entite> sesEntites) {
		this.sesEntites = sesEntites;
	}

	public ArrayList<Utilisateur> getSesUtilisateurs() {
		return sesUtilisateurs;
	}

	public void setSesUtilisateurs(ArrayList<Utilisateur> sesUtilisateurs) {
		this.sesUtilisateurs = sesUtilisateurs;
	}
	
	// ----------- Methods -----------
	
	protected int demandeConnexion(String login, String motDePasse) {
		// TODO - implement JO2024.demandeConnexion
		throw new UnsupportedOperationException();
	}

	protected Entite rechercheEntite(String nomEntite) {
		// TODO - implement JO2024.rechercheEntite
		throw new UnsupportedOperationException();
	}


	protected Utilisateur rechercheUtilisateur(String login) {
		// TODO - implement JO2024.rechercheUtilisateur
		throw new UnsupportedOperationException();
	}


	protected Entite rechercheEntite(String nomEntite, String typeEntite) {
		// TODO - implement JO2024.rechercheEntite
		throw new UnsupportedOperationException();
	}


	protected void afficherPlanningSemaine(int numeroSemaine) {
		// TODO - implement JO2024.afficherPlanningSemaine
		throw new UnsupportedOperationException();
	}

}