//correct package - Emma
package JODES.vues;

import java.awt.*;
import javax.swing.*;

public class SuppressionSession extends JFrame {
    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    protected JTextField sessionDel;
    protected JButton valider;
    protected JPanel panelDel;
    protected JLabel indicationDelete;
    protected JPanel panelIndication;

    public SuppressionSession() {
        // Create main frame
        super("Gestion des Sessions - Session");
        setSize(800, 450);
        setLayout(new BorderLayout());

        // Initialize elements
        valider = new JButton("✔");
        sessionDel = new JTextField("Id...",15);
        indicationDelete = new JLabel("Veuillez saisir l'Id de la session à supprimer",JLabel.CENTER);
        

        // Initialize the panels
        panelDel = new JPanel();
        panelDel.setLayout(new FlowLayout());
        panelIndication = new JPanel();
        panelIndication.setLayout(new FlowLayout());

        //Add elements to panelIndication
        panelIndication.add(indicationDelete);
        
        // Add elements to panelDel
        panelDel.add(sessionDel);
        panelDel.add(valider);

        // Add panelDel and panelIndication to frame
        add(panelIndication,BorderLayout.CENTER);
        add(panelDel, BorderLayout.SOUTH);

        // Make the frame visible
        setVisible(true);

        // Exit the application when the frame is closed
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Création d'un nouveau panelTitle 
        PanelTitle panelTitle = new PanelTitle("Sessions");
        add(panelTitle, BorderLayout.NORTH); 
        
        // Pack the frame to fit its components
        pack();
    }

    public static void main(String[] args) {
        new SuppressionSession();
    }
}

