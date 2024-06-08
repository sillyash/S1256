/*
 * 
 */
package JODES.controleurs;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import JODES.vues.PlanningFrame;
import JODES.modeles.Planning;

// TODO: Auto-generated Javadoc
/**
 * The Class ControleurBtnFlecheForwardPlanning.
 *
 * @author Emma Escoffier
 */
public class ControleurBtnFlecheForwardPlanning implements ActionListener{
	
	/** The vue. */
	protected PlanningFrame _vue;
	
	/** The modele. */
	protected Planning _modele;
	
	/**
	 * Instantiates a new controleur btn fleche forward planning.
	 *
	 * @param modele the modele
	 * @param vue the vue
	 */
	public ControleurBtnFlecheForwardPlanning(Planning modele, PlanningFrame vue) {
		this._modele = modele;
		this._vue = vue;
	}

	/**
	 * Action performed.
	 *
	 * @param e the e
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		_vue.set_modele(new Planning(_modele.getDays().get(0).plusDays(7)));
	}
}
