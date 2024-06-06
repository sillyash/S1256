package JODES;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Locale;

import javax.xml.crypto.Data;

import JODES.modeles.*;

/**
 * @author Ash Merienne
 */
public class JO2024 {

	public static ArrayList<Entite> sesEntites = new ArrayList<Entite>();
	protected static ArrayList<Utilisateur> sesUtilisateurs = new ArrayList<Utilisateur>();
	
	public static final ArrayList<Pays> PAYS = new ArrayList<>();
	public static final ArrayList<Discipline> DISCIPLINES = new ArrayList<>();
	
	public static final LocalDate dateDebutJO = LocalDate.of(2024, Month.JULY, 12);
	public static final LocalDate dateFinJO = LocalDate.of(2024, Month.JULY, 30);
	public static final Saison Paris2024 = new Saison("2024 Paris Summer Olympics", dateDebutJO, dateFinJO);
	
	// ----------- Getters & setters -----------
	
	public static ArrayList<Entite> getSesEntites() {
		return sesEntites;
	}

	public static void setSesEntites(ArrayList<Entite> sesEntites) {
		JO2024.sesEntites = sesEntites;
	}

	public static ArrayList<Utilisateur> getSesUtilisateurs() {
		return sesUtilisateurs;
	}

	public static void setSesUtilisateurs(ArrayList<Utilisateur> sesUtilisateurs) {
		JO2024.sesUtilisateurs = sesUtilisateurs;
	}
	
	public static void addEntite(Entite entite) {
		sesEntites.add(entite);
	}
	
	public static void removeEntite(Entite entite) {
		sesEntites.remove(entite);
	}
	
	// ----------- Methods -----------
	/**
	 * @author Nicolas Vouilloux
	 */
	public static int demandeConnexion(String login, String motDePasse) {
		Locale unicode = Locale.FRANCE;
		for (Utilisateur user : sesUtilisateurs)
		{
			if (user.getLogin().toUpperCase(unicode) == login.toUpperCase(unicode))
			{
				if (user.connexion(motDePasse)) {
					return 1;
				}
				else return -1;
			}
		}
		return 0;
	}

	/**
	 * @author Ash Merienne
	 */
	public static Entite rechercheEntite(String nomEntite) {
		nomEntite = nomEntite.toUpperCase();
		for (Entite entite : sesEntites) {
			if (entite.getNom().toUpperCase().contains(nomEntite))
			{
				return entite;
			}
		}
		return null;
	}
	
	/**
	 * @author Ash Merienne
	 */
	public static Entite rechercheEntite(int idEntite) {
		for (Entite entite : sesEntites) {
			if (entite.getIdEntite() == idEntite)
			{
				return entite;
			}
		}
		return null;
	}
	
	/**
	 * @author Nicolas Vouilloux
	 */
	public static Utilisateur rechercheUtilisateur(String login) {
		Locale unicode = Locale.FRANCE;
		for (Utilisateur user : sesUtilisateurs) {
			if(user.getLogin().toUpperCase(unicode) == login.toUpperCase(unicode)) {
				return user;
			}
		}
		return null;
	}

	/**
	 * @author Ash Merienne
	 */
	public static Entite rechercheEntite(String nomEntite, String typeEntite) {
		nomEntite = nomEntite.toUpperCase();
		for (Entite entite : sesEntites) {
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

	public static ArrayList<Athlete> getAthletes()
	{
		ArrayList<Athlete> athletes = new ArrayList<>();
		for (Entite e : sesEntites)
		{
			if (DataParser.isAthlete(e))
			{
				athletes.add((Athlete)e);
			}
		}
		return athletes;
	}

	public static ArrayList<Session> getSessions()
	{
		ArrayList<Session> sessions = new ArrayList<>();
		for (Entite e : sesEntites)
		{
			if (DataParser.isSession(e))
			{
				sessions.add((Session)e);
			}
		}
		return sessions;
	}

	public static ArrayList<Epreuve> getEpreuves()
	{
		ArrayList<Epreuve> epreuves = new ArrayList<>();
		for (Entite e : sesEntites)
		{
			if (DataParser.isSession(e))
			{
				epreuves.add((Epreuve)e);
			}
		}
		return epreuves;
	}

	public static ArrayList<Pays> getPays()
	{
		ArrayList<Pays> pays = new ArrayList<>();
		for (Entite e : sesEntites)
		{
			if (DataParser.isSession(e))
			{
				pays.add((Pays)e);
			}
		}
		return pays;
	}

	public static ArrayList<Discipline> getDisciplines()
	{
		ArrayList<Discipline> disciplines = new ArrayList<>();
		for (Entite e : sesEntites)
		{
			if (DataParser.isSession(e))
			{
				disciplines.add((Discipline)e);
			}
		}
		return disciplines;
	}
}