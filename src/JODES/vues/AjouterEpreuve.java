package JODES.vues;
import javax.swing.*;
import JODES.JO2024;
import JODES.controleurs.ControleurBtnRetour;
import JODES.controleurs.ControleurBtnSauvegarderQuitter;
import JODES.controleurs.RetourVue;
import JODES.controleurs.SauvegarderQuitter;
import JODES.modeles.Administrateur;
import JODES.modeles.Epreuve;
import JODES.modeles.Equipe;
import java.awt.*;
import java.util.ArrayList;

public class AjouterEpreuve extends JFrame implements RetourVue, SauvegarderQuitter{
	
	private static final long serialVersionUID = 1L;
	Administrateur admin;
	TXField TXNom = new TXField("");
	ComboBoxEquipe CBE1 = new ComboBoxEquipe(JO2024.getEquipes());
	ComboBoxEquipe CBE2 = new ComboBoxEquipe(JO2024.getEquipes());
	ComboBoxSession CBS = new ComboBoxSession(JO2024.getSessions());
	
	public AjouterEpreuve(Administrateur admin) {
        
		super("JODES");
        this.admin = admin;
        PanelTitle panelTitle = new PanelTitle("Ajouter épreuve");
        JButton button = new JButton("Retour" + "\u21A9");
        ControleurBtnRetour btnretour = new ControleurBtnRetour(this);
        
        JButton buttonSave = new JButton("Sauvegarder & Quitter" + "🖉");
        ControleurBtnSauvegarderQuitter btnSaveQuit = new ControleurBtnSauvegarderQuitter(this);
        buttonSave.addActionListener(btnSaveQuit);
        
        add(button, BorderLayout.SOUTH);
        add(panelTitle, BorderLayout.NORTH);
        button.addActionListener(btnretour);
        
        JPanel panelSaveRetour = new JPanel();
        panelSaveRetour.setLayout(new GridLayout(2,1));
        panelSaveRetour.add(buttonSave);
        panelSaveRetour.add(button);
        add(panelSaveRetour,BorderLayout.SOUTH);
        
        JPanel panelDuMilieu = new JPanel();
        panelDuMilieu.setLayout(new GridLayout(3,2));
        panelDuMilieu.add(new GridFormField(TXNom,new JLabel("Nom Epreuve* :")));
        panelDuMilieu.add(new GridFormField(CBS,new JLabel("Session* :")));
        panelDuMilieu.add(new GridFormField(CBE1,new JLabel("Équipe 1* :")));
        panelDuMilieu.add(new GridFormField(CBE2,new JLabel("Équipe 2* :")));
		add(panelDuMilieu,BorderLayout.CENTER);
        
		add(panelDuMilieu,BorderLayout.CENTER);
        
      
        setSize(800, 450);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
    	Administrateur admin = new Administrateur("admin", "", "tst", "ttest");
        AjouterEpreuve testAffichage = new AjouterEpreuve(admin);
    }
    //Nicolas
	@Override
	public void retour() {
		new EpreuveFrame(admin);
		(this).dispose();
	}

	@Override
	public void saveQuit() {
		Epreuve e;
		ArrayList<Equipe> equipes = new ArrayList<>();
		if (!TXNom.parseField())
			JOptionPane.showMessageDialog(null,"Erreur : champ non rempli (Nom)");
		else if (CBS.isSelectedNull())
			JOptionPane.showMessageDialog(null,"Erreur : champ non rempli (Session)");
		else if (CBE1.isSelectedNull())
			JOptionPane.showMessageDialog(null,"Erreur : champ non rempli (Équipe 1)");
		else if (CBE2.isSelectedNull())
			JOptionPane.showMessageDialog(null,"Erreur : champ non rempli (Équipe 2)");
		else {
			equipes.add(CBE1.getSelectedEntite());
			equipes.add(CBE2.getSelectedEntite());
			e = new Epreuve(
				TXNom.getSelectedText(),
				equipes,
				CBS.getSelectedEntite()
			);
			JO2024.addEntite(e);
			JOptionPane.showMessageDialog(null, "Épreuve créée !");
			new EpreuveFrame(admin);
			(this).dispose();
		}
	}
}