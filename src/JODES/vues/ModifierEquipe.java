package JODES.vues;
import javax.swing.*;

import JODES.JO2024;
import JODES.controleurs.ControleurBtnRetour;
import JODES.controleurs.ControleurBtnSauvegarderQuitter;
import JODES.controleurs.RetourVue;
import JODES.controleurs.SauvegarderQuitter;

import java.awt.*;
import java.util.ArrayList;

import JODES.modeles.Administrateur;
import JODES.modeles.Athlete;
import JODES.modeles.Equipe;

public class ModifierEquipe extends JFrame implements RetourVue, SauvegarderQuitter{

	private static final long serialVersionUID = 1L;
	protected Equipe equipe;
	Administrateur admin;
	PanelChoisirAthlete PCA1 = new PanelChoisirAthlete(admin);
    PanelChoisirAthlete PCA2 = new PanelChoisirAthlete(admin);
    PanelChoisirAthlete PCA3 = new PanelChoisirAthlete(admin);
    PanelChoisirAthlete PCA4 = new PanelChoisirAthlete(admin);
    ComboBoxPays CMBPays = new ComboBoxPays(JO2024.getPays());
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

		panelDuMilieu.add(new GridFormField(TXFnom,new JLabel("Nom Equipe* :")));
		panelDuMilieu.add(new GridFormField(CMBPays,new JLabel("Pays* :")));
		panelDuMilieu.add(new GridFormField(PCA1,new JLabel("Athlete :")));
		panelDuMilieu.add(new GridFormField(PCA2,new JLabel("Athlete :")));
		panelDuMilieu.add(new GridFormField(PCA3,new JLabel("Athlete :")));
		panelDuMilieu.add(new GridFormField(PCA4,new JLabel("Athlete :")));
		add(panelDuMilieu,BorderLayout.CENTER);

		try {
			TXFnom.setText(equipe.getNom());
			CMBPays.setSelectedIndex(CMBPays.getItemList().indexOf(equipe.getSonPays()));
			PCA1.getCmb().setSelectedIndex(PCA1.getCmb().getItemList().indexOf(equipe.getSesAthletes().get(0)));
			PCA2.getCmb().setSelectedIndex(PCA1.getCmb().getItemList().indexOf(equipe.getSesAthletes().get(1)));
			if (equipe.getSesAthletes().size() > 2)
				PCA3.getCmb().setSelectedIndex(PCA1.getCmb().getItemList().indexOf(equipe.getSesAthletes().get(2)));
			if (equipe.getSesAthletes().size() > 3)
				PCA4.getCmb().setSelectedIndex(PCA1.getCmb().getItemList().indexOf(equipe.getSesAthletes().get(3)));
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
		new EquipeFrame(admin);
		(this).dispose();
	}

	@Override
	public void saveQuit() {
		Equipe e;
		ArrayList<Athlete> athletes = new ArrayList<>();
		boolean[] boolAthletes = new boolean[4];
		int nbAthletesNull = 0;

		if ((PCA1.getCmb()).isSelectedNull())
			boolAthletes[0] = true;
		if ((PCA2.getCmb()).isSelectedNull())
			boolAthletes[1] = true;
		if ((PCA3.getCmb()).isSelectedNull())
			boolAthletes[2] = true;
		if ((PCA4.getCmb()).isSelectedNull())
			boolAthletes[3] = true;

		for (int i=0; i<boolAthletes.length; i++) {
			if (boolAthletes[i] == true)
				nbAthletesNull+=1;
		}

		if (TXFnom.getText()=="")
			JOptionPane.showMessageDialog(null,"Erreur : champ non rempli (Nom)");
		else if (CMBPays.isSelectedNull())
			JOptionPane.showMessageDialog(null,"Erreur : champ non rempli (Pays)");
		else if (nbAthletesNull > 2)
			JOptionPane.showMessageDialog(null,
			"Erreur : champ(s) non rempli(s),\nil faut renseigner minimum 2 athlètes.");
		else {
			if (!PCA1.getCmb().isSelectedNull())
				athletes.add(PCA1.getCmb().getSelectedEntite());
			if (!PCA2.getCmb().isSelectedNull())
				athletes.add(PCA2.getCmb().getSelectedEntite());
			if (!PCA3.getCmb().isSelectedNull())
				athletes.add(PCA3.getCmb().getSelectedEntite());
			if (!PCA4.getCmb().isSelectedNull())
				athletes.add(PCA4.getCmb().getSelectedEntite());

			e = new Equipe(
				TXFnom.getText(),
				CMBPays.getSelectedEntite(),
				athletes
			);
			admin.modifierEntite(e);
			JOptionPane.showMessageDialog(null, "Équipe modifiée !");
			retour();
		}
	}
}