package JODES.controleurs;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class ControleurBtnSauvegarderQuitter extends Controleur implements ActionListener {
	
	protected SauvegarderQuitter _vue;
	
	public ControleurBtnSauvegarderQuitter(JFrame vue) {
		super(null, vue);
		//Nicolas
		this._vue = (SauvegarderQuitter) vue;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		_vue.saveQuit();
	}
}
