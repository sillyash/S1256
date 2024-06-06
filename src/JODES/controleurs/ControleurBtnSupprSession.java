// Emma ESCOFFIER
package JODES.controleurs;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import JODES.vues.SuppressionSession;

public class ControleurBtnSupprSession extends Controleur implements ActionListener {

	public ControleurBtnSupprSession(Object modele, JFrame vue) {
		super(null, vue);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		new SuppressionSession();
		((JFrame) _vue).dispose();
	}
}
