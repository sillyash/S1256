package JODES.vues;
import javax.swing.*;
import JODES.JO2024;
import JODES.controleurs.ControleurBtnRetour;
import JODES.controleurs.ControleurBtnSauvegarderQuitter;
import JODES.controleurs.RetourVue;
import JODES.controleurs.SauvegarderQuitter;
import JODES.modeles.Session;

import java.awt.*;

public class AjouterSession extends JFrame implements RetourVue, SauvegarderQuitter{

	public AjouterSession() {
        super("JODES");
        
        PanelTitle panelTitle = new PanelTitle("Ajouter session");
        JButton button = new JButton("Retour" + "\u21A9");
        ControleurBtnRetour btnretour = new ControleurBtnRetour(this);
        add(button, BorderLayout.SOUTH);
        JButton buttonSave = new JButton("Sauvegarder et quitter");
        ControleurBtnSauvegarderQuitter btnSaveQuit = new ControleurBtnSauvegarderQuitter(this);
        buttonSave.addActionListener(btnSaveQuit);
        add(panelTitle, BorderLayout.NORTH);
        button.addActionListener(btnretour);
        
        JPanel panelSaveRetour = new JPanel();
        panelSaveRetour.setLayout(new GridLayout(2,1));
        panelSaveRetour.add(buttonSave);
        panelSaveRetour.add(button);
        add(panelSaveRetour,BorderLayout.SOUTH);
        
        JPanel panelDuMilieu = new JPanel();
        panelDuMilieu.setLayout(new GridLayout(4,2));
		panelDuMilieu.add(new GridFormField(new JTextField(""),new JLabel("Nom :")));
		panelDuMilieu.add(new GridFormField(new ComboBoxStatutSession(),new JLabel("Statut :")));
		panelDuMilieu.add(new GridFormField(new ComboBoxPays(JO2024.getPays()),new JLabel("Pays :")));
		panelDuMilieu.add(new GridFormField(new DatePicker(),new JLabel("Date :")));
		panelDuMilieu.add(new GridFormField(new ComboBoxHoraires(),new JLabel("Horaire debut :")));
		panelDuMilieu.add(new GridFormField(new ComboBoxHoraires(),new JLabel("Horaire fin :")));
		panelDuMilieu.add(new GridFormField(new ComboBoxLieu(JO2024.getLieux()),new JLabel("Lieu :")));
		panelDuMilieu.add(new GridFormField(new ComboBoxDiscipline(JO2024.getDisciplines()),new JLabel("Discipline :")));
		add(panelDuMilieu);
      
        setSize(800, 450);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
	public static void main(String[] args) {
        JO2024.initialize();
		new AjouterSession();
    }

    //Nicolas
	@Override
	public void retour() {
		new SessionFrame();
		(this).dispose();
	}
	@Override
	public void SauvegarderQuitter() {
		// TODO Auto-generated method stub
		
	}
}