package JODES.controleurs;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class ControleurBTNRetour extends Controleur implements ActionListener {
	
	protected RetourVue _vue;

	public ControleurBTNRetour(JFrame vue) {
		super(null, vue);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		_vue.retour();
	}
}
