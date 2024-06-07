// Emma ESCOFFIER
package JODES.controleurs;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

import JODES.modeles.Planning;

public class ControleurBtnFlecheForwardPlanning implements ActionListener{
	protected JFrame _vue;
	protected Planning _modele;
	
	public ControleurBtnFlecheForwardPlanning(Planning modele, JFrame vue) {
		this._modele = modele;
		this._vue = vue;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Planning updatedPlanning = new Planning(_modele.getDays().get(0).plusDays(7));

	}
// TODO reset values of JTable when arrow is pressed
}
