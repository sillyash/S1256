package JODES;
import javax.swing.*;
import JODES.modeles.*;
import JODES.vues.*;

/**
 * @author Ash Merienne
 */
public class App {
	
	public static void main(String args[])
	{
		JO2024.initialize();

		JFrame app = new HomePageFrame();
		app.add(new ComboBoxPays(JO2024.getPays()));
		app.setSize(800, 450);
        app.setVisible(true);
	}
	
}
