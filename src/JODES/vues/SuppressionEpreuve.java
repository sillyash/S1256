//correct package - Emma
package JODES.vues;
import JODES.JO2024;
import JODES.controleurs.ControleurBtnRetour;
import JODES.controleurs.ControleurBtnSelectEpreuve;
import JODES.controleurs.RetourVue;
import JODES.modeles.Administrateur;

import java.awt.*;
import javax.swing.*;

public class SuppressionEpreuve extends JFrame implements RetourVue{
    
    private static final long serialVersionUID = 1L;
    protected ComboBoxEpreuve combo;
    protected JButton valider;
    protected JPanel panelDel;
    protected JLabel indicationDelete;
    protected JPanel panelIndication;
    Administrateur admin;
    
    public SuppressionEpreuve(Administrateur admin) {
        // Create main frame
        super("JODES");
        this.admin = admin;
        setSize(800, 450);
        setLayout(new GridLayout (4,1));

        // Initialize elements
        // Création d'un nouveau panelTitle 
        PanelTitle panelTitle = new PanelTitle("Epreuve");
        add(panelTitle); 
        valider = new JButton("✔");
        valider.addActionListener(new ControleurBtnSelectEpreuve(combo, ControleurBtnSelectEpreuve.SUPPR));
        combo = new ComboBoxEpreuve(JO2024.getEpreuves());
        indicationDelete = new JLabel("Veuillez sélectionner l'épreuve à supprimer :",JLabel.CENTER);

        // Initialize the panels
        panelDel = new JPanel();
        panelDel.setLayout(new FlowLayout());
        panelIndication = new JPanel();
        panelIndication.setLayout(new FlowLayout());

        //Add elements to panelIndication
        panelIndication.add(indicationDelete);
        
        // Add elements to panelDel
        panelDel.add(combo);
        panelDel.add(valider);

        // Add panelDel and panelIndication to frame
        add(panelIndication);
        add(panelDel);

        //Nicolas 
        JButton button = new JButton("Retour" + "\u21A9");
        ControleurBtnRetour BtnRetour = new ControleurBtnRetour(this);
        button.addActionListener(BtnRetour);
        add(button);//TODO mettre le bouton au bon endroit
        //pas Nicolas
        // Make the frame visible
        setSize(800, 450);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
    	Administrateur admin = new Administrateur("admin", "", "tst", "ttest");
        new SuppressionEpreuve(admin);
    }
//Nicolas
	@Override
	public void retour() {
		new EpreuveFrame(admin);
		this.dispose();
	}
}
