//correct package - Emma
package JODES.vues;
import JODES.JO2024;
import JODES.controleurs.ControleurBTNRetour;
import JODES.controleurs.ControleurBtnSelectEquipe;
import JODES.controleurs.RetourVue;
import java.awt.*;
import javax.swing.*;

//correct naming of class - Emma
public class SelectionEquipe extends JFrame implements RetourVue {

    private static final long serialVersionUID = 1L;
    protected ComboBoxEquipe combo;
    protected JButton valider;
    protected JPanel panelDel;
    protected JLabel indicationDelete;
    protected JPanel panelIndication;

    public SelectionEquipe() {
        // Create main frame
        super("Selection d'une équipe");
        setSize(800, 450);
        setLayout(new GridLayout (4,1));

        // Initialize elements
        PanelTitle panelTitle = new PanelTitle("Epreuves");
        add(panelTitle); 
        valider = new JButton("✔");
        combo = new ComboBoxEquipe(JO2024.getEquipes());
        valider.addActionListener(new ControleurBtnSelectEquipe(combo, ControleurBtnSelectEquipe.MODIF));
        indicationDelete = new JLabel("Veuillez sélectionner l'équipe à modifier :",JLabel.CENTER);

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
        ControleurBTNRetour BtnRetour = new ControleurBTNRetour(this);
        button.addActionListener(BtnRetour);
        add(button);//TODO mettre le bouton au bon endroit
        //pas Nicolas
        // Make the frame visible
        setVisible(true);

        // Exit the application when the frame is closed
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Création d'un nouveau panelTitle 
        
        // Pack the frame to fit its components
        pack();
    }

    public static void main(String[] args) {
        new SelectionEquipe();
    }

	@Override
	public void retour() {
		new EquipeFrame();
		this.dispose();
	}
}


