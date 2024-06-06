package JODES.vues;
import java.util.ArrayList;
import javax.swing.JComboBox;

public class ComboBoxHoraires extends JComboBox<String> {
    
    protected ArrayList<String> horaires = new ArrayList<>();

    public ComboBoxHoraires() {
        this.addItem("09:00");this.addItem("09:30");
        this.addItem("10:00");this.addItem("10:30");
        this.addItem("11:00");this.addItem("11:30");
        this.addItem("12:00");this.addItem("12:30");
        this.addItem("13:00");this.addItem("13:30");
        this.addItem("14:00");this.addItem("14:30");
        this.addItem("15:00");this.addItem("15:30");
        this.addItem("16:00");this.addItem("16:30");
        this.addItem("17:00");this.addItem("17:30");
        this.addItem("18:00");
    }
}
