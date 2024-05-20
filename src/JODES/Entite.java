package JODES;

import java.util.*;

public abstract class Entite {
	
	protected static int lastNum = 1;
	protected final int idEntite;
	protected String nom;

	// ----------- Constructors -----------
	
	public Entite(String nom) {
		this.idEntite = lastNum++;
		this.nom = nom;
	}

	// ----------- Getters & setters -----------
	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getIdEntite() {
		return idEntite;
	}
	
	// ----------- Methods -----------
	
	protected void menuModification() {
		// TODO - implement Entité.menuModification
		throw new UnsupportedOperationException();
	}

	@Override
	public String toString() {
		return "Entite [idEntite=" + idEntite + ", nom=" + nom + "]";
	}

	// Ash M
	protected int getNumberOfFields() {
		return this.getClass().getDeclaredFields().length;
	}

}