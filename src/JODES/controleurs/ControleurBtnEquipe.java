package JODES.controleurs;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import JODES.modeles.Administrateur;
import JODES.vues.EquipeFrame;

/**
 * @author Emma Escoffier
 */
public class ControleurBtnEquipe implements ActionListener{

	Administrateur admin;
	JFrame vue;

	public ControleurBtnEquipe(JFrame vue, Administrateur admin) {
		this.vue = vue;
		this.admin = admin;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		new EquipeFrame(admin);
		vue.dispose();
	}
}
