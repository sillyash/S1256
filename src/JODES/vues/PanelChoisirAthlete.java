/*
 * 
 */
package JODES.vues;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import JODES.JO2024;
import JODES.controleurs.ControleurAjtAthlete;
import JODES.controleurs.UpdateAthlete;
import JODES.modeles.Administrateur;


/**
 * The Class PanelChoisirAthlete.
 *
 * @author Nicolas Vouilloux
 */
public class PanelChoisirAthlete extends JPanel{

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;
	
	/** The panel. */
	protected JPanel panel;
	
	/** The admin. */
	Administrateur admin;
	
	/** The vue. */
	UpdateAthlete vue;
	
	/** The Cmb. */
	protected ComboBoxAthlete Cmb;   
	
	/**
	 * Instantiates a new panel choisir athlete.
	 *
	 * @param vue the vue
	 * @param admin the admin
	 */
	public PanelChoisirAthlete(UpdateAthlete vue, Administrateur admin) {
		this.admin = admin;
		this.vue = vue;
		this.setLayout(new GridLayout(1,2)); 
		this.Cmb = new ComboBoxAthlete(JO2024.getAthletes());
		add(Cmb);
		JButton btn = new JButton("Créer un athlète");
		ControleurAjtAthlete ctr = new ControleurAjtAthlete(this.vue, admin);
		btn.addActionListener(ctr);
		add(btn);
	}

	/**
	 * Gets the cmb.
	 *
	 * @return the cmb
	 */
	public ComboBoxAthlete getCmb() {
		return Cmb;
	}
	
	/**
	 * Sets the cmb.
	 *
	 * @param cmb the new cmb
	 */
	public void setCmb(ComboBoxAthlete cmb) {
		this.Cmb = cmb;
	}
	
}
