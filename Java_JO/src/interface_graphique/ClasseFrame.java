package interface_graphique;

import javax.swing.*;
import java.awt.*;

public class ClasseFrame extends JFrame {

	public ClasseFrame() {
        // Create main frame
        super("Gestion des Classes - Paris 2024");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Create panels
        PanelTitle panelTitle = new PanelTitle("Classes");
        PanelButton panelButton = new PanelButton();

        // Add panels to frame
        add(panelTitle, BorderLayout.NORTH);
        add(panelButton, BorderLayout.CENTER);

        // Make the frame visible
        setVisible(true);
    }

    public static void main(String[] args) {
        new ClasseFrame();
    }
}

