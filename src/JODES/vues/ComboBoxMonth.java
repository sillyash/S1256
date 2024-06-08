/*
 * 
 */
package JODES.vues;
import java.time.Month;
import java.util.ArrayList;
import javax.swing.JComboBox;


/**
 * The Class ComboBoxMonth.
 *
 * @author Ash Merienne
 */
public class ComboBoxMonth extends JComboBox<String> {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;
	
	/** The months. */
	protected ArrayList<String> months = new ArrayList<>();
    
    /** The mois. */
    protected ArrayList<Month> mois = new ArrayList<>();

    /**
     * Instantiates a new combo box month.
     */
    public ComboBoxMonth() {
        addItems();
    }

    /**
     * Adds the items.
     */
    protected void addItems() {
        months.add("");
        months.add("JAN");
        months.add("FEB");
        months.add("MAR");
        months.add("APR");
        months.add("MAY");
        months.add("JUN");
        months.add("JUL");
        months.add("AUG");
        months.add("SEP");
        months.add("NOV");
        months.add("DEC");

        mois.add(Month.JANUARY);
        mois.add(Month.FEBRUARY);
        mois.add(Month.MARCH);
        mois.add(Month.APRIL);
        mois.add(Month.MAY);
        mois.add(Month.JUNE);
        mois.add(Month.JULY);
        mois.add(Month.AUGUST);
        mois.add(Month.SEPTEMBER);
        mois.add(Month.OCTOBER);
        mois.add(Month.NOVEMBER);
        mois.add(Month.DECEMBER);

        for (String months : months) {
        	this.addItem(months);
        }
    }

    /**
     * Gets the item list.
     *
     * @return the item list
     */
    public ArrayList<String> getItemList() {
        return months;
    }

    /**
     * Gets the months.
     *
     * @return the months
     */
    public ArrayList<Month> getMonths() {
        return mois;
    }

    /**
     * Gets the selected month.
     *
     * @return the selected month
     */
    public int getSelectedMonth() {
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
