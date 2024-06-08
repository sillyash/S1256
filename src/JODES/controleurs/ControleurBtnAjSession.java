package JODES.controleurs;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import JODES.modeles.Administrateur;
import JODES.vues.AjouterSession;

/**
 * @author Emma Escoffier
 */
public class ControleurBtnAjSession implements ActionListener{

	Administrateur admin;
	JFrame vue;

	public ControleurBtnAjSession(JFrame vue, Administrateur admin) {
		this.vue = vue;
		this.admin = admin;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		new AjouterSession(admin);
		vue.dispose();
	}
}
