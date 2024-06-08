package JODES.controleurs;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

import JODES.modeles.Entite;

public class ControleurBtnSelection extends Controleur implements ActionListener{
	protected SelectionVue _vue;
	
	public ControleurBtnSelection(JFrame vue) {
		super(null,vue);
		this._vue = (SelectionVue)vue;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		_vue.selection();
	}
}
