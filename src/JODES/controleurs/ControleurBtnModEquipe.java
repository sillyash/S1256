package JODES.controleurs;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import JODES.vues.SelectionEquipe;
import JODES.modeles.Administrateur;

/**
 * @author Emma Escoffier
 */
public class ControleurBtnModEquipe implements ActionListener{

	protected JFrame _vue;
	Administrateur admin;
	
	public ControleurBtnModEquipe(JFrame vue, Administrateur admin) {
		this._vue = vue;
		this.admin = admin;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		new SelectionEquipe(admin);
		_vue.dispose();
	}
}
