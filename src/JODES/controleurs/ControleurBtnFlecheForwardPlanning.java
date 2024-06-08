// Emma ESCOFFIER
package JODES.controleurs;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import JODES.vues.PlanningFrame;
import JODES.modeles.Planning;

public class ControleurBtnFlecheForwardPlanning implements ActionListener{
	protected PlanningFrame _vue;
	protected Planning _modele;
	
	public ControleurBtnFlecheForwardPlanning(Planning modele, PlanningFrame vue) {
		this._modele = modele;
		this._vue = vue;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		_vue.set_modele(new Planning(_modele.getDays().get(0).plusDays(7)));
		// TODO fix this not working
	}
}
