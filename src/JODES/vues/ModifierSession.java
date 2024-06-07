package JODES.vues;
import javax.swing.*;
import JODES.JO2024;
import JODES.controleurs.ControleurBTNRetour;
import JODES.controleurs.RetourVue;
import JODES.modeles.Session;

import java.awt.*;

public class ModifierSession extends JFrame implements RetourVue{

    protected Session sessionModele;

	public ModifierSession(Session sessionModele) {
        super("JODES");
        this.sessionModele = sessionModele;
        
        PanelTitle panelTitle = new PanelTitle("Session Création");
        JButton button = new JButton("Retour" + "\u21A9");
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
        panelDuMilieu.setLayout(new GridLayout(4,2));
		panelDuMilieu.add(new GridFormField(new JTextField(""),new JLabel("Nom :")));
		panelDuMilieu.add(new GridFormField(new ComboBoxStatutSession(),new JLabel("Statut :")));
		panelDuMilieu.add(new GridFormField(new ComboBoxPays(JO2024.getPays()),new JLabel("Pays :")));
		panelDuMilieu.add(new GridFormField(new DatePicker(),new JLabel("Date :")));
		panelDuMilieu.add(new GridFormField(new ComboBoxHoraires(),new JLabel("Horaire debut :")));
		panelDuMilieu.add(new GridFormField(new ComboBoxHoraires(),new JLabel("Horaire fin :")));
		panelDuMilieu.add(new GridFormField(new ComboBoxLieu(JO2024.getLieux()),new JLabel("Lieu :")));
		panelDuMilieu.add(new GridFormField(new ComboBoxDiscipline(JO2024.getDisciplines()),new JLabel("Lieu :")));
		add(panelDuMilieu,BorderLayout.CENTER);
      
        setSize(800, 450);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
	
    //Nicolas
	@Override
	public void retour() {
		new SessionFrame();
		(this).dispose();
	}
}