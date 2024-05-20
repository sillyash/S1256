package JODES;

import java.util.*;

public class Equipe extends Entite {

	protected ArrayList<Athlete> sesAthlètes;

	public Equipe(String nom, ArrayList<Athlete> sesAthlètes) {
		super(nom);
		this.sesAthlètes = sesAthlètes;
	}
	
	public Equipe(String nom) {
		this(nom, new ArrayList<Athlete>());
	}
	
	// ----------- Constructors -----------
	
	
	
	// ----------- Getters & setters -----------
	
	
	
	// ----------- Methods -----------

}