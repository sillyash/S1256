//Emma ESCOFFIER
package JODES.controleurs;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import JODES.modeles.Administrateur;
import JODES.vues.AjouterAthlete;

public class ControleurAjtAthlete implements ActionListener{

	Administrateur admin;
	UpdateAthlete vue;

	public ControleurAjtAthlete(UpdateAthlete vue, Administrateur admin) {
		this.admin = admin;
		this.vue = vue;
		System.out.println("SaveQuit: "+admin);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		new AjouterAthlete(vue, admin);
	}
}
