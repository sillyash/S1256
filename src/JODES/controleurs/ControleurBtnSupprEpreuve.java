// Emma ESCOFFIER
package JODES.controleurs;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import JODES.vues.SuppressionEpreuve;

public class ControleurBtnSupprEpreuve extends Controleur implements ActionListener {

	public ControleurBtnSupprEpreuve(Object modele, JFrame vue) {
		super(null, vue);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		new SuppressionEpreuve();
		
	}

}
