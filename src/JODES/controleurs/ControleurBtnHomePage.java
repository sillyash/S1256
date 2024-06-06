package JODES.controleurs;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import JODES.vues.*;
import JODES.modeles.*;

public class ControleurBtnHomePage extends Controleur implements ActionListener {
	
	public ControleurBtnHomePage(Entite modele, JFrame vue) {
		super(modele, vue);
	}

	// ----------- Methods -----------

	@Override
	public void actionPerformed(ActionEvent e) {
		((Entite) this._modele).menuModification();
	}

}
