package JODES;

import java.util.ArrayList;
import JODES.modeles.*;

public class JO2024 {

	public ArrayList<Entite> sesEntites;
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
	
	public void addEntite(Entite entite) {
		this.sesEntites.add(entite);
	}
	
	public void removeEntite(Entite entite) {
		this.sesEntites.remove(entite);
	}
	
	// ----------- Methods -----------
	
	protected int demandeConnexion(String login, String motDePasse) {
		for (Utilisateur user : this.sesUtilisateurs)
		{
			if (user.getLogin() == login)
			{
				if (user.connexion(motDePasse)) {
					return 1;
				}
				else return -1;
			}
		}
		return 0;
	}

	protected Entite rechercheEntite(String nomEntite) {
		nomEntite = nomEntite.toUpperCase();
		for (Entite entite : this.sesEntites) {
			if (entite.getNom().toUpperCase().contains(nomEntite))
			{
				return entite;
			}
		}
		return null;
	}
	
	protected Utilisateur rechercheUtilisateur(String login) {
		// TODO - implement JO2024.rechercheUtilisateur
		throw new UnsupportedOperationException();
	}

	protected Entite rechercheEntite(String nomEntite, String typeEntite) {
		nomEntite = nomEntite.toUpperCase();
		for (Entite entite : this.sesEntites) {
			System.out.println(entite.getClass());
			if (entite.getClass().toString() == typeEntite)
			{
				if (entite.getNom().toUpperCase().contains(nomEntite))
				{
					return entite;
				}
			}
			
		}
		return null;
	}
	
	protected void afficherPlanningSemaine(int numeroSemaine) {
		// TODO - implement JO2024.afficherPlanningSemaine
		throw new UnsupportedOperationException();
	}
	
	public static void main(String args[])
	{
		JO2024 JO = new JO2024();
		Pays FRA = new Pays("France", "FRA");
		Athlete Alain = new Athlete("Alain", "Sandoz", FRA);
		
		JO.addEntite(Alain);
		
		JO.rechercheEntite("alain", "");
	}

}