package JODES.vues;

import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

import JODES.JO2024;
import JODES.controleurs.ControleurAjtAthlete;

public class PanelChoisirAthlete extends JPanel{
	
	protected JPanel panel;
	
	public PanelChoisirAthlete() {
		this.setLayout(new GridLayout(1,2));
		ComboBoxAthlete Cmb = new ComboBoxAthlete(JO2024.getAthletes());   
		add(Cmb);
		JButton btn = new JButton("Créer un athlète");
		ControleurAjtAthlete ctr = new ControleurAjtAthlete();
		btn.addActionListener(ctr);
		add(btn);
	}
}
