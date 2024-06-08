package JODES.controleurs;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author Nicolas Vouilloux
 */
public class ControleurBtnRetour implements ActionListener {
	
	protected RetourVue vue;
	
	public ControleurBtnRetour(RetourVue vue) {
		this.vue = vue;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		vue.retour();
	}
}
