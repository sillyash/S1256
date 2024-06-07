//correct package - Emma
package JODES.vues;
import JODES.JO2024;
import JODES.controleurs.ControleurBtnRetour;
import JODES.controleurs.ControleurBtnSelectEpreuve;
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
        setLayout(new BorderLayout());

        // Title
        PanelTitle panelTitle = new PanelTitle("Équipes");
        add(panelTitle,BorderLayout.NORTH);

        // Initialize elements
        valider = new JButton("✔");
        combo = new ComboBoxEquipe(JO2024.getEquipes());
        valider.addActionListener(new ControleurBtnSelectEquipe(combo, ControleurBtnSelectEquipe.MODIF));
        indicationDelete = new JLabel("Veuillez sélectionner l'équipe à modifier :",JLabel.CENTER);

        // Panel
        panelDel = new JPanel();
        panelDel.setLayout(new GridLayout(2,1));
        panelDel.add(indicationDelete);
        
        JPanel panelChoix = new JPanel(new GridLayout(2,2));
        panelChoix.add(combo, BorderLayout.LINE_START);
        panelChoix.add(valider, BorderLayout.PAGE_END);
        panelChoix.add(new JLabel()); // to create empty space
        
        panelDel.add(panelChoix);
        add(panelDel,BorderLayout.CENTER);

        //Nicolas 
        JButton button = new JButton("Retour" + "\u21A9");
        ControleurBtnRetour BtnRetour = new ControleurBtnRetour(this);
        button.addActionListener(BtnRetour);
        add(button,BorderLayout.SOUTH);
        
        // Make the frame visible
        setSize(800, 450);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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


