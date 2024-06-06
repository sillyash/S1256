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
		Pays BEL = new Pays("Belgium", "BEL");
		
		Athlete Alain = new Athlete("Alain", "Sandoz", FRA);
		Athlete Ash = new Athlete("Ash", "Merienne", FRA);
		
		JO2024.addEntite(Alain);
		JO2024.addEntite(Ash);
		JO2024.addEntite(FRA);
		JO2024.addEntite(BEL);
		
		JO2024.rechercheEntite("alain", "");
		
		Ash.menuModification();		
		Ash.saveToDisk();

		JFrame app = new JFrame("TEST");
		app.add(new ComboBoxPays(JO2024.getPays()));
		app.setSize(800, 450);
        app.setVisible(true);
	}
	
}
