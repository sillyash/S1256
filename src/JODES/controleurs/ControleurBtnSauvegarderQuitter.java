/*
 * 
 */
package JODES.controleurs;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// TODO: Auto-generated Javadoc
/**
 * The Class ControleurBtnSauvegarderQuitter.
 *
 * @author Nicolas Vouilloux
 */
public class ControleurBtnSauvegarderQuitter implements ActionListener {
	
	/** The vue. */
	protected SauvegarderQuitter _vue;
	
	/**
	 * Instantiates a new controleur btn sauvegarder quitter.
	 *
	 * @param vue the vue
	 */
	public ControleurBtnSauvegarderQuitter(SauvegarderQuitter vue) {
		this._vue = vue;
	}
	
	/**
	 * Action performed.
	 *
	 * @param e the e
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		_vue.saveQuit();
	}
}
