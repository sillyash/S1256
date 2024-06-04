package JODES.vues;
import javax.swing.*;
import java.awt.*;

// ESCOFFIER Emma
public class HomePageFrame extends JFrame {
	private static final long serialVersionUID = 1L;
	JFrame fenetre = new JFrame ("JODES");
	JPanel p = new JPanel();
	
	PanelTitle title = new PanelTitle("JODES");
	
	JButton planning = new JButton("Planning");
	JButton equipes = new JButton("Equipes");
	JButton sessions = new JButton("Sessions");
	JButton epreuves = new JButton("Epreuves");

	HomePageFrame(){
		fenetre.setSize (300, 300);
		fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fenetre.setLayout(new BorderLayout());
		
		fenetre.add(title, BorderLayout.NORTH);
		
		setButtonColors(planning);
		setButtonColors(equipes);
		setButtonColors(sessions);
		setButtonColors(epreuves);
		p.setLayout(new GridLayout(4, 1, 10, 10));

		p.add(planning);
		p.add(equipes);
		p.add(sessions);
		p.add(epreuves);
		
		fenetre.add(p);
		fenetre.setVisible(true);
	}
	
	protected void setButtonColors(JButton button) {
		button.setBackground(Color.lightGray);
		button.setForeground(Color.WHITE);
	}

	public static void main(String[] args) {
		HomePageFrame testAffichage = new HomePageFrame();
	}
}