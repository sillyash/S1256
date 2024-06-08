package JODES.vues;
import java.util.ArrayList;
import javax.swing.JComboBox;

public class ComboBoxYear extends JComboBox<String> {

	private static final long serialVersionUID = 1L;
	protected ArrayList<Integer> days = new ArrayList<>();

    public ComboBoxYear() {
        addItems();
    }

    protected void addItems() {
        this.addItem("");
        for (Integer i=2024; i<2027; i++) {
            this.addItem(String.valueOf(i));
        }
    }

    public ArrayList<Integer> getItemList() {
        return days;
    }

    public int getSelectedYear() {
        return this.getSelectedIndex()+2023;
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
