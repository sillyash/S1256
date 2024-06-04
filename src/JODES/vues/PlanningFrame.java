package JODES.vues;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class PlanningFrame extends JFrame{
	private static final long serialVersionUID = 1L;

	JFrame fenetre = new JFrame ("JODES");
	JPanel p = new JPanel();
	PanelTitle title = new PanelTitle("JODES");
	
	PlanningFrame(){
		fenetre.setSize (300, 300);
		fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fenetre.setLayout(new BorderLayout());
	}
	public static void main(String[] args) {
		PlanningFrame testAffichage = new PlanningFrame();
	}
}
