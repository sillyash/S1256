package JODES.controleurs;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import JODES.vues.MessageBox;

/**
 * @author Emma Escoffier
 */
public class ControleurBtnHelpPlanning implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		MessageBox helpMessageBox = new MessageBox("", "");
		helpMessageBox.showMessageBoxPlann();
	}
}