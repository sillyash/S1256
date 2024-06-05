package JODES.vues;

import javax.swing.*;
import java.awt.*;

public class PlanningFrame extends JFrame{
	private static final long serialVersionUID = 1L;

	    JFrame fenetre;
	    PanelTitle title;
	    JTable Planning;
	    
	    PlanningFrame(){
	        fenetre = new JFrame ("JODES");
	        fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        fenetre.setLayout(new BorderLayout());
	        title = new PanelTitle("JODES");
	        fenetre.add(title, BorderLayout.NORTH);
	        
	        JPanel graduation = new JPanel();
	        
	        String[] hours = {"","9", "9:30", "10", "10:30", "11", "11:30", "12", "12:30", "13", "13:30", "14", "14:30", "15", "15:30", "16", "16:30", "17", "17:30", "18"};
	        JTable gradTable = new JTable(20,1);
	        graduation.add(gradTable);
	        for (int i = 0; i < 20; i++) {
	        	gradTable.setValueAt(hours[i], i, 0);
	        }
	        
	        fenetre.add(graduation, BorderLayout.WEST);

	        String[] columnNames = {"LUN", "MAR", "MER", "JEU", "VEN", "SAM", "DIM"};
	        String[][] data = {
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
	            }; // will have to replace with proper data to be imported 
	        Planning = new JTable(data, columnNames); // 18 rows = every 30min from 9h to 18h | 7 cols days of week
	        Planning.setBounds(100, 100, 600, 600);
	        JScrollPane scrollPane = new JScrollPane(Planning);
	        fenetre.add(scrollPane, BorderLayout.CENTER);
	        fenetre.setSize(800, 450);
	        fenetre.setVisible(true);
	    }
	    
	    public static void main(String[] args) {
	    	PlanningFrame testAffichage = new PlanningFrame();
	    }
	    // ca compile ca marche bien mais le scrollPane ne s'applique 
	}