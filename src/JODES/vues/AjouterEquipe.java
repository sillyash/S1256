package JODES.vues;
import JODES.controleurs.RetourVue;
import JODES.modeles.Equipe;

public class AjouterEquipe extends ModifierEquipe implements RetourVue {

	public AjouterEquipe() {
        super(new Equipe("", null));
	}

    public static void main(String[] args) {
        new AjouterEquipe();
    }

    //Nicolas
	@Override
	public void retour() {
		new EquipeFrame();
		(this).dispose();
	}
}