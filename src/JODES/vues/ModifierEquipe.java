package JODES.vues;
import javax.swing.*;

import JODES.JO2024;
import JODES.controleurs.ControleurBtnRetour;
import JODES.controleurs.ControleurBtnSauvegarderQuitter;
import JODES.controleurs.RetourVue;
import JODES.controleurs.SauvegarderQuitter;

import java.awt.*;

import JODES.modeles.Administrateur;
import JODES.modeles.Equipe;

public class ModifierEquipe extends JFrame implements RetourVue, SauvegarderQuitter{

	private static final long serialVersionUID = 1L;
	protected Equipe equipe;
	Administrateur admin;
	ComboBoxPays CMBPays = new ComboBoxPays(JO2024.getPays());
	ComboBoxAthlete CMBA1 = new ComboBoxAthlete(JO2024.getAthletes());
	ComboBoxAthlete CMBA2 = new ComboBoxAthlete(JO2024.getAthletes());
	ComboBoxAthlete CMBA3 = new ComboBoxAthlete(JO2024.getAthletes());
	ComboBoxAthlete CMBA4 = new ComboBoxAthlete(JO2024.getAthletes());
	JTextField TXFnom = new JTextField();

	public ModifierEquipe(Equipe equipe, Administrateur admin) {
        super("JODES");
        this.equipe = equipe;
        this.admin = admin;
        
        PanelTitle panelTitle = new PanelTitle("Modifier équipe");
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


		panelDuMilieu.add(new GridFormField(TXFnom,new JLabel("Nom Equipe :")));
		panelDuMilieu.add(new GridFormField(CMBPays,new JLabel("Pays :")));
		panelDuMilieu.add(new GridFormField(CMBA1,new JLabel("Athlete :")));
		panelDuMilieu.add(new GridFormField(CMBA2,new JLabel("Athlete :")));
		panelDuMilieu.add(new GridFormField(CMBA3,new JLabel("Athlete :")));
		panelDuMilieu.add(new GridFormField(CMBA4,new JLabel("Athlete :")));
		add(panelDuMilieu,BorderLayout.CENTER);

        // TODO fill fields
      
        setSize(800, 450);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
	public static void main(String[] args) {
        JO2024.initialize();
        Administrateur admin = new Administrateur("admin", "", "tst", "ttest");
		new ModifierEquipe(new Equipe("",null,null), admin);
    }

    //Nicolas
	@Override
	public void retour() {
		new EquipeFrame(admin);
		(this).dispose();
	}
	@Override
	public void saveQuit() {
		if (TXFnom.getText() == "")
			javax.swing.JOptionPane.showMessageDialog(null,"Erreur Entite Null");
		else if (CMBPays.isSelectedNull())
			javax.swing.JOptionPane.showMessageDialog(null,"Erreur Entite Null");
		else if (CMBA1.isSelectedNull())
			javax.swing.JOptionPane.showMessageDialog(null,"Erreur Entite Null");
		else if (CMBA2.isSelectedNull())
			javax.swing.JOptionPane.showMessageDialog(null,"Erreur Entite Null");
		else if (CMBA3.isSelectedNull())
			javax.swing.JOptionPane.showMessageDialog(null,"Erreur Entite Null");
		else if (CMBA4.isSelectedNull())
			javax.swing.JOptionPane.showMessageDialog(null,"Erreur Entite Null");
		else
			// TODO add code to save modifications
			new EquipeFrame(admin);
			(this).dispose();
	}
}