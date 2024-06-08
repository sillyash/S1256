package JODES.vues;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import JODES.JO2024;
import JODES.controleurs.ControleurAjtAthlete;
import JODES.modeles.Administrateur;

public class PanelChoisirAthlete extends JPanel{

	private static final long serialVersionUID = 1L;
	protected JPanel panel;
	Administrateur admin;
	JFrame vue;
	protected ComboBoxAthlete Cmb = new ComboBoxAthlete(JO2024.getAthletes());   
	
	public PanelChoisirAthlete(JFrame vue, Administrateur admin) {
		this.admin = admin;
		this.vue = vue;
		this.setLayout(new GridLayout(1,2)); 
		add(Cmb);
		JButton btn = new JButton("Créer un athlète");
		ControleurAjtAthlete ctr = new ControleurAjtAthlete(vue, admin);
		btn.addActionListener(ctr);
		add(btn);
	}

	public ComboBoxAthlete getCmb() {
		return Cmb;
	}
}
