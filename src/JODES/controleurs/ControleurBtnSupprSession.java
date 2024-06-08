/*
 * 
 */
package JODES.controleurs;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

import JODES.modeles.Administrateur;
import JODES.vues.SuppressionSession;


/**
 * The Class ControleurBtnSupprSession.
 *
 * @author Emma Escoffier
 */
public class ControleurBtnSupprSession implements ActionListener {

	/** The admin. */
	Administrateur admin;
	
	/** The vue. */
	protected JFrame _vue;
	
	/**
	 * Instantiates a new controleur btn suppr session.
	 *
	 * @param vue the vue
	 * @param admin the admin
	 */
	public ControleurBtnSupprSession(JFrame vue, Administrateur admin) {
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
		new SuppressionSession(admin);
		_vue.dispose();
	}
}
