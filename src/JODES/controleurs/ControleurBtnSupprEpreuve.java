// Emma ESCOFFIER
package JODES.controleurs;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

import JODES.modeles.Administrateur;
import JODES.vues.SuppressionEpreuve;

public class ControleurBtnSupprEpreuve implements ActionListener {

	protected JFrame _vue;
	Administrateur admin;

	public ControleurBtnSupprEpreuve(JFrame vue, Administrateur admin) {
		this._vue = vue;
		this.admin = admin;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		new SuppressionEpreuve(admin);
		((JFrame) _vue).dispose();
	}

}
