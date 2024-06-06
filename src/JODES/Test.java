package JODES;
import JODES.modeles.*;

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
		JO2024.rechercheEntite("alain", "");
		
		Ash.menuModification();		
		Ash.saveToDisk();
	}
	
}
