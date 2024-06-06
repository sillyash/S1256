package JODES.vues;

import javax.swing.*;

import JODES.controleurs.ControleurBTNRetour;
import JODES.controleurs.RetourVue;

import java.awt.*;

public class AjouterEquipe extends JFrame implements RetourVue{

	public AjouterEquipe() {
        super("Gestion des Equipe - Paris 2024");
        
        PanelTitle panelTitle = new PanelTitle("Equipe Création");
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
        AjouterEquipe testAffichage = new AjouterEquipe();
    }
    //Nicolas
	@Override
	public void retour() {
		new EquipeFrame();
		(this).dispose();
	}
}