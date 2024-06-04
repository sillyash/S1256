package interface_graphique;

import javax.swing.*;
import java.awt.*;

public class EpreuveFrame extends JFrame {

    public EpreuveFrame() {
        // Create main frame
        super("Gestion des Epreuves - Paris 2024");
        setSize(400, 400);
        setLayout(new BorderLayout());

        // Create panels
        PanelTitle panelTitle = new PanelTitle("Epreuves");
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
    	//Create the mainEpreuve frame
        EpreuveFrame Epreuve = new EpreuveFrame();
    }
}
