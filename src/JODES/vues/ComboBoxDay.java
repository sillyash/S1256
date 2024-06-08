/*
 * 
 */
package JODES.vues;
import java.util.ArrayList;
import javax.swing.JComboBox;


/**
 * The Class ComboBoxDay.
 *
 * @author Ash Merienne
 */
public class ComboBoxDay extends JComboBox<String> {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;
	
	/** The days. */
	protected ArrayList<Integer> days = new ArrayList<>();

    /**
     * Instantiates a new combo box day.
     */
    public ComboBoxDay() {
        addItems();
    }

    /**
     * Adds the items.
     */
    protected void addItems() {
        this.addItem("");
        for (Integer i=1; i<32; i++) {
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
     * Gets the selected day.
     *
     * @return the selected day
     */
    public int getSelectedDay() {
        return this.getSelectedIndex();
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
