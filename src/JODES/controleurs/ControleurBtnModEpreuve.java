/*
 * 
 */
package JODES.controleurs;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import JODES.modeles.Administrateur;
import JODES.vues.SelectionEpreuve;

// TODO: Auto-generated Javadoc
/**
 * The Class ControleurBtnModEpreuve.
 *
 * @author Emma Escoffier
 */
public class ControleurBtnModEpreuve implements ActionListener{

	/** The admin. */
	Administrateur admin;
	
	/** The vue. */
	protected JFrame _vue;

	/**
	 * Instantiates a new controleur btn mod epreuve.
	 *
	 * @param vue the vue
	 * @param admin the admin
	 */
	public ControleurBtnModEpreuve(JFrame vue, Administrateur admin) {
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
		new SelectionEpreuve(admin);
		_vue.dispose();
	}

}
