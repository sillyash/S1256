// Emma ESCOFFIER
package JODES.controleurs;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import JODES.vues.MessageBox;

public class ControleurBtnHelpPlanning implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		MessageBox helpMessageBox = new MessageBox("Pour ajouter les epreuves", "Aide");
		helpMessageBox.showMessageBox();
	}

	public static void main(String[] args) {
		MessageBox a = new MessageBox("Pour ajouter les epreuves", "Aide");
		a.showMessageBox();
	}
}