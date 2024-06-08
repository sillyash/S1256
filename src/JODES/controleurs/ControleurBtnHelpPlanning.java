/*
 * 
 */
package JODES.controleurs;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import JODES.vues.MessageBox;

// TODO: Auto-generated Javadoc
/**
 * The Class ControleurBtnHelpPlanning.
 *
 * @author Emma Escoffier
 */
public class ControleurBtnHelpPlanning implements ActionListener{

	/**
	 * Action performed.
	 *
	 * @param e the e
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		MessageBox helpMessageBox = new MessageBox("", "");
		helpMessageBox.showMessageBoxPlann();
	}
}