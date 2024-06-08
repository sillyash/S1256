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
import JODES.controleurs.UpdateAthlete;
import java.awt.*;
import java.util.ArrayList;
import JODES.modeles.Administrateur;
import JODES.modeles.Athlete;
import JODES.modeles.Equipe;


/**
 * The Class AjouterEquipe.
 *
 * @author Nicolas Vouilloux
 */
public class AjouterEquipe extends JFrame implements UpdateAthlete, RetourVue, SauvegarderQuitter{

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;
	
	/** The admin. */
	Administrateur admin;
	
	/** The pca4. */
	PanelChoisirAthlete PCA1, PCA2, PCA3, PCA4;
    
    /** The GF fa 4. */
    GridFormField GFFa1, GFFa2, GFFa3, GFFa4;
    
    /** The CMB pays. */
    ComboBoxPays CMBPays;
    
    /** The TX fnom. */
    JTextField TXFnom = new JTextField();
	
    /**
     * Instantiates a new ajouter equipe.
     *
     * @param admin the admin
     */
    public AjouterEquipe(Administrateur admin) {
        super("JODES");
        
        this.admin = admin;
        PCA1 = new PanelChoisirAthlete(this,admin);
        PCA2 = new PanelChoisirAthlete(this,admin);
        PCA3 = new PanelChoisirAthlete(this,admin);
        PCA4 = new PanelChoisirAthlete(this,admin);
        CMBPays = new ComboBoxPays(JO2024.getPays());
        
        GFFa1 = new GridFormField(PCA1,new JLabel("Athlete :"));
        GFFa2 = new GridFormField(PCA2,new JLabel("Athlete :"));
        GFFa3 = new GridFormField(PCA3,new JLabel("Athlete :"));
        GFFa4 = new GridFormField(PCA4,new JLabel("Athlete :"));
        
        PanelTitle panelTitle = new PanelTitle("Ajouter équipe");
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
        panelDuMilieu.setLayout(new GridLayout(3,2));

		panelDuMilieu.add(new GridFormField(TXFnom,new JLabel("Nom Equipe* :")));
		panelDuMilieu.add(new GridFormField(CMBPays,new JLabel("Pays* :")));
		panelDuMilieu.add(GFFa1);
		panelDuMilieu.add(GFFa2);
		panelDuMilieu.add(GFFa3);
		panelDuMilieu.add(GFFa4);
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
		new EquipeFrame(admin);
		this.dispose();
	}

	/**
	 * @author Ash Merienne
	 * Save quit.
	 */
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
			admin.creerEntite(e);
			admin.enregisterModifications();
			JOptionPane.showMessageDialog(null, "Équipe créée !");
			retour();
		}
	}

	/**
	 * Udpate athletes.
	 */
	@Override
	public void udpateAthletes() {
		PCA1.getCmb().setItemList(JO2024.getAthletes());
		PCA2.getCmb().setItemList(JO2024.getAthletes());
		PCA3.getCmb().setItemList(JO2024.getAthletes());
		PCA4.getCmb().setItemList(JO2024.getAthletes());
        
        System.out.println(PCA1.getCmb().getItemList());
	}
}