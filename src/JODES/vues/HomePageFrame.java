/*
 * 
 */
package JODES.vues;
import javax.swing.*;
import JODES.controleurs.*;
import JODES.modeles.Administrateur;
import java.awt.*;


/**
 * The Class HomePageFrame.
 *
 * @author Emma Escoffier
 */
public class HomePageFrame extends JFrame {
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;
	
	/** The p. */
	JPanel p = new JPanel();
	
	/** The title. */
	PanelTitle title = new PanelTitle("JODES");
	
	/** The planning. */
	JButton planning = new JButton("Planning");
	
	/** The equipes. */
	JButton equipes = new JButton("Equipes");
	
	/** The sessions. */
	JButton sessions = new JButton("Sessions");
	
	/** The epreuves. */
	JButton epreuves = new JButton("Epreuves");
	
	/** The admin. */
	Administrateur admin;

	/**
	 * Instantiates a new home page frame.
	 *
	 * @param admin the admin
	 */
	public HomePageFrame(Administrateur admin){
		this.admin = admin;
		
		setTitle("JODES");
		setSize (800, 450);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		
		add(title, BorderLayout.NORTH);
		
		setButtonColors(planning);
		setButtonColors(equipes);
		setButtonColors(sessions);
		setButtonColors(epreuves);
		p.setLayout(new GridLayout(4, 1, 10, 10));

		p.add(planning);
		p.add(equipes);
		p.add(sessions);
		p.add(epreuves);
		
		add(p);

		ControleurBtnPlanning ctrlBtnPlann = new ControleurBtnPlanning(this, admin);
		ControleurBtnEpreuve ctrlBtnEpr = new ControleurBtnEpreuve(this, admin);
		ControleurBtnEquipe ctrlBtnEqu = new ControleurBtnEquipe(this, admin);
		ControleurBtnSession ctrlBtnSes = new ControleurBtnSession(this, admin);
		
		epreuves.addActionListener(ctrlBtnEpr);
		planning.addActionListener(ctrlBtnPlann);
		equipes.addActionListener(ctrlBtnEqu);
		sessions.addActionListener(ctrlBtnSes);
		
		setVisible(true);
	}
	
	/**
	 * Sets the button colors.
	 *
	 * @param button the new button colors
	 */
	protected void setButtonColors(JButton button) {
		button.setBackground(Color.lightGray);
		button.setForeground(Color.WHITE);
	}
}