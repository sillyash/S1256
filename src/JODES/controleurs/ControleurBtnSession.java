/*
 * 
 */
package JODES.controleurs;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

import JODES.modeles.Administrateur;
import JODES.vues.SessionFrame;

// TODO: Auto-generated Javadoc
/**
 * The Class ControleurBtnSession.
 *
 * @author Emma Escoffier
 */
public class ControleurBtnSession implements ActionListener{

	/** The admin. */
	Administrateur admin;
	
	/** The vue. */
	protected JFrame _vue;
	
	/**
	 * Instantiates a new controleur btn session.
	 *
	 * @param vue the vue
	 * @param admin the admin
	 */
	public ControleurBtnSession(JFrame vue, Administrateur admin) {
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
		new SessionFrame(admin);
		_vue.dispose();
	}
}
