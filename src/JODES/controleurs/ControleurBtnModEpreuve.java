//Emma ESCOFFIER
package JODES.controleurs;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

import JODES.vues.ModifierEpreuve;

public class ControleurBtnModEpreuve extends Controleur implements ActionListener{

	public ControleurBtnModEpreuve(Object modele, JFrame vue) {
		super(null, vue);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		new ModifierEpreuve();
		((JFrame) _vue).dispose();
	}

}
