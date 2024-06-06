//Emma ESCOFFIER
package JODES.controleurs;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

import JODES.vues.ModifierEquipe;

public class ControleurBtnModEquipe extends Controleur implements ActionListener{

	public ControleurBtnModEquipe(Object modele, JFrame vue) {
		super(null, vue);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		new ModifierEquipe();
		((JFrame) _vue).dispose();
	}
	
}
