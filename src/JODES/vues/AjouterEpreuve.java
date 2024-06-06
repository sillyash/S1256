package JODES.vues;

import javax.swing.*;

import JODES.controleurs.ControleurBTNRetour;
import JODES.controleurs.RetourVue;

import java.awt.*;

public class AjouterEpreuve extends JFrame implements RetourVue{

	
	public AjouterEpreuve() {
        
        super("Gestion des Epreuves - Paris 2024");
        setSize(800, 450);
        
        PanelTitle panelTitle = new PanelTitle("Epreuves Création");
        JButton button = new JButton("retour");
        JButton buttonSave = new JButton("Sauvegarder et quitter");
      
        add(panelTitle, BorderLayout.NORTH);

        ControleurBTNRetour btnretour = new ControleurBTNRetour(this);
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
        
        // Make the frame visible
        setVisible(true);
        // Exit the application when the frame is closed
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }

    public static void main(String[] args) {
    	//Create the mainEpreuve frame
        AjouterEpreuve Epreuve = new AjouterEpreuve();
    }
    //Nicolas
	@Override
	public void retour() {
		new EpreuveFrame();
		(this).dispose();
	}
}