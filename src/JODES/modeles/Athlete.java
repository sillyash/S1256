/*
 * 
 */
package JODES.modeles;
import java.util.*;


/**
 * The Class Athlete.
 *
 * @author Visual Paradigm
 */
public class Athlete extends Entite {

	/** The ses medailles. */
	protected ArrayList<Medaille> sesMedailles;
	
	/** The ses equipes. */
	protected ArrayList<Equipe> sesEquipes;
	
	/** The ses disciplines. */
	protected ArrayList<Discipline> sesDisciplines;
	
	/** The biographie. */
	protected String biographie;
	
	/** The prenom. */
	protected String prenom;
	
	/** The nom. */
	protected String nom;
	
	/** The son compte. */
	protected CompteAthlete sonCompte;
	
	/** The son pays. */
	protected Pays sonPays;
	
	// ----------- Constructors -----------
	/**
	 * Instantiates a new athlete.
	 *
	 * @author Ash Merienne
	 * @param prenom the prenom
	 * @param nom the nom
	 * @param sonPays the son pays
	 * @param biographie the biographie
	 * @param sesMedailles the ses medailles
	 * @param sesEquipes the ses equipes
	 * @param sesDisciplines the ses disciplines
	 */
	public Athlete (String prenom, String nom, Pays sonPays, String biographie,
			ArrayList<Medaille> sesMedailles, ArrayList<Equipe> sesEquipes,
			ArrayList<Discipline> sesDisciplines) {
		super(prenom + " " + nom);
		this.nom = nom;
		this.sonPays = sonPays;
		this.biographie = biographie;
		this.sesMedailles = sesMedailles;
		this.sesDisciplines = sesDisciplines;
		this.sesEquipes = sesEquipes;
		this.prenom = prenom;
	}
	
	/**
	 * Instantiates a new athlete.
	 *
	 * @param prenom the prenom
	 * @param nom the nom
	 * @param sonPays the son pays
	 * @param biographie the biographie
	 */
	public Athlete (String prenom, String nom, Pays sonPays, String biographie) {
		this(prenom, nom, sonPays, biographie, new ArrayList<Medaille>(),
				new ArrayList<Equipe>(), new ArrayList<Discipline>());
	}

	
	// ----------- Getters & setters -----------
	
	/**
	 * Gets the ses medailles.
	 *
	 * @return the ses medailles
	 */
	public ArrayList<Medaille> getSesMedailles() {
		return sesMedailles;
	}
	

	/**
	 * Sets the ses medailles.
	 *
	 * @param sesMedailles the new ses medailles
	 */
	public void setSesMedailles(ArrayList<Medaille> sesMedailles) {
		this.sesMedailles = sesMedailles;
	}
	

	/**
	 * Gets the ses equipes.
	 *
	 * @return the ses equipes
	 */
	public ArrayList<Equipe> getSesEquipes() {
		return sesEquipes;
	}
	

	/**
	 * Sets the ses equipes.
	 *
	 * @param sesEquipes the new ses equipes
	 */
	public void setSesEquipes(ArrayList<Equipe> sesEquipes) {
		this.sesEquipes = sesEquipes;
	}
	

	/**
	 * Gets the ses disciplines.
	 *
	 * @return the ses disciplines
	 */
	public ArrayList<Discipline> getSesDisciplines() {
		return sesDisciplines;
	}
	

	/**
	 * Sets the ses disciplines.
	 *
	 * @param sesDisciplines the new ses disciplines
	 */
	public void setSesDisciplines(ArrayList<Discipline> sesDisciplines) {
		this.sesDisciplines = sesDisciplines;
	}
	
	/**
	 * Gets the biographie.
	 *
	 * @return the biographie
	 */
	public String getBiographie() {
		return biographie;
	}
	

	/**
	 * Sets the biographie.
	 *
	 * @param biographie the new biographie
	 */
	public void setBiographie(String biographie) {
		this.biographie = biographie;
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
	public void setNom(String nom) {this.nom = nom;
	}
	

	/**
	 * Gets the son compte.
	 *
	 * @return the son compte
	 */
	public CompteAthlete getSonCompte() {
		return sonCompte;
	}
	

	/**
	 * Sets the son compte.
	 *
	 * @param sonCompte the new son compte
	 */
	public void setSonCompte(CompteAthlete sonCompte) {
		this.sonCompte = sonCompte;
	}
	

	/**
	 * Gets the son pays.
	 *
	 * @return the son pays
	 */
	public Pays getSonPays() {
		return sonPays;
	}
	

	/**
	 * Sets the son pays.
	 *
	 * @param sonPays the new son pays
	 */
	public void setSonPays(Pays sonPays) {
		this.sonPays = sonPays;
	}
	
	// ----------- Methods -----------
	
	/**
	 * Adds the medaille.
	 *
	 * @param medaille the medaille
	 */
	// Ash M
	public void addMedaille(Medaille medaille) {
		this.sesMedailles.add(medaille);
	}
	
	/**
	 * To string.
	 *
	 * @return the string
	 */
	@Override
	public String toString() {
		return "Athlete [sesMedailles=" + sesMedailles + ", sesEquipes=" + sesEquipes + ", sesDisciplines="
				+ sesDisciplines + ", biographie=" + biographie + ", prenom=" + prenom + ", nom=" + nom + ", sonCompte="
				+ sonCompte + ", sonPays=" + sonPays + "]";
	}

	/**
	 * Adds the equipe.
	 *
	 * @author Ash Merienne
	 * @param equipe the equipe
	 */
	public void addEquipe(Equipe equipe) {
		this.sesEquipes.add(equipe);
	}
	
	/**
	 * Adds the discipline.
	 *
	 * @author Ash Merienne
	 * @param discipline the discipline
	 */
	public void addDiscipline(Discipline discipline) {
		this.sesDisciplines.add(discipline);
	}
}