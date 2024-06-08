package JODES.vues;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import JODES.modeles.DataParser;

public class TXField extends JTextField {
	
	private static final long serialVersionUID = 1L;
	
	// ------------ Constructors --------------
	
	public TXField() {
		super();
	}
	
	public TXField(String s) {
		super(s);
	}
	
	// ------------- Methods ----------------
	
	public boolean parseField() {
		if (DataParser.isTextFieldNull(this.getText())) {
			return false;
		}
		return true;
	}

}
