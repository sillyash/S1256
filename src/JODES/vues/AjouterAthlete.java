package JODES.vues;
import javax.swing.*;
import JODES.JO2024;
import JODES.controleurs.ControleurBtnSauvegarderQuitter;
import JODES.controleurs.SauvegarderQuitter;
import java.awt.*;
import JODES.modeles.Administrateur;
import JODES.modeles.Epreuve;

public class AjouterAthlete extends JFrame implements SauvegarderQuitter{

	private static final long serialVersionUID = 1L;
	Administrateur admin;
	public AjouterAthlete(Administrateur admin) {
        super("JODES");
        
        this.admin = admin;
        PanelTitle panelTitle = new PanelTitle("Ajouter athlete");
        JButton buttonSave = new JButton("Sauvegarder et quitter");
        ControleurBtnSauvegarderQuitter btnSaveQuit = new ControleurBtnSauvegarderQuitter(this);
        buttonSave.addActionListener(btnSaveQuit);
        add(panelTitle, BorderLayout.NORTH);
        add(buttonSave,BorderLayout.SOUTH);
        
        JPanel panelDuMilieu = new JPanel();
        panelDuMilieu.setLayout(new GridLayout(3,2));
        panelDuMilieu.add(new GridFormField(new JTextField(""),new JLabel("Nom :")));
		panelDuMilieu.add(new GridFormField(new JTextField(""),new JLabel("Prenom :")));
		panelDuMilieu.add(new GridFormField(new ComboBoxPays(JO2024.getPays()),new JLabel("Pays :")));
        panelDuMilieu.add(new GridFormField(new JTextField(""),new JLabel("Biographie en 3 mots max :")));
		add(panelDuMilieu,BorderLayout.CENTER);
      
        setSize(800, 450);
        setVisible(true);
    }
	public static void main(String[] args) {
        JO2024.initialize();
        Administrateur admin = new Administrateur("admin", "", "tst", "ttest");
		new AjouterAthlete(admin);
    }
    
	@Override
	public void saveQuit() {
		
		
	}

}