// Emma ESCOFFIER
package JODES.controleurs;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import JODES.modeles.Administrateur;
import JODES.vues.EpreuveFrame;

public class ControleurBtnEpreuve implements ActionListener{

	Administrateur admin;
	protected JFrame _vue;
	
	public ControleurBtnEpreuve(JFrame vue, Administrateur admin) {
		this._vue = vue;
		this.admin = admin;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		new EpreuveFrame(admin);
		_vue.dispose();
	}
}
