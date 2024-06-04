package JODES.modeles;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public abstract class Entite implements Saveable {
	
	private static final long serialVersionUID = 1L;
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

	public int getNumberOfFields() {
		// Ash M
		return this.getClass().getDeclaredFields().length;
	}
	
	public File createFile() {
		String nomFichier = "entite-" + this.nom + ".dat";
		File f = new File(nomFichier);
		if (!f.exists()) {
			// Si le fichier favoris.dat n'existe pas 
			System.out.println ("Le fichier " + nomFichier + " n'existe pas !");
		}
		else {
			System.out.println ("Le fichier " + nomFichier + " existe. "
					+ "Génération d'un nom de fichier valide...");
			int i = 1;
			while (f.exists()) {
				nomFichier = "entite-" + this.nom + i + ".dat";
				f = new File(nomFichier);
				i++;
			}
		}
		System.out.println("Fichier " + nomFichier + " sauvegardé.");
		return f;
	}
	
	public int saveToDisk() {
		File f = this.createFile();
		FileOutputStream fichier;
		ObjectOutputStream flotObjet;
		try {
			fichier = new FileOutputStream(f.getName());
			flotObjet = new ObjectOutputStream(fichier);
			flotObjet.writeObject(this);
			flotObjet.close();
		} catch (IOException e) {
			e.printStackTrace();
			return -1;
		}
		return 0;
	}

}