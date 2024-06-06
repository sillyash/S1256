//Emma ESCOFFIER
package JODES.controleurs;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

import JODES.vues.AjouterEpreuve;

public class ControleurBtnAjEpreuve extends Controleur implements ActionListener {

	public ControleurBtnAjEpreuve(Object modele, JFrame vue) {
		super(null, vue);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		new AjouterEpreuve();
		((JFrame) _vue).dispose();
	}

}
