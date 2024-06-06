// Emma ESCOFFIER
package JODES.controleurs;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import JODES.vues.EpreuveFrame;

public class ControleurBtnEpreuve extends Controleur implements ActionListener{

	public ControleurBtnEpreuve(Object modele, JFrame vue) {
		super(null, vue);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		new EpreuveFrame();
		((JFrame) _vue).dispose();
		
	}

}
