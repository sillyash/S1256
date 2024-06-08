package JODES.controleurs;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

import JODES.modeles.Administrateur;
import JODES.vues.SuppressionSession;

/**
 * @author Emma Escoffier
 */
public class ControleurBtnSupprSession implements ActionListener {

	Administrateur admin;
	protected JFrame _vue;
	
	public ControleurBtnSupprSession(JFrame vue, Administrateur admin) {
		this._vue = vue;
		this.admin = admin;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		new SuppressionSession(admin);
		_vue.dispose();
	}
}
