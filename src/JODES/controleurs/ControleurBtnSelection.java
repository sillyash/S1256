package JODES.controleurs;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author Nicolas Vouilloux
 */
public class ControleurBtnSelection implements ActionListener{

	protected SelectionVue vue;
	
	public ControleurBtnSelection(SelectionVue vue) {
		this.vue = vue;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		vue.selection();
	}
}
