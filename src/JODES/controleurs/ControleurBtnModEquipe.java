//Emma ESCOFFIER
package JODES.controleurs;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

import JODES.modeles.Entite;
import JODES.modeles.Equipe;
import JODES.vues.ModifierEquipe;

public class ControleurBtnModEquipe extends Controleur implements ActionListener{

	public ControleurBtnModEquipe(Equipe modele, JFrame vue) {
		super(modele, vue);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		new ModifierEquipe((Equipe) this._modele);
		((JFrame) _vue).dispose();
	}
	
}
