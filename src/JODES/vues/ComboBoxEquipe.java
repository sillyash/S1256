package JODES.vues;
import JODES.modeles.Equipe;
import java.util.ArrayList;
import javax.swing.JComboBox;

public class ComboBoxEquipe extends JComboBox<String> {
    
    protected ArrayList<Equipe> listeEquipes;

    public ComboBoxEquipe(ArrayList<Equipe> listeEquipes) {
        this.listeEquipes = listeEquipes;
        addItems();
    }

    protected void addItems() {
        this.addItem("");
        for (Equipe e : listeEquipes)
        {
            this.addItem(e.getNom());
        }
    }

    public ArrayList<Equipe> getItemList() {
        return this.listeEquipes;
    }
    
}