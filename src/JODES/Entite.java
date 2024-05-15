package JODES;

import java.util.*;

public class Entite {

	protected static int lastNum = 0;
	protected final int idEntite;
	protected String nom;

	public Entite(int idEntite, String nom) {
		super();
		this.idEntite = idEntite;
		this.nom = nom;
	}

	protected void menuModification() {
		// TODO - implement Entité.menuModification
		throw new UnsupportedOperationException();
	}

}