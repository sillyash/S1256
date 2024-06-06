package JODES;
import javax.swing.*;
import JODES.modeles.*;
import JODES.vues.*;

/**
 * @author Ash Merienne
 */
public class Test {
	
	public static void main(String args[])
	{
		Pays FRA = new Pays("France", "FRA");
		Athlete Alain = new Athlete("Alain", "Sandoz", FRA);
		Athlete Ash = new Athlete("Ash", "Merienne", FRA);
		
		JO2024.addEntite(Alain);
		JO2024.addEntite(Ash);
		JO2024.rechercheEntite("alain", "");
		
		Ash.menuModification();		
		Ash.saveToDisk();

		JFrame app = new JFrame("TEST");
		app.add(new ComboBoxAthlete(JO2024.getAthletes()));
		app.setSize(800, 450);
        app.setVisible(true);
	}
	
}
