/*
 * 
 */
package JODES;
import JODES.modeles.Administrateur;
import JODES.vues.*;


/**
 * The Class App.
 *
 * @author Ash Merienne
 */
public class App {
	
	/** The admin. */
	protected Administrateur admin;

	/**
	 * Instantiates a new app.
	 *
	 * @param admin the admin
	 */
	public App(Administrateur admin) {
        this.admin = admin;
        new HomePageFrame(admin);
	}
	
	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String args[])
	{
		JO2024.initialize();
		Administrateur admin = new Administrateur("admin@login.fr", "password1234", "John", "DOE");
		JO2024.addUtilisateur(admin);
		
		new App(admin);
	}
}
