//Emma ESCOFFIER
package JODES.controleurs;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import JODES.modeles.Session;

import JODES.vues.ModifierSession;

public class ControleurBtnModSession extends Controleur implements ActionListener {

	public ControleurBtnModSession(Session session, JFrame vue) {
		super(session, vue);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		new ModifierSession((Session)super.get_modele());
		((JFrame) _vue).dispose();
	}
}
