/*
 * 
 */
package JODES.controleurs;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import JODES.modeles.Administrateur;
import JODES.vues.AjouterEquipe;

// TODO: Auto-generated Javadoc
/**
 * The Class ControleurBtnAjEquipe.
 *
 * @author Emma Escoffier
 */
public class ControleurBtnAjEquipe implements ActionListener{

	/** The vue. */
	protected JFrame _vue;
	
	/** The admin. */
	Administrateur admin;

	/**
	 * Instantiates a new controleur btn aj equipe.
	 *
	 * @param vue the vue
	 * @param admin the admin
	 */
	public ControleurBtnAjEquipe(JFrame vue, Administrateur admin) {
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
		new AjouterEquipe(admin);
		_vue.dispose();
	}

}
