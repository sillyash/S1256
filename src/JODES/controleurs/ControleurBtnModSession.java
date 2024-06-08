package JODES.controleurs;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import JODES.modeles.Administrateur;
import JODES.vues.SelectionSession;

/**
 * @author Emma Escoffier
 */
public class ControleurBtnModSession implements ActionListener {

	Administrateur admin;
	protected JFrame _vue;
	
	public ControleurBtnModSession(JFrame vue, Administrateur admin) {
		this._vue = vue;
		this.admin = admin;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		new SelectionSession(admin);
		_vue.dispose();
	}
}
