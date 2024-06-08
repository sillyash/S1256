// Emma ESCOFFIER
package JODES.controleurs;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

import JODES.modeles.Administrateur;
import JODES.vues.SuppressionEquipe;

public class ControleurBtnSupprEquipe implements ActionListener {

	protected JFrame _vue;
	Administrateur admin;

	public ControleurBtnSupprEquipe(JFrame vue, Administrateur admin) {
		this._vue = vue;
		this.admin = admin;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		new SuppressionEquipe(admin);
		((JFrame) _vue).dispose();
	}
}
