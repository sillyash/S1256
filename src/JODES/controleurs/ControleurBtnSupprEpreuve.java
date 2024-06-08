/*
 * 
 */
package JODES.controleurs;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

import JODES.modeles.Administrateur;
import JODES.vues.SuppressionEpreuve;

// TODO: Auto-generated Javadoc
/**
 * The Class ControleurBtnSupprEpreuve.
 *
 * @author Emma Escoffier
 */
public class ControleurBtnSupprEpreuve implements ActionListener {

	/** The vue. */
	protected JFrame _vue;
	
	/** The admin. */
	Administrateur admin;

	/**
	 * Instantiates a new controleur btn suppr epreuve.
	 *
	 * @param vue the vue
	 * @param admin the admin
	 */
	public ControleurBtnSupprEpreuve(JFrame vue, Administrateur admin) {
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
		new SuppressionEpreuve(admin);
		_vue.dispose();
	}

}
