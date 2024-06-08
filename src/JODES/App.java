package JODES;
import JODES.modeles.Administrateur;
import JODES.vues.*;

/**
 * @author Ash Merienne
 */
public class App {
	
	protected Administrateur admin;

	public App(Administrateur admin) {
        this.admin = admin;
        new HomePageFrame(admin);
	}
	
	public static void main(String args[])
	{
		JO2024.initialize();
		Administrateur admin = new Administrateur("admin", "password", "Utilisateur", "Admin");
		JO2024.addUtilisateur(admin);
		
		new App(admin);
	}
}
