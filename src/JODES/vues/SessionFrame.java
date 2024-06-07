package JODES.vues;
import javax.swing.*;
import JODES.controleurs.*;
import JODES.modeles.Administrateur;

import java.awt.*;

public class SessionFrame extends JFrame implements RetourVue{
	Administrateur admin;
    public SessionFrame(Administrateur admin) {
        // Create main frame
        super("JODES");
        this.admin = admin;
        setSize(800, 450);
        setLayout(new BorderLayout());

        // Create panels
        PanelTitle panelTitle = new PanelTitle("Sessions");
        PanelButton panelButton = new PanelButton();

        // Add panels to frame
        add(panelTitle, BorderLayout.NORTH);
        add(panelButton, BorderLayout.CENTER);
        
        //Emma ESCOFFIER
        ControleurBtnSupprSession ctrlSupprSes = new ControleurBtnSupprSession(this);
        ControleurBtnAjSession ctrlAjSes = new ControleurBtnAjSession(this);
        ControleurBtnModSession ctrlModSes = new ControleurBtnModSession(this);
        
        panelButton.boutonSupprimer.addActionListener(ctrlSupprSes);
        panelButton.boutonAjouter.addActionListener(ctrlAjSes);
        panelButton.boutonModifier.addActionListener(ctrlModSes);
        
        //Nicolas 
        JButton button = new JButton("Retour" + "\u21A9");
        ControleurBtnRetour BtnRetour = new ControleurBtnRetour(this);
        button.addActionListener(BtnRetour);
        add(button,BorderLayout.SOUTH);//TODO mettre le bouton au bon endroit
        //pas Nicolas
        
        // Make the frame visible
        setVisible(true);

        // Exit the application when the frame is closed
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }

    public static void main(String[] args) {
    	Administrateur admin = new Administrateur("admin", "", "tst", "ttest");
        SessionFrame Session = new SessionFrame(admin);
    }
    //Nicolas
	@Override
	public void retour() {
		new HomePageFrame(admin);
		this.dispose();
	}
}

