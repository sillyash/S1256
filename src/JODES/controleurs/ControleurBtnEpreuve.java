/*
 * 
 */
package JODES.controleurs;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import JODES.modeles.Administrateur;
import JODES.vues.EpreuveFrame;


/**
 * The Class ControleurBtnEpreuve.
 *
 * @author Emma Escoffier
 */
public class ControleurBtnEpreuve implements ActionListener{

	/** The admin. */
	Administrateur admin;
	
	/** The vue. */
	protected JFrame _vue;
	
	/**
	 * Instantiates a new controleur btn epreuve.
	 *
	 * @param vue the vue
	 * @param admin the admin
	 */
	public ControleurBtnEpreuve(JFrame vue, Administrateur admin) {
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
		new EpreuveFrame(admin);
		_vue.dispose();
	}
}
