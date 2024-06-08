/*
 * 
 */
package JODES.controleurs;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// TODO: Auto-generated Javadoc
/**
 * The Class ControleurBtnSelection.
 *
 * @author Nicolas Vouilloux
 */
public class ControleurBtnSelection implements ActionListener{

	/** The vue. */
	protected SelectionVue vue;
	
	/**
	 * Instantiates a new controleur btn selection.
	 *
	 * @param vue the vue
	 */
	public ControleurBtnSelection(SelectionVue vue) {
		this.vue = vue;
	}

	/**
	 * Action performed.
	 *
	 * @param e the e
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		vue.selection();
	}
}
