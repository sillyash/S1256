package JODES.vues;
import javax.swing.*;
import JODES.JO2024;
import JODES.controleurs.ControleurBtnRetour;
import JODES.controleurs.ControleurBtnSauvegarderQuitter;
import JODES.controleurs.RetourVue;
import JODES.controleurs.SauvegarderQuitter;
import JODES.modeles.Administrateur;
import JODES.modeles.Epreuve;
import java.awt.*;

public class ModifierEpreuve extends JFrame implements RetourVue, SauvegarderQuitter{

	private static final long serialVersionUID = 1L;
	protected Epreuve epreuveModele;
	Administrateur admin;
	JTextField TXFNomEpr = new JTextField(epreuveModele.getNom());
	ComboBoxHoraires CMBDeb = new ComboBoxHoraires();
	ComboBoxHoraires CMBFin = new ComboBoxHoraires();
	ComboBoxSession CMBSes = new ComboBoxSession(JO2024.getSessions());
	
	public ModifierEpreuve(Epreuve epreuve, Administrateur admin) {
        
        super("JODES");
        this.epreuveModele = epreuve;
        this.admin = admin;
        PanelTitle panelTitle = new PanelTitle("Modifier épreuve");
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
        panelDuMilieu.add(new GridFormField(TXFNomEpr,new JLabel("Nom Epreuve :")));
		panelDuMilieu.add(new GridFormField(CMBDeb ,new JLabel("Horaire Debut :")));
		panelDuMilieu.add(new GridFormField(CMBFin ,new JLabel("Horaire Fin :")));
        panelDuMilieu.add(new GridFormField(CMBSes ,new JLabel("Session :")));
		add(panelDuMilieu,BorderLayout.CENTER);
      
        setSize(800, 450);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
	
    //Nicolas
	@Override
	public void retour() {
		new EpreuveFrame(admin);
		(this).dispose();
	}
	@Override
	public void saveQuit() {
		if (TXFNomEpr.getText() == "")
			javax.swing.JOptionPane.showMessageDialog(null,"Erreur Entite Null");
		else if (CMBDeb.isSelectedNull())
			javax.swing.JOptionPane.showMessageDialog(null,"Erreur Entite Null");
		else if (CMBFin.isSelectedNull())
			javax.swing.JOptionPane.showMessageDialog(null,"Erreur Entite Null");
		else if (CMBSes.isSelectedNull())
			javax.swing.JOptionPane.showMessageDialog(null,"Erreur Entite Null");
		else
			// TODO add code to save modifications
			new EpreuveFrame(admin);
			(this).dispose();
		
	}
}