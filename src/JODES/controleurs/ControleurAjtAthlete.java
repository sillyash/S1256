//Emma ESCOFFIER
package JODES.controleurs;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import JODES.modeles.Administrateur;
import JODES.vues.AjouterAthlete;

public class ControleurAjtAthlete implements ActionListener{

	Administrateur admin;
	JFrame vue;

	public ControleurAjtAthlete(JFrame vue, Administrateur admin) {
		this.admin = admin;
		this.vue = vue;
		System.out.println("SaveQuit: "+admin);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		new AjouterAthlete(admin);
	}
}
