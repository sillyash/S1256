//Emma ESCOFFIER
package JODES.controleurs;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import JODES.modeles.Administrateur;
import JODES.vues.AjouterAthlete;

public class ControleurAjtAthlete implements ActionListener{

	Administrateur admin;

	public ControleurAjtAthlete(Administrateur admin) {
		this.admin = admin;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		new AjouterAthlete(admin);
	}
// TODO this needs to go to selectionnerEquipe Vue , which then goes to modif equipe specific vue.
}
