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

    public int getSelectedDay() {
        return this.getSelectedIndex()+2023;
    }
    
}
