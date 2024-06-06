package JODES.vues;
import java.util.ArrayList;
import javax.swing.JComboBox;
import JODES.modeles.*;

public class ComboBoxPays extends JComboBox<String> {
    
    protected ArrayList<Pays> listePays;

    public ComboBoxPays(ArrayList<Pays> listePays) {
        this.listePays = listePays;
        addItems();
    }

    protected void addItems() {
        for (Pays p : listePays)
        {
            this.addItem(p.getNom());
        }
    }
    
}
