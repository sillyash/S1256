/*
 * 
 */
package JODES.vues;
import java.util.ArrayList;
import javax.swing.JComboBox;

// TODO: Auto-generated Javadoc
/**
 * The Class ComboBoxYear.
 *
 * @author Ash Merienne
 */
public class ComboBoxYear extends JComboBox<String> {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;
	
	/** The days. */
	protected ArrayList<Integer> days = new ArrayList<>();

    /**
     * Instantiates a new combo box year.
     */
    public ComboBoxYear() {
        addItems();
    }

    /**
     * Adds the items.
     */
    protected void addItems() {
        this.addItem("");
        for (Integer i=2024; i<2027; i++) {
            this.addItem(String.valueOf(i));
        }
    }

    /**
     * Gets the item list.
     *
     * @return the item list
     */
    public ArrayList<Integer> getItemList() {
        return days;
    }

    /**
     * Gets the selected year.
     *
     * @return the selected year
     */
    public int getSelectedYear() {
        return this.getSelectedIndex()+2023;
    }
    
    /**
     * Checks if is selected null.
     *
     * @return true, if is selected null
     */
    public boolean isSelectedNull() {
    	if (this.getItemCount() == 0)
    		return true;
    	if (this.getSelectedIndex() == 0)
    		return true;
    	else 
    		return false;
    }
}
