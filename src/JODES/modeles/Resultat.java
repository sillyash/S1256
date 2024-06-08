/*
 * 
 */
package JODES.modeles;
import java.time.Duration;
import java.util.*;


/**
 * The Class Resultat.
 *
 * @author Visual Paradigm
 */
public class Resultat extends Entite {

	/** The ses resultats. */
	ArrayList<Session> sesResultats;
	
	/** The score. */
	protected float score;
	
	/** The temps. */
	protected Duration temps;

	// ----------- Constructors -----------
	
	/**
	 * Instantiates a new resultat.
	 *
	 * @param nom the nom
	 * @param sesResultats the ses resultats
	 * @param score the score
	 * @param temps the temps
	 */
	public Resultat(String nom, ArrayList<Session> sesResultats, float score, Duration temps) {
		super(nom);
		this.sesResultats = sesResultats;
		this.score = score;
		this.temps = temps;
	}
	
	// ----------- Getters & setters -----------
	
	/**
	 * Gets the ses resultats.
	 *
	 * @return the ses resultats
	 */
	public ArrayList<Session> getSesResultats() {
		return sesResultats;
	}

	/**
	 * Sets the ses resultats.
	 *
	 * @param sesResultats the new ses resultats
	 */
	public void setSesResultats(ArrayList<Session> sesResultats) {
		this.sesResultats = sesResultats;
	}

	/**
	 * Gets the score.
	 *
	 * @return the score
	 */
	public float getScore() {
		return score;
	}

	/**
	 * Sets the score.
	 *
	 * @param score the new score
	 */
	public void setScore(float score) {
		this.score = score;
	}

	/**
	 * Gets the temps.
	 *
	 * @return the temps
	 */
	public Duration getTemps() {
		return temps;
	}

	/**
	 * Sets the temps.
	 *
	 * @param temps the new temps
	 */
	public void setTemps(Duration temps) {
		this.temps = temps;
	}
}