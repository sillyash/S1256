package JODES;
import javax.swing.*;
import JODES.modeles.Administrateur;
import JODES.vues.*;
import java.awt.BorderLayout;

/**
 * @author Ash Merienne
 */
public class App extends JFrame {

	public App(Administrateur user) {
		super("JODES");
		setSize(800, 450);
        setLayout(new BorderLayout());
	}
	
	public static void main(String args[])
	{
		JO2024.initialize();
		Administrateur admin = new Administrateur("admin", "", "Utilisateur", "Admin");
		JO2024.addUtilisateur(admin);
		JO2024.demandeConnexion(admin.getLogin(), admin.getPassword());

		JFrame app = new HomePageFrame(admin);
		app.setSize(800, 450);
        app.setVisible(true);
	}
}
