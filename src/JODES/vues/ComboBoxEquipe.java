package JODES.vues;
import JODES.modeles.Equipe;
import java.util.ArrayList;
import javax.swing.JComboBox;

/**
 * @author Ash Merienne
 */
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
    
    public boolean isSelectedNull() {
    	if (this.getItemCount() == 0)
    		return true;
    	if (this.getSelectedIndex() == 0)
    		return true;
    	else 
    		return false;
    }
    
    public Equipe getSelectedEntite() {
		return listeEquipes.get(this.getSelectedIndex()-1);
    }
}
