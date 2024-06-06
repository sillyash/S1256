package JODES.vues;

import javax.swing.*;

import JODES.controleurs.ControleurBTNRetour;
import JODES.controleurs.RetourVue;

import java.awt.*;

public class EquipeFrame extends JFrame implements RetourVue{

    public EquipeFrame() {
        // Create main frame
        super("Gestion des Équipes - Paris 2024");
        setSize(800, 450);
        setLayout(new BorderLayout());

        // Create panels
        PanelTitle panelTitle = new PanelTitle("Equipes");
        PanelButton panelButton = new PanelButton();
        //Nicolas 
        JButton button = new JButton("retour");
        ControleurBTNRetour BtnRetour = new ControleurBTNRetour(this);
        button.addActionListener(BtnRetour);
        add(button,BorderLayout.SOUTH);//TODO mettre le bouton au bon endroit
        //pas Nicolas
        // Add panels to frame
        add(panelTitle, BorderLayout.NORTH);
        add(panelButton, BorderLayout.CENTER);

        // Make the frame visible
        setVisible(true);
        
        // Exit the application when the frame is closed
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
    	EquipeFrame Equipe = new EquipeFrame();    }
    
    //Nicolas
	@Override
	public void retour() {
		new HomePageFrame();
		this.dispose();
	}
}
