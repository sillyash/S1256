package JODES.vues;
import javax.swing.*;
import JODES.controleurs.*;
import JODES.modeles.Administrateur;

import java.awt.*;

/**
 * @author Kincy Saad
 */
public class EquipeFrame extends JFrame implements RetourVue{
	Administrateur admin;
    public EquipeFrame(Administrateur admin) {
        // Create main frame
        super("JODES");
        this.admin = admin;
        setSize(800, 450);
        setLayout(new BorderLayout());

        // Create panels
        PanelTitle panelTitle = new PanelTitle("Equipes");
        PanelButton panelButton = new PanelButton();
        
        //Emma ESCOFFIER
        ControleurBtnSupprEquipe ctrlSupprEqu = new ControleurBtnSupprEquipe(this, admin);
        ControleurBtnAjEquipe ctrlAjEqu = new ControleurBtnAjEquipe(this, admin);
        ControleurBtnModEquipe ctrlModEq = new ControleurBtnModEquipe(this, admin);
        
        panelButton.boutonSupprimer.addActionListener(ctrlSupprEqu);
        panelButton.boutonAjouter.addActionListener(ctrlAjEqu);
        panelButton.boutonModifier.addActionListener(ctrlModEq);
        
        //Nicolas 
        JButton button = new JButton("Retour" + "\u21A9");
        ControleurBtnRetour BtnRetour = new ControleurBtnRetour(this);
        button.addActionListener(BtnRetour);
        add(button,BorderLayout.SOUTH);
        //pas Nicolas
        
        // Add panels to frame
        add(panelTitle, BorderLayout.NORTH);
        add(panelButton, BorderLayout.CENTER);

        // Make the frame visible
        setVisible(true);
        
        // Exit the application when the frame is closed
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    //Nicolas
	@Override
	public void retour() {
		new HomePageFrame(admin);
		this.dispose();
	}
}
