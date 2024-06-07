package JODES.vues;
import java.util.ArrayList;
import javax.swing.JComboBox;

public class ComboBoxMonth extends JComboBox<String> {

	private static final long serialVersionUID = 1L;
	protected ArrayList<Integer> days = new ArrayList<>();

    public ComboBoxMonth() {
        addItems();
    }

    protected void addItems() {
        this.addItem("");
        this.addItem("JAN");
        this.addItem("FEB");
        this.addItem("MAR");
        this.addItem("APR");
        this.addItem("MAY");
        this.addItem("JUN");
        this.addItem("JUL");
        this.addItem("AUG");
        this.addItem("SEP");
        this.addItem("NOV");
        this.addItem("DEC");
    }

    public ArrayList<Integer> getItemList() {
        return days;
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
