package JODES.vues;

import javax.swing.*;

import JODES.controleurs.ControleurBTNRetour;
import JODES.controleurs.RetourVue;

import java.awt.*;

public class ModifierEquipe extends JFrame implements RetourVue{

	public ModifierEquipe() {
        super("Modification des Equipe - Paris 2024");
        
        PanelTitle panelTitle = new PanelTitle("Equipe Modification");
        JButton button = new JButton("retour");
        ControleurBTNRetour btnretour = new ControleurBTNRetour(this);

        add(button, BorderLayout.SOUTH);
        add(panelTitle, BorderLayout.NORTH);
        button.addActionListener(btnretour);
        
        setSize(800, 450);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        ModifierEquipe testAffichage = new ModifierEquipe();
    }
    //Nicolas
	@Override
	public void retour() {
		new EquipeFrame();
		(this).dispose();
	}
}