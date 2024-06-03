package interface_graphique;

import javax.swing.*;
import java.awt.*;

public class PanelTitle extends JPanel {
    JLabel title;

    public PanelTitle(String titleText) {
        title = new JLabel(titleText);
        title.setFont(new Font("Arial", Font.BOLD, 24));
        title.setForeground(Color.WHITE);
        add(title);
        setBackground(Color.DARK_GRAY); // Set background color for the panel
        setPreferredSize(new Dimension(400, 50)); // Set preferred size for the title panel
    }
}
