package JODES.vues;
import javax.swing.*;
import JODES.JO2024;
import JODES.controleurs.ControleurBtnRetour;
import JODES.controleurs.ControleurBtnSauvegarderQuitter;
import JODES.controleurs.RetourVue;
import JODES.controleurs.SauvegarderQuitter;
import JODES.modeles.Epreuve;
import JODES.modeles.Equipe;

import java.awt.*;

public class ModifierEpreuve extends JFrame implements RetourVue, SauvegarderQuitter{

	private static final long serialVersionUID = 1L;
	protected Epreuve epreuveModele;
	
	public ModifierEpreuve(Epreuve epreuve) {
        
        super("JODES");
        this.epreuveModele = epreuve;
        PanelTitle panelTitle = new PanelTitle("Ajouter epreuve");
        JButton button = new JButton("Retour" + "\u21A9");
        ControleurBtnRetour btnretour = new ControleurBtnRetour(this);
        
        add(button, BorderLayout.SOUTH);
        JButton buttonSave = new JButton("Sauvegarder & Quitter" + "🖉");
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
        panelDuMilieu.setLayout(new GridLayout(3,2));
        panelDuMilieu.add(new GridFormField(new JTextField(epreuveModele.getNom()),new JLabel("Nom Epreuve :")));
		panelDuMilieu.add(new GridFormField(new ComboBoxHoraires(),new JLabel("Horaire Debut :")));
		panelDuMilieu.add(new GridFormField(new ComboBoxHoraires(),new JLabel("Horaire Fin :")));
        panelDuMilieu.add(new GridFormField(new ComboBoxEpreuve(JO2024.getEpreuves()),new JLabel("Session :")));
		add(panelDuMilieu,BorderLayout.CENTER);
      
        setSize(800, 450);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    //Nicolas
	@Override
	public void retour() {
		new EpreuveFrame();
		(this).dispose();
	}
	@Override
	public void SauvegarderQuitter() {
		// TODO Auto-generated method stub
		
	}
}