/*
 * 
 */
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


/**
 * The Class AjouterEpreuve.
 *
 * @author Nicolas Vouilloux
 */
public class AjouterEpreuve extends JFrame implements RetourVue, SauvegarderQuitter{
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;
	
	/** The admin. */
	Administrateur admin;
	
	/** The TX nom. */
	TXField TXNom = new TXField("");
	
	/** The cbe1. */
	ComboBoxEquipe CBE1;
	
	/** The cbe2. */
	ComboBoxEquipe CBE2;
	
	/** The cbs. */
	ComboBoxSession CBS;
	
	/**
	 * Instantiates a new ajouter epreuve.
	 *
	 * @param admin the admin
	 */
	public AjouterEpreuve(Administrateur admin) {
        
		super("JODES");
        this.admin = admin;
        CBE1 = new ComboBoxEquipe(JO2024.getEquipes());
        CBE2 = new ComboBoxEquipe(JO2024.getEquipes());
        CBS = new ComboBoxSession(JO2024.getSessions());
        
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

    /**
     * Retour.
	 * @author Nicolas Vouilloux
     */
	@Override
	public void retour() {
		new EpreuveFrame(admin);
		(this).dispose();
	}

	/**
	 * @author Ash Merienne
	 * Save quit.
	 */
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
				TXNom.getText(),
				equipes,
				CBS.getSelectedEntite()
			);
			admin.creerEntite(e);
			admin.enregisterModifications();
			JOptionPane.showMessageDialog(null, "Épreuve créée !");
			retour();
		}
	}
}