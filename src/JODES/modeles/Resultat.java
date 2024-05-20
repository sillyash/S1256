package JODES.modeles;

import java.time.Duration;
import java.util.*;

public class Resultat extends Entite {

	ArrayList<Epreuve> sesResultats;
	protected float score;
	protected Duration temps;

	// ----------- Constructors -----------
	
	public Resultat(String nom, ArrayList<Epreuve> sesResultats, float score, Duration temps) {
		super(nom);
		this.sesResultats = sesResultats;
		this.score = score;
		this.temps = temps;
	}
	
	// ----------- Getters & setters -----------
	
	public ArrayList<Epreuve> getSesResultats() {
		return sesResultats;
	}

	public void setSesResultats(ArrayList<Epreuve> sesResultats) {
		this.sesResultats = sesResultats;
	}

	public float getScore() {
		return score;
	}

	public void setScore(float score) {
		this.score = score;
	}

	public Duration getTemps() {
		return temps;
	}

	public void setTemps(Duration temps) {
		this.temps = temps;
	}
	
	// ----------- Methods -----------
	
}