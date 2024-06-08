// Emma ESCOFFIER
package JODES.controleurs;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import JODES.modeles.Planning;
import JODES.vues.PlanningFrame;

public class ControleurBtnFlecheBackwardsPlanning implements ActionListener{
	protected PlanningFrame _vue;
	protected Planning _modele;
	
	public ControleurBtnFlecheBackwardsPlanning(Planning modele, PlanningFrame vue) {
		this._modele = modele;
		this._vue = vue;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		_vue.set_modele(new Planning(_modele.getDays().get(0).minusDays(7)));
	}
// TODO reset values of JTable when arrow is pressed
}
