package JODES.vues;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import JODES.JO2024;
import JODES.controleurs.ControleurAjtAthlete;
import JODES.controleurs.UpdateAthlete;
import JODES.modeles.Administrateur;

/**
 * @author Nicolas Vouilloux
 */
public class PanelChoisirAthlete extends JPanel{

	private static final long serialVersionUID = 1L;
	protected JPanel panel;
	Administrateur admin;
	UpdateAthlete vue;
	protected ComboBoxAthlete Cmb;   
	
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

	public ComboBoxAthlete getCmb() {
		return Cmb;
	}
	
	public void setCmb(ComboBoxAthlete cmb) {
		this.Cmb = cmb;
	}
	
}
