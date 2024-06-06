package JODES.vues;

import javax.swing.*;

import JODES.JO2024;
import JODES.controleurs.ControleurBTNRetour;
import JODES.controleurs.RetourVue;

import java.awt.*;
import java.util.ArrayList;

public class AjouterEpreuve extends JFrame implements RetourVue{

	public AjouterEpreuve() {
        
        super("Gestion des Epreuves - Paris 2024");
        
        
        PanelTitle panelTitle = new PanelTitle("Epreuves Création");
        JButton button = new JButton("retour");
        ControleurBTNRetour btnretour = new ControleurBTNRetour(this);

        add(button, BorderLayout.SOUTH);
        JButton buttonSave = new JButton("Sauvegarder et quitter");
      
        add(panelTitle, BorderLayout.NORTH);
        button.addActionListener(btnretour);
        
        JPanel panelSaveRetour = new JPanel();
        panelSaveRetour.setLayout(new GridLayout(2,1));
        panelSaveRetour.add(buttonSave);
        panelSaveRetour.add(button);
        add(panelSaveRetour,BorderLayout.SOUTH);
        
        
        JPanel panelDuMilieu = new JPanel();
        panelDuMilieu.setLayout(new GridLayout(3,2));
		panelDuMilieu.add(new GridFormField(new JTextField(""),new JLabel("Nom Equipe :")));
		panelDuMilieu.add(new GridFormField(new ComboBoxPays(JO2024.getPays()),new JLabel("Pays :")));
		panelDuMilieu.add(new GridFormField(new JTextField(""),new JLabel("Date :")));
	
		add(panelDuMilieu,BorderLayout.CENTER);
        
      
        setSize(800, 450);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        AjouterEpreuve testAffichage = new AjouterEpreuve();
    }
    //Nicolas
	@Override
	public void retour() {
		new EpreuveFrame();
		(this).dispose();
	}
}