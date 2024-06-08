/*
 * 
 */
package JODES.vues;

import javax.swing.*;
import java.awt.*;

// TODO: Auto-generated Javadoc
/**
 * The Class PanelButton.
 *
 * @author Kincy Saad
 */
public class PanelButton extends JPanel {

    /** The bouton afficher. */
    protected JButton boutonAfficher;
    
    /** The bouton modifier. */
    protected JButton boutonModifier;
    
    /** The bouton ajouter. */
    protected JButton boutonAjouter;
    
    /** The bouton supprimer. */
    protected JButton boutonSupprimer;

    /**
     * Instantiates a new panel button.
     */
    public PanelButton() {
        boutonAfficher = new JButton("Afficher");
        boutonModifier = new JButton("Modifier");
        boutonAjouter = new JButton("Ajouter");
        boutonSupprimer = new JButton("Supprimer");

        // Setting button colors
        setButtonColors(boutonAfficher);
        setButtonColors(boutonModifier);
        setButtonColors(boutonAjouter);
        setButtonColors(boutonSupprimer);

        setLayout(new GridLayout(4, 1, 10, 10)); // 4 rows, 1 column, gaps of 10px
        add(boutonAfficher);
        add(boutonModifier);
        add(boutonAjouter);
        add(boutonSupprimer);
    }

    /**
     * Sets the button colors.
     *
     * @param button the new button colors
     */
    protected void setButtonColors(JButton button) {
        button.setBackground(Color.lightGray);
        button.setForeground(Color.WHITE);
    }
}
