/*
 * 
 */
package JODES.modeles;
import java.util.*;
import JODES.JO2024;


/**
 * The Class Utilisateur.
 *
 * @author Nicolas Vouilloux
 */
public class Utilisateur {

	/** The id utilisateur. */
	protected final int idUtilisateur;
	
	/** The last id. */
	protected static int lastId = 1;
	
	/** The login. */
	protected String login;
	
	/** The password. */
	protected String password;
	
	/** The prenom. */
	protected String prenom;
	
	/** The nom. */
	protected String nom;

	// ----------- Constructors -----------
	
	/**
	 * Instantiates a new utilisateur.
	 *
	 * @param login the login
	 * @param password the password
	 * @param prenom the prenom
	 * @param nom the nom
	 */
	public Utilisateur(String login, String password, String prenom, String nom) {
		this.idUtilisateur = lastId++;
		setLogin(login);
		this.password = password;
		this.prenom = prenom;
		this.nom = nom;
	}
	
	// ----------- Getters & setters -----------
	
	/**
	 * Gets the login.
	 *
	 * @return the login
	 */
	public String getLogin() {
		return login;
	}

	/**
	 * Sets the login.
	 * @author Nicolas Vouilloux
	 * @param login the new login
	 */
	public void setLogin(String login) {
		Locale unicode = Locale.FRANCE;
		for (Utilisateur user : JO2024.getSesUtilisateurs()) {
			if(login.toUpperCase(unicode)==user.login.toUpperCase(unicode)) {
				System.out.println("erreur login deja existant");
				return;
			}
		}
		this.login = login;
	}

	/**
	 * Gets the password.
	 *
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * Sets the password.
	 *
	 * @param password the new password
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * Gets the prenom.
	 *
	 * @return the prenom
	 */
	public String getPrenom() {
		return prenom;
	}

	/**
	 * Sets the prenom.
	 *
	 * @param prenom the new prenom
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	/**
	 * Gets the nom.
	 *
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * Sets the nom.
	 *
	 * @param nom the new nom
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * Gets the id utilisateur.
	 *
	 * @return the id utilisateur
	 */
	public int getIdUtilisateur() {
		return idUtilisateur;
	}
	
	// ----------- Methods -----------
	
	/**
	 * To string.
	 *
	 * @return the string
	 */
	@Override
	public String toString() {
		return "Utilisateur [idUtilisateur=" + idUtilisateur + ", login=" + login + ", password=" + password
				+ ", prenom=" + prenom + ", nom=" + nom + "]";
	}

	/**
	 * Connexion.
	 *
	 * @param motDePasse the mot de passe
	 * @return true, if successful
	 */
	public boolean connexion(String motDePasse) {
		return motDePasse == this.password;
	}

}