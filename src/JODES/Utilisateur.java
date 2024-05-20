package JODES;

import java.util.*;

public class Utilisateur {

	protected final int idUtilisateur;
	protected static int lastId = 1;
	protected String login;
	protected int password;
	protected String prenom;
	protected String nom;

	// ----------- Constructors -----------
	
	public Utilisateur(String login, int password, String prenom, String nom) {
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

	public int getPassword() {
		return password;
	}

	public void setPassword(int password) {
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

	protected boolean connexion(String motDePasse) {
		// TODO - implement Utilisateur.connexion
		throw new UnsupportedOperationException();
	}

}