package JODES.controleurs;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControleurBtnSauvegarderQuitter implements ActionListener {
	
	protected SauvegarderQuitter _vue;
	
	public ControleurBtnSauvegarderQuitter(SauvegarderQuitter vue) {
		this._vue = vue;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		_vue.saveQuit();
	}
}
