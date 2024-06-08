package JODES.vues;
import javax.swing.*;
import JODES.JO2024;
import JODES.controleurs.ControleurBtnSauvegarderQuitter;
import JODES.controleurs.SauvegarderQuitter;
import JODES.controleurs.UpdateAthlete;
import java.awt.*;
import JODES.modeles.Administrateur;
import JODES.modeles.Athlete;

public class AjouterAthlete extends JFrame implements SauvegarderQuitter{

	private static final long serialVersionUID = 1L;
	Administrateur admin;
	TXField TXNom = new TXField("");
	TXField TXPrenom = new TXField("");
	TXField TXBiographie = new TXField("");
	ComboBoxPays CMBP;
	UpdateAthlete vue;
	
	public AjouterAthlete(UpdateAthlete vue, Administrateur admin) {
        super("JODES");
        this.admin = admin;
        this.vue = vue;
        CMBP = new ComboBoxPays(JO2024.getPays());
        
        PanelTitle panelTitle = new PanelTitle("Ajouter athlete");
        JButton buttonSave = new JButton("Sauvegarder et quitter");
        ControleurBtnSauvegarderQuitter btnSaveQuit = new ControleurBtnSauvegarderQuitter(this);
        buttonSave.addActionListener(btnSaveQuit);
        add(panelTitle, BorderLayout.NORTH);
        add(buttonSave,BorderLayout.SOUTH);
        
        JPanel panelDuMilieu = new JPanel();
        panelDuMilieu.setLayout(new GridLayout(3,2));
        panelDuMilieu.add(new GridFormField(TXNom,new JLabel("Nom* :")));
		panelDuMilieu.add(new GridFormField(TXPrenom,new JLabel("Prenom* :")));
		panelDuMilieu.add(new GridFormField(CMBP,new JLabel("Pays* :")));
        panelDuMilieu.add(new GridFormField(TXBiographie,new JLabel("Biographie* :")));
		add(panelDuMilieu,BorderLayout.CENTER);
      
        setSize(800, 450);
        setVisible(true);
    }
    
	@Override
	public void saveQuit() {
		Athlete a;
		if (!TXNom.parseField())
			JOptionPane.showMessageDialog(null,"Erreur : champ non rempli (Nom)");
		else if (!TXPrenom.parseField())
			JOptionPane.showMessageDialog(null,"Erreur : champ non rempli (Prénom)");
		else if ((CMBP).isSelectedNull())
			JOptionPane.showMessageDialog(null,"Erreur : champ non rempli (Pays)");
		else if (!TXBiographie.parseField())
			JOptionPane.showMessageDialog(null,"Erreur : champ non rempli (Biographie)");
		else {
			a = new Athlete(
				TXPrenom.getText(),
				TXNom.getText(),
				CMBP.getSelectedEntite(),
				TXBiographie.getText()
			);
			admin.creerEntite(a);
			admin.enregisterModifications();
			JOptionPane.showMessageDialog(null, "Athlète créé !");
			vue.udpateAthletes();
			this.dispose();
		}
	}
}