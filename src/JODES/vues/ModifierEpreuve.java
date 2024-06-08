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

public class ModifierEpreuve extends JFrame implements RetourVue, SauvegarderQuitter{

	private static final long serialVersionUID = 1L;
	protected Epreuve epreuveModele;
	Administrateur admin;
	TXField TXNom = new TXField("");
	ComboBoxEquipe CBE1;
	ComboBoxEquipe CBE2;
	ComboBoxSession CBS;
	
	public ModifierEpreuve(Epreuve epreuve, Administrateur admin) {
        
        super("JODES");
        this.epreuveModele = epreuve;
        this.admin = admin;
        CBE1 = new ComboBoxEquipe(JO2024.getEquipes());
        CBE2 = new ComboBoxEquipe(JO2024.getEquipes());
        CBS = new ComboBoxSession(JO2024.getSessions());
        
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
        panelDuMilieu.add(new GridFormField(TXNom,new JLabel("Nom Epreuve* :")));
        panelDuMilieu.add(new GridFormField(CBS,new JLabel("Session* :")));
        panelDuMilieu.add(new GridFormField(CBE1,new JLabel("Équipe 1* :")));
        panelDuMilieu.add(new GridFormField(CBE2,new JLabel("Équipe 2* :")));
		add(panelDuMilieu,BorderLayout.CENTER);
		
		try {
			TXNom.setText(epreuveModele.getNom());
			CBS.setSelectedIndex(CBS.getItemList().indexOf(epreuveModele.getSession()));
			CBE1.setSelectedIndex(CBE1.getItemList().indexOf(epreuveModele.getSesEquipes().get(0)));
			CBE2.setSelectedIndex(CBE2.getItemList().indexOf(epreuveModele.getSesEquipes().get(1)));
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null,
			"Erreur pendant le remplissage des champs.\nCertains champs pourraient être vides.");
		}
      
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
			admin.modifierEntite(epreuveModele, e);
			admin.enregisterModifications();
			JOptionPane.showMessageDialog(null, "Épreuve modifiée !");
			retour();
		}
	}
}