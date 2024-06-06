package JODES.vues;
import java.util.ArrayList;
import javax.swing.JComboBox;
import JODES.modeles.*;

public class ComboBoxHoraires extends JComboBox<String> {
    
    protected ArrayList<String> horaires = new ArrayList<>();

    public ComboBoxAthlete(ArrayList<Athlete> listeAthletes) {
        this.horaires.add("8:00");
        this.horaires.add("8:30");
        this.horaires.add("9:00");
        this.horaires.add("9:30");
        this.horaires.add("10:00");
        this.horaires.add("10:30");
        addItems();
    }

    protected void addItems() {
        for (String h : horaires)
        {
            this.addItem(h);
        }
    }
    
}
