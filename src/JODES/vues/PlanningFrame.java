// Emma ESCOFFIER
package JODES.vues;
import javax.swing.*;
import java.awt.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import JODES.JO2024;
import JODES.controleurs.*;
import JODES.modeles.Planning;
import JODES.modeles.Session;

public class PlanningFrame extends JFrame implements RetourVue{
	private static final long serialVersionUID = 1L;

	    JFrame fenetre;
	    PanelTitle title;
	    JTable planning;
	    protected Planning _modele;
	    
	    public Planning get_modele() {
	    	return _modele;
	    }

		public PlanningFrame(){
	        fenetre = new JFrame ("JODES");
	        fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        fenetre.setLayout(new BorderLayout());
	        title = new PanelTitle("Planning");
	        
	        if (JO2024.getSessions().size() != 0) {
	        	Session firstSession = JO2024.getSessions().get(0);
	        	_modele = new Planning(firstSession.getDate());
	        } else _modele = new Planning(LocalDate.now());
	        
	        JPanel navBar = new JPanel();
	        JButton nextWeek = new JButton("\u25BA");
	        JButton previousWeek = new JButton("\u25C4");
	        ControleurBtnFlecheBackwardsPlanning ctrlFlecheBack = new ControleurBtnFlecheBackwardsPlanning(_modele, this);
	        ControleurBtnFlecheForwardPlanning ctrlFlecheForw = new ControleurBtnFlecheForwardPlanning(_modele, this);
	        previousWeek.addActionListener(ctrlFlecheBack);
	        nextWeek.addActionListener(ctrlFlecheForw);
	        
	        navBar.setLayout(new BorderLayout());
	        navBar.add(previousWeek, BorderLayout.WEST);
	        navBar.add(title, BorderLayout.CENTER);
	        navBar.add(nextWeek, BorderLayout.EAST);
	        fenetre.add(navBar, BorderLayout.NORTH);
	        
	        JPanel graduation = new JPanel();
	        String[] hours = {"", "", "9", "9:30", "10", "10:30", "11", "11:30", "12", "12:30", "13", "13:30", "14", "14:30", "15", "15:30", "16", "16:30", "17", "17:30", "18"};
	        JTable gradTable = new JTable(21,1) {
	        	public boolean isCellEditable(int row, int column) {
	        		return false;
	        	}
	        };
	        
	        graduation.add(gradTable);
	        for (int i = 0; i < 21; i++) {
	        	gradTable.setValueAt(hours[i], i, 0);
	        }
	        fenetre.add(graduation, BorderLayout.WEST);

	        String[] columnNames = {"LUN", "MAR", "MER", "JEU", "VEN", "SAM", "DIM"};
	        String[][] data = {
	                { "0/0/0", "0/0/0", "0/0/0", "0/0/0", "0/0/0", "0/0/0", "0/0/0" }, // row for dates
	                { "1", "2", "3", "4", "5", "6", "7" },
	                { "1", "2", "3", "4", "5", "6", "7" },
	                { "1", "2", "3", "4", "5", "6", "7" },
	                { "1", "2", "3", "4", "5", "6", "7" },
	                { "1", "2", "3", "4", "5", "6", "7" },
	                { "1", "2", "3", "4", "5", "6", "7" },
	                { "1", "2", "3", "4", "5", "6", "7" },
	                { "1", "2", "3", "4", "5", "6", "7" },
	                { "1", "2", "3", "4", "5", "6", "7" },
	                { "1", "2", "3", "4", "5", "6", "7" },
	                { "1", "2", "3", "4", "5", "6", "7" },
	                { "1", "2", "3", "4", "5", "6", "7" },
	                { "1", "2", "3", "4", "5", "6", "7" },
	                { "1", "2", "3", "4", "5", "6", "7" },
	                { "1", "2", "3", "4", "5", "6", "7" },
	                { "1", "2", "3", "4", "5", "6", "7" },
	                { "1", "2", "3", "4", "5", "6", "7" },
	                { "1", "2", "3", "4", "5", "6", "7" },
	                { "1", "2", "3", "4", "5", "6", "7" }
	            };

	        	for (int j = 0; j < 7; j++) {
	        			data[0][j] = _modele.getDays().get(j).toString();
	        		} // to display dates on top row
	        		
        		for (int j = 0; j < 7; j++) {
        			List<Session> sessionJour = _modele.getSessions().get(j);
        			for (Session s : sessionJour) {
        				DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
        				String startTime = formatter.format(s.getHoraireDebut());
        				// compare startTime to graduation???
        				//get equivalent index of said horaire and then do the following loop
        				for (int k = 2; k <= s.getLongueurEnDemiHeure(); k ++) {
        					data[j][k] =  "" + s.getStatut() + "\n" + s.getSaDiscipline();
        				}
        				// k+indexhoraire 
        			}
        		}
	        	

	        
	        planning = new JTable(data, columnNames) {
	        	public boolean isCellEditable(int row, int column) {
	        		return false;
	        	}
	        };
	        
	        planning.setBounds(100, 100, 600, 600);
	        JScrollPane scrollPane = new JScrollPane(planning);
	        fenetre.add(scrollPane, BorderLayout.CENTER);
	        fenetre.setSize(800, 450);
	        fenetre.setVisible(true);

	        //Nicolas 
	        JButton button = new JButton("Retour" + "\u21A9");
	        ControleurBtnRetour BtnRetour = new ControleurBtnRetour(this);
	        button.addActionListener(BtnRetour);
	        fenetre.add(button,BorderLayout.SOUTH);//TODO mettre le bouton au bon endroit
	    }
	    
	    public static void main(String[] args) {
	    	PlanningFrame testAffichage = new PlanningFrame();
	    	LocalTime s = LocalTime.now();
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
			String horaireDebut = formatter.format(s);
	    	System.out.println(horaireDebut);
	    }

	    //Nicolas
		@Override
		public void retour() {
			new HomePageFrame();
			fenetre.dispose();
		}
	}
