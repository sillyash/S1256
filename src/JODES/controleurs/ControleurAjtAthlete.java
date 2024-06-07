//Emma ESCOFFIER
package JODES.controleurs;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import JODES.vues.SelectionEquipe;

import JODES.modeles.Entite;
import JODES.modeles.Equipe;
import JODES.vues.AjouterAthlete;
import JODES.vues.ModifierEquipe;

public class ControleurAjtAthlete implements ActionListener{

	public ControleurAjtAthlete() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		new AjouterAthlete();
	}
// TODO this needs to go to selectionnerEquipe Vue , which then goes to modif equipe specific vue.
}
