/*
 * 
 */
package JODES.controleurs;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import JODES.modeles.Administrateur;
import JODES.vues.PlanningFrame;


/**
 * The Class ControleurBtnPlanning.
 *
 * @author Emma Escoffier
 */
public class ControleurBtnPlanning implements ActionListener {
	
	/** The vue. */
	protected JFrame _vue;
	
	/** The admin. */
	Administrateur admin;
	
	/**
	 * Instantiates a new controleur btn planning.
	 *
	 * @param vue the vue
	 * @param admin the admin
	 */
	public ControleurBtnPlanning(JFrame vue, Administrateur admin) {
		this._vue = vue;
		this.admin = admin;
	}

	/**
	 * Action performed.
	 *
	 * @param e the e
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		new PlanningFrame(admin);
		_vue.dispose();
	}
}
