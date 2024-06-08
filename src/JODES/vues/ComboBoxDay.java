package JODES.vues;
import java.util.ArrayList;
import javax.swing.JComboBox;

public class ComboBoxDay extends JComboBox<String> {

	private static final long serialVersionUID = 1L;
	protected ArrayList<Integer> days = new ArrayList<>();

    public ComboBoxDay() {
        addItems();
    }

    protected void addItems() {
        this.addItem("");
        for (Integer i=1; i<32; i++) {
            this.addItem(String.valueOf(i));
        }
    }

    public ArrayList<Integer> getItemList() {
        return days;
    }

    public int getSelectedDay() {
        return this.getSelectedIndex();
    }
    
    public boolean isSelectedNull() {
    	if (this.getItemCount() == 0)
    		return true;
    	if (this.getSelectedItem()== "")
    		return true;
    	else 
    		return false;
    }
}
