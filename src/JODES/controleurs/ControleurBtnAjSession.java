/*
 * 
 */
package JODES.controleurs;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import JODES.modeles.Administrateur;
import JODES.vues.AjouterSession;

// TODO: Auto-generated Javadoc
/**
 * The Class ControleurBtnAjSession.
 *
 * @author Emma Escoffier
 */
public class ControleurBtnAjSession implements ActionListener{

	/** The admin. */
	Administrateur admin;
	
	/** The vue. */
	JFrame vue;

	/**
	 * Instantiates a new controleur btn aj session.
	 *
	 * @param vue the vue
	 * @param admin the admin
	 */
	public ControleurBtnAjSession(JFrame vue, Administrateur admin) {
		this.vue = vue;
		this.admin = admin;
	}

	/**
	 * Action performed.
	 *
	 * @param e the e
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		new AjouterSession(admin);
		vue.dispose();
	}
}
