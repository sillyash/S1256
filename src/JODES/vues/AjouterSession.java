package JODES.vues;
import JODES.modeles.Session;

public class AjouterSession extends ModifierSession {

	public AjouterSession() {
        super(new Session("", "", null, null, null, null, null, null, null),true);   
    }

    public static void main () {
        new AjouterSession();
    }

    //Nicolas
	@Override
	public void retour() {
		new SessionFrame();
		(this).dispose();
	}
}