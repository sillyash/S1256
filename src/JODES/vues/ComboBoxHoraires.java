package JODES.vues;
import java.time.LocalTime;
import java.util.ArrayList;
import javax.swing.JComboBox;

/**
 * @author Nicolas Vouilloux
 */
public class ComboBoxHoraires extends JComboBox<String> {
    
    protected ArrayList<String> horaires = new ArrayList<>();

    public ComboBoxHoraires() {
        horaires.add("09:00");
        horaires.add("09:30");
        horaires.add("10:00");
        horaires.add("10:30");
        horaires.add("11:00");
        horaires.add("11:30");
        horaires.add("12:00");
        horaires.add("12:30");
        horaires.add("13:00");
        horaires.add("13:30");
        horaires.add("14:00");
        horaires.add("14:30");
        horaires.add("15:00");
        horaires.add("15:30");
        horaires.add("16:00");
        horaires.add("16:30");
        horaires.add("17:00");
        horaires.add("17:30");
        horaires.add("18:00");
        addItems();
    }

    protected void addItems() {
        this.addItem("");
        for (String s : horaires) {
            this.addItem(s);
        }
    }

    public ArrayList<String> getItemList() {
        return horaires;
    }
    
    public boolean isSelectedNull() {
    	if (this.getItemCount() == 0)
    		return true;
    	if (this.getSelectedIndex() == 0)
    		return true;
    	else 
    		return false;
    }

    public LocalTime getSelectedTime() {
        String hor = horaires.get(getSelectedIndex()-1);
        return LocalTime.parse(hor);
    }
}
