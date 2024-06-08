/*
 * 
 */
package JODES.modeles;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.lang.reflect.Field;
import java.util.ArrayList;


/**
 * The Class Entite.
 *
 * @author Ash Merienne
 */
public abstract class Entite implements Saveable {
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;
	
	/** The last num. */
	protected static int lastNum = 1;
	
	/** The id entite. */
	protected final int idEntite;
	
	/** The nom. */
	protected String nom;

	// ----------- Constructors -----------
	
	/**
	 * Instantiates a new entite.
	 *
	 * @param nom the nom
	 */
	public Entite(String nom) {
		this.idEntite = lastNum++;
		this.nom = nom;
	}

	// ----------- Getters & setters -----------
	
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
	 * Gets the id entite.
	 *
	 * @return the id entite
	 */
	public int getIdEntite() {
		return idEntite;
	}
	
	// ----------- Methods -----------
	
	/**
	 * Gets the fields.
	 *
	 * @return the fields
	 */
	protected Field[] getFields() {
		return this.getClass().getDeclaredFields();
	}
	
	/**
	 * Gets the field names.
	 *
	 * @return the field names
	 */
	public ArrayList<String> getFieldNames() {
		Field[] fields = this.getFields();
	    ArrayList<String> fieldNames = new ArrayList<>();
	    for (Field field : fields)
	      fieldNames.add(field.getName());
	    return fieldNames;
	}

	/**
	 * To string.
	 *
	 * @return the string
	 */
	@Override
	public String toString() {
		return "Entite [idEntite=" + idEntite + ", nom=" + nom + "]";
	}
	
	/**
	 * Creates the file.
	 *
	 * @return the file
	 */
	public File createFile() {
		String nomentite = this.nom.toLowerCase().replaceAll("\\s","");
		String nomFichier = "entite-" + nomentite + ".dat";
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
				nomFichier = "entite-" + nomentite+ i + ".dat";
				f = new File(nomFichier);
				i++;
			}
		}
		return f;
	}
	
	/**
	 * Save to disk.
	 *
	 * @return the int
	 */
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
		System.out.println ("Sauvegarde du fichier " + f.getName() + " réussie.");
		return 0;
	}

}