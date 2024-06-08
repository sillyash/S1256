package JODES.vues;
import javax.swing.*;
import JODES.JO2024;
import JODES.controleurs.ControleurBtnRetour;
import JODES.controleurs.ControleurBtnSauvegarderQuitter;
import JODES.controleurs.RetourVue;
import JODES.controleurs.SauvegarderQuitter;
import java.awt.*;
import JODES.modeles.Administrateur;

public class AjouterEquipe extends JFrame implements RetourVue, SauvegarderQuitter{

	private static final long serialVersionUID = 1L;
	Administrateur admin;
	
	public AjouterEquipe(Administrateur admin) {
        super("JODES");
        
        this.admin = admin;
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

        ComboBoxPays CMBPays = new ComboBoxPays(JO2024.getPays());
        ComboBoxAthlete CMBA1 = new ComboBoxAthlete(JO2024.getAthletes());
        ComboBoxAthlete CMBA2 = new ComboBoxAthlete(JO2024.getAthletes());
        ComboBoxAthlete CMBA3 = new ComboBoxAthlete(JO2024.getAthletes());
        ComboBoxAthlete CMBA4 = new ComboBoxAthlete(JO2024.getAthletes());
        JTextField TXFnom = new JTextField();

		panelDuMilieu.add(new GridFormField(TXFnom,new JLabel("Nom Equipe :")));
		panelDuMilieu.add(new GridFormField(CMBPays,new JLabel("Pays :")));
		panelDuMilieu.add(new GridFormField(new PanelChoisirAthlete(admin),new JLabel("Athlete :")));
		panelDuMilieu.add(new GridFormField(new PanelChoisirAthlete(admin),new JLabel("Athlete :")));
		panelDuMilieu.add(new GridFormField(new PanelChoisirAthlete(admin),new JLabel("Athlete :")));
		panelDuMilieu.add(new GridFormField(new PanelChoisirAthlete(admin),new JLabel("Athlete :")));
		add(panelDuMilieu,BorderLayout.CENTER);
      
        setSize(800, 450);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
	public static void main(String[] args) {
        JO2024.initialize();
        Administrateur admin = new Administrateur("admin", "", "tst", "ttest");
		new AjouterEquipe(admin);
    }

    //Nicolas
	@Override
	public void retour() {
		new EquipeFrame(admin);
		(this).dispose();
	}
	@Override
	public void SauvegarderQuitter() {
		// TODO Auto-generated method stub
		
	}
}