package JODES.vues;
import javax.swing.*;
import JODES.JO2024;
import JODES.controleurs.ControleurBtnRetour;
import JODES.controleurs.ControleurBtnSauvegarderQuitter;
import JODES.controleurs.RetourVue;
import JODES.controleurs.SauvegarderQuitter;
import JODES.modeles.Administrateur;

import java.awt.*;

public class AjouterEpreuve extends JFrame implements RetourVue, SauvegarderQuitter{
	Administrateur admin;
	JTextField TXNom = new JTextField("");
	ComboBoxHoraires CBH1 = new ComboBoxHoraires();
	ComboBoxHoraires CBH2 = new ComboBoxHoraires();
	ComboBoxSession CBS1 = new ComboBoxSession(JO2024.getSessions());
	
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
        panelDuMilieu.add(new GridFormField(TXNom,new JLabel("Nom Epreuve :")));
		panelDuMilieu.add(new GridFormField(CBH1,new JLabel("Horaire Debut :")));
		panelDuMilieu.add(new GridFormField(CBH2,new JLabel("Horaire Fin :")));
        panelDuMilieu.add(new GridFormField(CBS1,new JLabel("Session :")));
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
		if ((TXNom.getText()==""))
			javax.swing.JOptionPane.showMessageDialog(null,"Erreur Entite Null");
		else if ((CBH1).isSelectedNull())
			javax.swing.JOptionPane.showMessageDialog(null,"Erreur Entite Null");
		else if ((CBH2).isSelectedNull())
			javax.swing.JOptionPane.showMessageDialog(null,"Erreur Entite Null");
		else if ((CBS1).isSelectedNull())
			javax.swing.JOptionPane.showMessageDialog(null,"Erreur Entite Null");
		else 
			//TODO enregistrer les information
			new EpreuveFrame(admin);
			(this).dispose();
	}
}