/*
 * 
 */
package JODES.controleurs;
import javax.swing.JFrame;
import JODES.modeles.Entite;


/**
 * The Class Controleur.
 *
 * @author Ash Merienne
 */
public abstract class Controleur  {
	
	/** The modele. */
	protected Entite _modele;
	
	/** The vue. */
	protected JFrame _vue;

	// ----------- Constructors -----------
	
	/**
	 * Instantiates a new controleur.
	 *
	 * @param modele the modele
	 * @param vue the vue
	 */
	public Controleur(Entite modele, JFrame vue) {
		this._modele = modele;
		this._vue = vue;
	
	}

	/**
	 * Gets the modele.
	 *
	 * @return the modele
	 */
	public Entite get_modele() {
		return _modele;
	}

	/**
	 * Sets the modele.
	 *
	 * @param _modele the new modele
	 */
	public void set_modele(Entite _modele) {
		this._modele = _modele;
	}

	/**
	 * Gets the vue.
	 *
	 * @return the vue
	 */
	public JFrame get_vue() {
		return _vue;
	}

	/**
	 * Sets the vue.
	 *
	 * @param _vue the new vue
	 */
	public void set_vue(JFrame _vue) {
		this._vue = _vue;
	}
}
