package JODES.vues;

import javax.swing.*;

import JODES.controleurs.ControleurBTNRetour;
import JODES.controleurs.RetourVue;

import java.awt.*;

public class ModifierEpreuve extends JFrame implements RetourVue{


	public ModifierEpreuve() {
        super("Modification des Epreuves - Paris 2024");
        setSize(800, 450);

        PanelTitle panelTitle = new PanelTitle("Epreuves Modification");
        JButton button = new JButton("retour");
        add(button, BorderLayout.SOUTH);
        add(panelTitle, BorderLayout.NORTH);
        
        ControleurBTNRetour btnretour = new ControleurBTNRetour(this);
        button.addActionListener(btnretour);
        
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }

    public static void main(String[] args) {
        ModifierEpreuve Epreuve = new ModifierEpreuve();
    }
    //Nicolas
	@Override
	public void retour() {
		new EpreuveFrame();
		(this).dispose();
	}
}