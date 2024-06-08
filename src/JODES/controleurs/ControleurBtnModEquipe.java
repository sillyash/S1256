/*
 * 
 */
package JODES.controleurs;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import JODES.vues.SelectionEquipe;
import JODES.modeles.Administrateur;


/**
 * The Class ControleurBtnModEquipe.
 *
 * @author Emma Escoffier
 */
public class ControleurBtnModEquipe implements ActionListener{

	/** The vue. */
	protected JFrame _vue;
	
	/** The admin. */
	Administrateur admin;
	
	/**
	 * Instantiates a new controleur btn mod equipe.
	 *
	 * @param vue the vue
	 * @param admin the admin
	 */
	public ControleurBtnModEquipe(JFrame vue, Administrateur admin) {
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
		new SelectionEquipe(admin);
		_vue.dispose();
	}
}
