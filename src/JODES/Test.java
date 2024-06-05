package JODES;

import JODES.modeles.*;

public class Test {
	
	public static void main(String args[])
	{
		Pays FRA = new Pays("France", "FRA");
		Athlete ash = new Athlete("Ash", "Merienne", FRA);
		
		ash.menuModification();
		
		ash.saveToDisk();
	}
	
}
