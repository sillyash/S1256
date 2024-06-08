/*
 * 
 */
package JODES.controleurs;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import JODES.modeles.Administrateur;
import JODES.vues.EquipeFrame;

// TODO: Auto-generated Javadoc
/**
 * The Class ControleurBtnEquipe.
 *
 * @author Emma Escoffier
 */
public class ControleurBtnEquipe implements ActionListener{

	/** The admin. */
	Administrateur admin;
	
	/** The vue. */
	JFrame vue;

	/**
	 * Instantiates a new controleur btn equipe.
	 *
	 * @param vue the vue
	 * @param admin the admin
	 */
	public ControleurBtnEquipe(JFrame vue, Administrateur admin) {
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
		new EquipeFrame(admin);
		vue.dispose();
	}
}
