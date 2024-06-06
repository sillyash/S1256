//Emma ESCOFFIER
package JODES.controleurs;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

import JODES.vues.ModifierSession;

public class ControleurBtnModSession extends Controleur implements ActionListener{

	public ControleurBtnModSession(Object modele, JFrame vue) {
		super(null, vue);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		new ModifierSession();
		((JFrame) _vue).dispose();
	}
}
