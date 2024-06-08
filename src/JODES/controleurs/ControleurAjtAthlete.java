/*
 * 
 */
package JODES.controleurs;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import JODES.modeles.Administrateur;
import JODES.vues.AjouterAthlete;


/**
 * The Class ControleurAjtAthlete.
 *
 * @author Emma Escoffier
 */
public class ControleurAjtAthlete implements ActionListener{

	/** The admin. */
	Administrateur admin;
	
	/** The vue. */
	UpdateAthlete vue;

	/**
	 * Instantiates a new controleur ajt athlete.
	 *
	 * @param vue the vue
	 * @param admin the admin
	 */
	public ControleurAjtAthlete(UpdateAthlete vue, Administrateur admin) {
		this.admin = admin;
		this.vue = vue;
	}

	/**
	 * Action performed.
	 *
	 * @param e the e
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		new AjouterAthlete(vue, admin);
	}
}
