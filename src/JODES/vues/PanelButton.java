package interface_graphique;

import javax.swing.*;
import java.awt.*;

public class PanelButton extends JPanel {

    JButton boutonAfficher;
    JButton boutonCreer;
    JButton boutonAjouter;
    JButton boutonSupprimer;

    public PanelButton() {
        boutonAfficher = new JButton("Afficher");
        boutonCreer = new JButton("Créer");
        boutonAjouter = new JButton("Ajouter");
        boutonSupprimer = new JButton("Supprimer");

        // Setting button colors
        setButtonColors(boutonAfficher);
        setButtonColors(boutonCreer);
        setButtonColors(boutonAjouter);
        setButtonColors(boutonSupprimer);

        setLayout(new GridLayout(4, 1, 10, 10)); // 4 rows, 1 column, gaps of 10px
        add(boutonAfficher);
        add(boutonCreer);
        add(boutonAjouter);
        add(boutonSupprimer);
    }

    protected void setButtonColors(JButton button) {
        button.setBackground(Color.lightGray);
        button.setForeground(Color.WHITE);
    }
}
