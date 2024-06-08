package JODES.vues;
import javax.swing.*;
import JODES.JO2024;
import JODES.controleurs.ControleurBtnRetour;
import JODES.controleurs.RetourVue;
import JODES.controleurs.SauvegarderQuitter;
import JODES.modeles.Administrateur;
import JODES.modeles.Session;

import java.awt.*;

public class ModifierSession extends JFrame implements RetourVue, SauvegarderQuitter{

    protected Session sessionModele;
    Administrateur admin;
    JTextField TXFNom = new JTextField();
    ComboBoxStatutSession CMBStatSes = new ComboBoxStatutSession();
    ComboBoxPays CMBPays = new ComboBoxPays(JO2024.getPays());
    DatePicker DPSes = new DatePicker();
    ComboBoxHoraires CMBDeb = new ComboBoxHoraires();
    ComboBoxHoraires CMBFin =new ComboBoxHoraires();
    ComboBoxLieu CMBLieu = new ComboBoxLieu(JO2024.getLieux());
    ComboBoxDiscipline CMBDisci = new ComboBoxDiscipline(JO2024.getDisciplines());

	public ModifierSession(Session session, Administrateur admin) {
        super("JODES");
        this.admin = admin;
        this.sessionModele = session;
        PanelTitle panelTitle = new PanelTitle("Modifier session");
        JButton button = new JButton("Retour" + "\u21A9");
        ControleurBtnRetour btnretour = new ControleurBtnRetour(this);
        
        add(button, BorderLayout.SOUTH);
        JButton buttonSave = new JButton("Sauvegarder & Quitter" + "🖉");
      
        add(panelTitle, BorderLayout.NORTH);
        button.addActionListener(btnretour);
        
        JPanel panelSaveRetour = new JPanel();
        panelSaveRetour.setLayout(new GridLayout(2,1));
        panelSaveRetour.add(buttonSave);
        panelSaveRetour.add(button);
        add(panelSaveRetour,BorderLayout.SOUTH);
        
        JPanel panelDuMilieu = new JPanel();
        panelDuMilieu.setLayout(new GridLayout(4,2));
		panelDuMilieu.add(new GridFormField(TXFNom ,new JLabel("Nom :")));
		panelDuMilieu.add(new GridFormField(CMBStatSes ,new JLabel("Statut :")));
		panelDuMilieu.add(new GridFormField(CMBPays ,new JLabel("Pays :")));
		panelDuMilieu.add(new GridFormField(DPSes ,new JLabel("Date :")));
		panelDuMilieu.add(new GridFormField(CMBDeb ,new JLabel("Horaire debut :")));
		panelDuMilieu.add(new GridFormField(CMBFin ,new JLabel("Horaire fin :")));
		panelDuMilieu.add(new GridFormField(CMBLieu ,new JLabel("Lieu :")));
		panelDuMilieu.add(new GridFormField(CMBDisci ,new JLabel("Lieu :")));
		add(panelDuMilieu,BorderLayout.CENTER);
      
        setSize(800, 450);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
	
    //Nicolas
	@Override
	public void retour() {
		new SessionFrame(admin);
		(this).dispose();
	}

	@Override
	public void saveQuit() {
		if (TXFNom.getText() == "")
			javax.swing.JOptionPane.showMessageDialog(null,"Erreur Entite Null");
		else if (CMBStatSes.isSelectedNull())
			javax.swing.JOptionPane.showMessageDialog(null,"Erreur Entite Null");
		else if (CMBPays.isSelectedNull())
			javax.swing.JOptionPane.showMessageDialog(null,"Erreur Entite Null");
		else if (DPSes.comboBoxDay.isSelectedNull())
			javax.swing.JOptionPane.showMessageDialog(null,"Erreur Entite Null");
		else if (DPSes.comboBoxMonth.isSelectedNull())
			javax.swing.JOptionPane.showMessageDialog(null,"Erreur Entite Null");
		else if (DPSes.comboBoxYear.isSelectedNull())
			javax.swing.JOptionPane.showMessageDialog(null,"Erreur Entite Null");
		else if (CMBDeb.isSelectedNull())
			javax.swing.JOptionPane.showMessageDialog(null,"Erreur Entite Null");
		else if (CMBFin.isSelectedNull())
			javax.swing.JOptionPane.showMessageDialog(null,"Erreur Entite Null");
		else if (CMBLieu.isSelectedNull())
			javax.swing.JOptionPane.showMessageDialog(null,"Erreur Entite Null");
		else if (CMBDisci.isSelectedNull())
			javax.swing.JOptionPane.showMessageDialog(null,"Erreur Entite Null");
		else
			//TODO add code to save modifications
			new SessionFrame(admin);
			(this).dispose();
	}
}