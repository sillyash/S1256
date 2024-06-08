/*
 * 
 */
package JODES.vues;
import javax.swing.*;
import java.awt.*;


/**
 * The Class PanelTitle.
 *
 * @author Kincy Saad
 */
public class PanelTitle extends JPanel{
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;
	
	/** The title. */
	protected JLabel title;
	
	/**
	 * Instantiates a new panel title.
	 *
	 * @param titleText the title text
	 */
	PanelTitle(String titleText){
		title = new JLabel(titleText);
		title.setFont(new Font("Arial", Font.BOLD, 24));
		title.setForeground(Color.white);
		setBackground(Color.DARK_GRAY);
		add(title);
	}
}
