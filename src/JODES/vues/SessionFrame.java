/*
 * 
 */
package JODES.vues;
import javax.swing.*;
import JODES.controleurs.*;
import JODES.modeles.Administrateur;
import java.awt.*;

// TODO: Auto-generated Javadoc
/**
 * The Class SessionFrame.
 *
 * @author Kincy Saad
 */
public class SessionFrame extends JFrame implements RetourVue {

	/** The admin. */
	Administrateur admin;

    /**
     * Instantiates a new session frame.
     *
     * @param admin the admin
     */
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
        ControleurBtnSupprSession ctrlSupprSes = new ControleurBtnSupprSession(this, admin);
        ControleurBtnAjSession ctrlAjSes = new ControleurBtnAjSession(this, admin);
        ControleurBtnModSession ctrlModSes = new ControleurBtnModSession(this, admin);
        
        panelButton.boutonSupprimer.addActionListener(ctrlSupprSes);
        panelButton.boutonAjouter.addActionListener(ctrlAjSes);
        panelButton.boutonModifier.addActionListener(ctrlModSes);
        
        //Nicolas 
        JButton button = new JButton("Retour" + "\u21A9");
        ControleurBtnRetour BtnRetour = new ControleurBtnRetour(this);
        button.addActionListener(BtnRetour);
        add(button,BorderLayout.SOUTH);
        //pas Nicolas
        
        // Make the frame visible
        setVisible(true);

        // Exit the application when the frame is closed
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }

    /**
     * Retour.
     * @author Nicolas Vouilloux
     */
	@Override
	public void retour() {
		new HomePageFrame(admin);
		this.dispose();
	}
}

