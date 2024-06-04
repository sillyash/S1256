package JODES.controleurs;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import JODES.vues.*;
import JODES.modeles.*;

public class ControleurBtnHomePage implements ActionListener {
	
	protected Entite _modele;
	protected HomePageFrame _vue;

	// ----------- Constructors -----------
	
	public ControleurBtnHomePage(Entite modele, HomePageFrame vue) {
		this._modele = modele;
		this._vue = vue;
	}
	
	// ----------- Getters & setters -----------
	
	public Entite get_modele() {
		return _modele;
	}

	public void set_modele(Entite _modele) {
		this._modele = _modele;
	}
	
	// ----------- Methods -----------

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO
	}

}
