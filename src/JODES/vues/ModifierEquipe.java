package JODES.vues;
import javax.swing.*;

import JODES.JO2024;
import JODES.controleurs.ControleurBTNRetour;
import JODES.controleurs.RetourVue;
import java.awt.*;
import JODES.modeles.Equipe;

public class ModifierEquipe extends JFrame implements RetourVue{

	private static final long serialVersionUID = 1L;
	protected Equipe equipe;

	public ModifierEquipe(Equipe equipe) {
        super("Modification des Equipe - Paris 2024");
        this.equipe = equipe;
        
        PanelTitle panelTitle = new PanelTitle("Equipe Création");
        JButton button = new JButton("Retour" + "\u21A9");
        ControleurBTNRetour btnretour = new ControleurBTNRetour(this);
        
        add(button, BorderLayout.SOUTH);
        JButton buttonSave = new JButton("Sauvegarder et quitter");
      
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

		panelDuMilieu.add(new GridFormField(new JTextField(equipe.getNom()),new JLabel("Nom Equipe :")));
		panelDuMilieu.add(new GridFormField(CMBPays,new JLabel("Pays :")));
		panelDuMilieu.add(new GridFormField(CMBA1,new JLabel("Athlete :")));
		panelDuMilieu.add(new GridFormField(CMBA2,new JLabel("Athlete :")));
		panelDuMilieu.add(new GridFormField(CMBA3,new JLabel("Athlete :")));
		panelDuMilieu.add(new GridFormField(CMBA4,new JLabel("Athlete :")));
		add(panelDuMilieu,BorderLayout.CENTER);

        CMBPays.setSelectedIndex(CMBPays.getItemList().indexOf(equipe.getSonPays())+1);
        CMBA1.setSelectedIndex(CMBA1.getItemList().indexOf(equipe.getSesAthletes().get(0))+1);
        CMBA1.setSelectedIndex(CMBA2.getItemList().indexOf(equipe.getSesAthletes().get(1))+1);
        CMBA2.setSelectedIndex(CMBA3.getItemList().indexOf(equipe.getSesAthletes().get(2))+1);
        CMBA4.setSelectedIndex(CMBA4.getItemList().indexOf(equipe.getSesAthletes().get(3))+1);
      
        setSize(800, 450);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    //Nicolas
	@Override
	public void retour() {
		new EquipeFrame();
		(this).dispose();
	}
}