package JODES.controleurs;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import JODES.modeles.Administrateur;
import JODES.vues.PlanningFrame;

/**
 * @author Emma Escoffier
 */
public class ControleurBtnPlanning implements ActionListener {
	protected JFrame _vue;
	Administrateur admin;
	public ControleurBtnPlanning(JFrame vue, Administrateur admin) {
		this._vue = vue;
		this.admin = admin;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		new PlanningFrame(admin);
		_vue.dispose();
	}
}
