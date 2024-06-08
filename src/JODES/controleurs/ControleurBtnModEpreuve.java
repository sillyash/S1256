//Emma ESCOFFIER
package JODES.controleurs;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

import JODES.modeles.Administrateur;
import JODES.modeles.Epreuve;
import JODES.vues.ModifierEpreuve;

public class ControleurBtnModEpreuve implements ActionListener{

	Administrateur admin;
	protected JFrame _vue;
	Epreuve epreuve;

	public ControleurBtnModEpreuve(JFrame vue, Epreuve epreuve, Administrateur admin) {
		this._vue = vue;
		this.admin = admin;
		this.epreuve = epreuve;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		new ModifierEpreuve(epreuve, admin);
		((JFrame) _vue).dispose();
	}

}
