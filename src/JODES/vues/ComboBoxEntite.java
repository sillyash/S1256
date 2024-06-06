package JODES.vues;
import java.util.ArrayList;
import javax.swing.JComboBox;
import JODES.modeles.*;

public class ComboBoxEntite extends JComboBox<String> {
    
    protected ArrayList<Entite> listeEntites;

    public ComboBoxEntite(ArrayList<Entite> listeEntites) {
        this.listeEntites = listeEntites;
        addItems();
    }

    protected void addItems() {
        for (Entite e : listeEntites)
        {
            this.addItem(e.getNom());
        }
    }
    
}
