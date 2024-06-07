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
	String[][] data = {
		{ "0/0/0", 	"0/0/0", 	"0/0/0", 	"0/0/0", 	"0/0/0", 	"0/0/0", 	"0/0/0" }, // row for dates
		{ "1", 		"2", 		"3", 		"4", 		"5", 		"6", 		"7" 	},
		{ "1", 		"2", 		"3", 		"4",		 "5", 		"6", 		"7" 	},
		{ "1", 		"2", 		"3", 		"4", 		"5", 		"6", 		"7" 	},
		{ "1", 		"2", 		"3", 		"4", 		"5", 		"6", 		"7" 	},
		{ "1", 		"2", 		"3", 		"4", 		"5", 		"6", 		"7" 	},
		{ "1", 		"2", 		"3", 		"4", 		"5", 		"6", 		"7" 	},
		{ "1", 		"2", 		"3", 		"4", 		"5", 		"6", 		"7" 	},
		{ "1", 		"2", 		"3", 		"4", 		"5", 		"6", 		"7" 	},
		{ "1", 		"2", 		"3", 		"4", 		"5", 		"6", 		"7" 	},
		{ "1", 		"2", 		"3", 		"4", 		"5", 		"6", 		"7" 	},
		{ "1", 		"2", 		"3", 		"4", 		"5", 		"6", 		"7" 	},
		{ "1", 		"2", 		"3", 		"4", 		"5", 		"6", 		"7"		},
		{ "1", 		"2", 		"3", 		"4", 		"5", 		"6", 		"7" 	},
		{ "1", 		"2", 		"3", 		"4", 		"5", 		"6", 		"7" 	},
		{ "1",		"2", 		"3", 		"4", 		"5", 		"6", 		"7" 	},
		{ "1", 		"2", 		"3", 		"4", 		"5", 		"6", 		"7" 	},
		{ "1", 		"2", 		"3", 		"4", 		"5", 		"6", 		"7" 	},
		{ "1", 		"2", 		"3", 		"4", 		"5", 		"6", 		"7" 	},
		{ "1", 		"2", 		"3", 		"4", 		"5", 		"6", 		"7" 	}
	};
	String[] hours = {"", "", "09:00", "09:30", "10:00", "10:30",
					 "11:00", "11:30", "12:00", "12:30", "13:00",
					 "13:30", "14:00", "14:30", "15:00", "15:30",
					 "16:00", "16:30", "17:00", "17:30", "18:00"};
	JTable gradTable;
	JPanel graduation = new JPanel();
	JButton nextWeek = new JButton("\u25BA");
	JButton previousWeek = new JButton("\u25C4");
	JButton button = new JButton("Retour" + "\u21A9");
	ControleurBtnRetour BtnRetour = new ControleurBtnRetour(this);
	JPanel navBar = new JPanel();
    JFrame fenetre;
    PanelTitle title;
    JTable planning;
	Planning _modele;
	String[] columnNames = {"LUN", "MAR", "MER", "JEU", "VEN", "SAM", "DIM"};
	JScrollPane scrollPane;

	// --------------------------- Constructor -----------------------------------

	public PlanningFrame() {
        if (JO2024.getSessions().size() != 0) {
        	Session firstSession = JO2024.getSessions().get(0);
        	_modele = new Planning(firstSession.getDate());
        } else _modele = new Planning(LocalDate.now());
        
        fenetre = new JFrame ("JODES");
        fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fenetre.setLayout(new BorderLayout());
        title = new PanelTitle("Planning");
        
        ControleurBtnFlecheBackwardsPlanning ctrlFlecheBack = new ControleurBtnFlecheBackwardsPlanning(_modele, this);
        ControleurBtnFlecheForwardPlanning ctrlFlecheForw = new ControleurBtnFlecheForwardPlanning(_modele, this);
        previousWeek.addActionListener(ctrlFlecheBack);
        nextWeek.addActionListener(ctrlFlecheForw);
        
        gradTable = new JTable(hours.length,1) {
        	public boolean isCellEditable(int row, int column) {
        		return false;
        	}
        };
        
        initializePlanningTable();
        initializeNavBar();
		initializeHours();
		initializeDays();
		initializeGradTable();
		parseSessions();

        //Nicolas 
        button.addActionListener(BtnRetour);
        fenetre.add(button,BorderLayout.SOUTH);
    }

	// ------------------------- Methods ----------------------------

	public Planning get_modele() {
		return _modele;
	}

	public void initializeHours() {
        for (int i=2; i < hours.length; i++) {
        	this.gradTable.setValueAt(hours[i], i, 0);
        }
	}
	
	public void initializePlanningTable() {
		planning = new JTable(data, columnNames) {
        	public boolean isCellEditable(int row, int column) {
        		return false;
        	}
        };
		planning.setBounds(100, 100, 600, 600);
	    scrollPane = new JScrollPane(planning);
	    fenetre.add(scrollPane, BorderLayout.CENTER);
	    fenetre.setSize(800, 450);
	    fenetre.setVisible(true);
	}

	public void initializeGradTable() {
		gradTable.setShowVerticalLines(false);
		gradTable.setShowHorizontalLines(false);
		gradTable.setBackground(getForeground());
		graduation.add(gradTable);
        fenetre.add(graduation, BorderLayout.WEST);
	}

	public void initializeDays() {
		for (int j = 0; j < 7; j++) {
			this.data[0][j] = _modele.getDays().get(j).toString();
		}
	}

	public int[] getIndexOf(String[][] tab, String s) {
		int[] result = new int[2];
		if (tab.length == 0) {
			result[0] = -1;
		}
		for (int i=0; i<tab.length; i++) {
			for (int j=0; j<tab[i].length; j++) {
				if (tab[i][j] == s) {
					result[0] = i;
					result[1] = j;
				}
			}
		}
		return result;
	}

	public void initializeNavBar() {
		navBar.setLayout(new BorderLayout());
        navBar.add(previousWeek, BorderLayout.WEST);
        navBar.add(title, BorderLayout.CENTER);
        navBar.add(nextWeek, BorderLayout.EAST);
        fenetre.add(navBar, BorderLayout.NORTH);
	}

	public int getIndexOf(String[] tab, String s) {
		if (tab.length == 0) {
			System.out.println("a");
			return -1;
		}
		for (int i=0; i<tab.length; i++) {
			System.out.println(tab[i] + " " + s);
			if (tab[i] == s) {
				return i;
			}
		}
		return -1;
	}
	
	public void parseSessions() {
		for (int i = 0; i<7; i++) {
			List<Session> sessionJour = _modele.getSessions().get(i);

			for (Session s : sessionJour) {

				int heureDeb, minuteDeb;
				heureDeb = s.getHoraireDebut().getHour();
				String startTime = heureDeb + " " +
				int indexHoraire = getIndexOf(data[i], startTime);

				for (int j=indexHoraire; j < s.getLongueurEnDemiHeure(); j++) {
					data[i][j] =  s.getSaDiscipline().getNom() + " " + s.getStatut();
				}
			}
		}
	}
    
    public static void main(String[] args) {
    	JO2024.initialize();
    	JO2024.addEntite(
    		new Session("Truc", Session.FINALE, JO2024.Paris2024,
    				LocalTime.parse("10:00"), LocalTime.parse("12:00"),
    				LocalDate.now(), JO2024.getLieux().get(0),
    				JO2024.getDisciplines().get(0)));
    	new PlanningFrame();
    }

    //Nicolas
	@Override
	public void retour() {
		new HomePageFrame();
		fenetre.dispose();
	}
}
