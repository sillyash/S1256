// Emma ESCOFFIER
package JODES.controleurs;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

import JODES.vues.HomePageFrame;
import JODES.vues.PlanningFrame;

public class ControleurBtnPlanning extends Controleur implements ActionListener {
	
	public ControleurBtnPlanning(JFrame vue) {
		super(null, vue);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		new PlanningFrame();
		((JFrame) _vue).dispose();
	}
}
