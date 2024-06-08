// Emma ESCOFFIER
package JODES.controleurs;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

import JODES.modeles.Administrateur;
import JODES.vues.EquipeFrame;

public class ControleurBtnEquipe extends Controleur implements ActionListener{

	Administrateur admin;

	public ControleurBtnEquipe(JFrame vue, Administrateur admin) {
		super(null, vue);
		this.admin = admin;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		new EquipeFrame(admin);
		((JFrame) _vue).dispose();
	}
}
