package JODES.vues;
import javax.swing.*;

import JODES.JO2024;
import JODES.controleurs.ControleurBTNRetour;
import JODES.controleurs.RetourVue;
import java.awt.*;
import JODES.modeles.Equipe;

public class AjouterAthlete extends JFrame{

	private static final long serialVersionUID = 1L;

	public AjouterAthlete() {
        super("JODES");
        
        PanelTitle panelTitle = new PanelTitle("Ajouter athlete");
        JButton buttonSave = new JButton("Sauvegarder et quitter");
      
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
		new AjouterAthlete();
    }

}