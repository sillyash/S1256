package JODES.modeles;

import java.util.*;

public class Utilisateur {

	protected final int idUtilisateur;
	protected static int lastId = 1;
	protected String login;
	protected String password;
	protected String prenom;
	protected String nom;

	// ----------- Constructors -----------
	
	public Utilisateur(String login, String password, String prenom, String nom) {
		this.idUtilisateur = lastId++;
		this.login = login;
		this.password = password;
		this.prenom = prenom;
		this.nom = nom;
	}
	
	// ----------- Getters & setters -----------
	
	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getIdUtilisateur() {
		return idUtilisateur;
	}
	
	// ----------- Methods -----------
	
	@Override
	public String toString() {
		return "Utilisateur [idUtilisateur=" + idUtilisateur + ", login=" + login + ", password=" + password
				+ ", prenom=" + prenom + ", nom=" + nom + "]";
	}

	public boolean connexion(String motDePasse) {
		return motDePasse == this.password;
	}

}