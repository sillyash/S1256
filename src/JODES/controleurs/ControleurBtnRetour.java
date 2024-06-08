/*
 * 
 */
package JODES.controleurs;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


/**
 * The Class ControleurBtnRetour.
 *
 * @author Nicolas Vouilloux
 */
public class ControleurBtnRetour implements ActionListener {
	
	/** The vue. */
	protected RetourVue vue;
	
	/**
	 * Instantiates a new controleur btn retour.
	 *
	 * @param vue the vue
	 */
	public ControleurBtnRetour(RetourVue vue) {
		this.vue = vue;
	}
	
	/**
	 * Action performed.
	 *
	 * @param e the e
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		vue.retour();
	}
}
