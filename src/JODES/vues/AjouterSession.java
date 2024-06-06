package JODES.vues;

import javax.swing.*;

import JODES.controleurs.ControleurBTNRetour;
import JODES.controleurs.RetourVue;

import java.awt.*;

public class AjouterSession extends JFrame implements RetourVue{

	public AjouterSession() {
        // Create main frame
        super("Gestion des Session - Paris 2024");
        setSize(800, 450);
        

        // Create panels
        PanelTitle panelTitle = new PanelTitle("Session Création");
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
        AjouterSession creaSession = new AjouterSession();
    }
    //Nicolas
	@Override
	public void retour() {
		new SessionFrame();
		(this).dispose();
	}
}