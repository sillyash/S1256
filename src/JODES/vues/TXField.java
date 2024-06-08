/*
 * 
 */
package JODES.vues;
import javax.swing.JTextField;
import JODES.modeles.DataParser;


/**
 * The Class TXField.
 *
 * @author Ash Merienne
 */
public class TXField extends JTextField {
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;
	
	// ------------ Constructors --------------
	
	/**
	 * Instantiates a new TX field.
	 */
	public TXField() {
		super();
	}
	
	/**
	 * Instantiates a new TX field.
	 *
	 * @param s the s
	 */
	public TXField(String s) {
		super(s);
	}
	
	// ------------- Methods ----------------
	
	/**
	 * Parses the field.
	 *
	 * @return true, if successful
	 */
	public boolean parseField() {
		if (DataParser.isTextFieldNull(this.getText())) {
			return false;
		}
		return true;
	}

}
