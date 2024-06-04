package interface_graphique;

import javax.swing.*;
import java.awt.*;

public class EquipeFrame extends JFrame {

    public EquipeFrame() {
        // Create main frame
        super("Gestion des Équipes - Paris 2024");
        setSize(400, 400);
        setLayout(new BorderLayout());

        // Create panels
        PanelTitle panelTitle = new PanelTitle("Equipes");
        PanelButton panelButton = new PanelButton();

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
}
