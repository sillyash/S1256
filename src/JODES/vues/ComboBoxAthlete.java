package JODES.vues;
import java.util.ArrayList;
import javax.swing.JComboBox;
import JODES.modeles.*;

public class ComboBoxAthlete extends JComboBox<String> {
    
    protected ArrayList<Athlete> listeAthletes;

    public ComboBoxAthlete(ArrayList<Athlete> listeAthletes) {
        this.listeAthletes = listeAthletes;
        addItems();
    }

    protected void addItems() {
        for (Athlete a : listeAthletes)
        {
            this.addItem(a.getPrenom() + " " + a.getNom());
        }
    }
    
}
