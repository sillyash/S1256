package JODES.controleurs;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import JODES.modeles.Administrateur;
import JODES.vues.SelectionEpreuve;

/**
 * @author Emma Escoffier
 */
public class ControleurBtnModEpreuve implements ActionListener{

	Administrateur admin;
	protected JFrame _vue;

	public ControleurBtnModEpreuve(JFrame vue, Administrateur admin) {
		this._vue = vue;
		this.admin = admin;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		new SelectionEpreuve(admin);
		_vue.dispose();
	}

}
