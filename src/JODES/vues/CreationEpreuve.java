package JODES.vues;

import javax.swing.*;

import JODES.controleurs.ControleurBTNRetour;
import JODES.controleurs.RetourVue;

import java.awt.*;

public class CreationEpreuve extends JFrame implements RetourVue{


	public CreationEpreuve() {
        // Create main frame
        super("Gestion des Epreuves - Paris 2024");
        setSize(800, 450);
        

        // Create panels
        PanelTitle panelTitle = new PanelTitle("Epreuves Création");
        JButton button = new JButton("retour");
        // Add panels to frame
        add(button, BorderLayout.SOUTH);
        add(panelTitle, BorderLayout.NORTH);

        
        ControleurBTNRetour btnretour = new ControleurBTNRetour(this);
        button.addActionListener(btnretour);
        
        // Make the frame visible
        setVisible(true);
        // Exit the application when the frame is closed
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }

    public static void main(String[] args) {
    	//Create the mainEpreuve frame
        CreationEpreuve Epreuve = new CreationEpreuve();
    }
    //Nicolas
	@Override
	public void retour() {
		new EpreuveFrame();
		(this).dispose();
	}
}