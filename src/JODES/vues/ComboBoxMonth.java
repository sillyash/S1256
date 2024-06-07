package JODES.vues;
import java.util.ArrayList;
import javax.swing.JComboBox;

public class ComboBoxMonth extends JComboBox<String> {

	private static final long serialVersionUID = 1L;
	protected ArrayList<String> months = new ArrayList<>();

    public ComboBoxMonth() {
        addItems();
    }

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
        for (String months : months) {
        	this.addItem(months);
        }
    }

    public ArrayList<String> getItemList() {
        return months;
    }

    public int getSelectedMonth() {
        return this.getSelectedIndex();
    }
    public boolean isSelectedNull() {
    	if (this.getSelectedItem()== "")
    		return true;
    	else 
    		return false;
    }
}
