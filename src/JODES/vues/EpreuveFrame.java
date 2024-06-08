package JODES.vues;
import javax.swing.*;
import JODES.controleurs.ControleurBtnRetour;
import JODES.controleurs.RetourVue;
import JODES.modeles.Administrateur;
import JODES.controleurs.*;
import java.awt.*;

public class EpreuveFrame extends JFrame implements RetourVue {
	Administrateur admin;
	public EpreuveFrame(Administrateur admin) {
        // Create main frame
        super("JODES");
        this.admin = admin;
        setSize(800, 450);
        setLayout(new BorderLayout());

        // Create panels
        PanelTitle panelTitle = new PanelTitle("Epreuves");
        PanelButton panelButton = new PanelButton();
        
        // Add panels to frame
        add(panelTitle, BorderLayout.NORTH);
        add(panelButton, BorderLayout.CENTER);
        
        //Emma ESCOFFIER
        ControleurBtnSupprEpreuve ctrlSupprEpr = new ControleurBtnSupprEpreuve(this, admin);
        ControleurBtnAjEpreuve ctrlAjEpr = new ControleurBtnAjEpreuve(this, admin);
        ControleurBtnModEpreuve ctrlModEpr = new ControleurBtnModEpreuve(this, admin);
        
        panelButton.boutonSupprimer.addActionListener(ctrlSupprEpr);
        panelButton.boutonAjouter.addActionListener(ctrlAjEpr);
        panelButton.boutonModifier.addActionListener(ctrlModEpr);
        
        //Nicolas 
        JButton button = new JButton("Retour" + "\u21A9");
        ControleurBtnRetour BtnRetour = new ControleurBtnRetour(this);
        button.addActionListener(BtnRetour);
        add(button, BorderLayout.SOUTH);
        //pas Nicolas
        
        // Make the frame visible
        setVisible(true);
        // Exit the application when the frame is closed
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
    }

    public static void main(String[] args) {
    	//Create the mainEpreuve frame
    	Administrateur admin = new Administrateur("admin", "", "tst", "ttest");
        EpreuveFrame Epreuve = new EpreuveFrame(admin);
    }
    //Nicolas
	@Override
	public void retour() {
		new HomePageFrame(admin);
		(this).dispose();
	}
}
