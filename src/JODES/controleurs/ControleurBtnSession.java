// Emma ESCOFFIER
package JODES.controleurs;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

import JODES.modeles.Administrateur;
import JODES.vues.SessionFrame;

public class ControleurBtnSession implements ActionListener{

	Administrateur admin;
	protected JFrame _vue;
	
	public ControleurBtnSession(JFrame vue, Administrateur admin) {
		this._vue = vue;
		this.admin = admin;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		new SessionFrame(admin);
		((JFrame) _vue).dispose();
	}
}
