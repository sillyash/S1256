package JODES.vues;
import javax.swing.*;
import JODES.JO2024;
import JODES.controleurs.ControleurBtnRetour;
import JODES.controleurs.ControleurBtnSauvegarderQuitter;
import JODES.controleurs.RetourVue;
import JODES.controleurs.SauvegarderQuitter;
import JODES.modeles.Administrateur;
import JODES.modeles.Session;
import java.awt.*;

public class AjouterSession extends JFrame implements RetourVue, SauvegarderQuitter {

	Administrateur admin;
    TXField TXFnom = new TXField("");
    ComboBoxStatutSession CMBSS = new ComboBoxStatutSession();
    ComboBoxPays CMBP = new ComboBoxPays(JO2024.getPays());
    DatePicker DTpick = new DatePicker();
    ComboBoxHoraires CMBH1 = new ComboBoxHoraires();
    ComboBoxHoraires CMBH2 = new ComboBoxHoraires();
    ComboBoxLieu CMBL = new ComboBoxLieu(JO2024.getLieux());
    ComboBoxDiscipline CMBD = new ComboBoxDiscipline(JO2024.getDisciplines());

	public AjouterSession(Administrateur admin) {
        super("JODES");
        
        this.admin = admin;
        PanelTitle panelTitle = new PanelTitle("Ajouter séssion");
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
        panelDuMilieu.setLayout(new GridLayout(4,2));
		panelDuMilieu.add(new GridFormField(TXFnom,new JLabel("Nom* :")));
		panelDuMilieu.add(new GridFormField(CMBSS,new JLabel("Statut* :")));
		panelDuMilieu.add(new GridFormField(CMBP,new JLabel("Pays* :")));
		panelDuMilieu.add(new GridFormField(DTpick,new JLabel("Date* :")));
		panelDuMilieu.add(new GridFormField(CMBH1,new JLabel("Horaire début* :")));
		panelDuMilieu.add(new GridFormField(CMBH2,new JLabel("Horaire fin* :")));
		panelDuMilieu.add(new GridFormField(CMBL,new JLabel("Lieu* :")));
		panelDuMilieu.add(new GridFormField(CMBD,new JLabel("Discipline* :")));
		add(panelDuMilieu);
      
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
        Session s;

        if (TXFnom.getText()=="")
			JOptionPane.showMessageDialog(null,"Erreur : champ non rempli (Nom)");
        else if (CMBSS.isSelectedNull())
            JOptionPane.showMessageDialog(null,"Erreur : champ non rempli (Statut)");
        else if (CMBP.isSelectedNull())
            JOptionPane.showMessageDialog(null,"Erreur : champ non rempli (Pays)");
        else if (DTpick.isDateValid())
            JOptionPane.showMessageDialog(null,"Erreur : champ non rempli ou erronné (Date)");
        else if (CMBH1.isSelectedNull())
            JOptionPane.showMessageDialog(null,"Erreur : champ non rempli (Horaire début)");
        else if (CMBH2.isSelectedNull())
            JOptionPane.showMessageDialog(null,"Erreur : champ non rempli (Horaire fin)");
        else if (CMBL.isSelectedNull())
            JOptionPane.showMessageDialog(null,"Erreur : champ non rempli (Lieu)");
        else if (CMBD.isSelectedNull())
            JOptionPane.showMessageDialog(null,"Erreur : champ non rempli (Discipline)");
        else {
            s = new Session(
                TXFnom.getText(),
                CMBSS.getSelectedItem().toString(),
                JO2024.Paris2024,
                CMBH1.getSelectedTime(),
                CMBH2.getSelectedTime(),
                DTpick.getSelectedDate(),
                CMBL.getSelectedEntite(),
                CMBD.getSelectedEntite()
            );
            admin.creerEntite(s);
            retour();
        }
	}
}