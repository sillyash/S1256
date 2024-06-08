package JODES;
import javax.swing.*;

import JODES.modeles.Administrateur;
import JODES.vues.*;

/**
 * @author Ash Merienne
 */
public class App {
	
	public static void main(String args[])
	{
		JO2024.initialize();
		Administrateur user = new Administrateur("admin", "", "Utilisateur", "Admin");
		JO2024.addUtilisateur(user);
		JO2024.demandeConnexion(user.getLogin(), user.getPassword());

		JFrame app = new HomePageFrame(user);
		app.setSize(800, 450);
        app.setVisible(true);
	}
	
}
