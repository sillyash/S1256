package JODES.vues;

import javax.swing.*;

import JODES.controleurs.ControleurBTNRetour;
import JODES.controleurs.RetourVue;

import java.awt.*;

public class AjouterEpreuve extends JFrame implements RetourVue{

	

	public AjouterEpreuve() {
        
        super("JODES");
        
        PanelTitle panelTitle = new PanelTitle("Epreuves Création");
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
		panelDuMilieu.add(new GridFormField(new JTextField("bbbbbbb"),new JLabel("aaaaa")));
		panelDuMilieu.add(new GridFormField(new JTextField("bbbbbb"),new JLabel("aaaaaaa")));
		panelDuMilieu.add(new GridFormField(new JTextField("bbbbbbbbbbbb"),new JLabel("aaaaaaaa")));
		panelDuMilieu.add(new GridFormField(new JTextField("bbbbbbbbb"),new JLabel("a")));
		panelDuMilieu.add(new GridFormField(new JTextField("bb"),new JLabel("aaaa")));
		panelDuMilieu.add(new GridFormField(new JTextField("bbbb"),new JLabel("aaaaa")));
		add(panelDuMilieu,BorderLayout.CENTER);
        
      
        setSize(800, 450);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        AjouterEpreuve testAffichage = new AjouterEpreuve();
    }
    //Nicolas
	@Override
	public void retour() {
		new EpreuveFrame();
		(this).dispose();
	}
}