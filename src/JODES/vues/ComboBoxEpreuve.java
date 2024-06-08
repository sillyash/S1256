package JODES.vues;
import java.util.ArrayList;
import javax.swing.JComboBox;
import JODES.modeles.*;

/**
 * @author Nicolas Vouilloux
 */
public class ComboBoxEpreuve extends JComboBox<String> {
    
    protected ArrayList<Epreuve> listeEpreuves;

    public ComboBoxEpreuve(ArrayList<Epreuve> listeEpreuves) {
        this.listeEpreuves = listeEpreuves;
        addItems();
    }

    protected void addItems() {
        this.addItem("");
        for (Epreuve p : listeEpreuves)
        {
            this.addItem(p.getNom());
        }
    }

    public ArrayList<Epreuve> getItemList() {
        return listeEpreuves;
    }
    
    public boolean isSelectedNull() {
    	if (this.getItemCount() == 0)
    		return true;
    	if (this.getSelectedIndex() == 0)
    		return true;
    	else 
    		return false;
    }
    
    public Epreuve getSelectedEntite() {
    	return listeEpreuves.get(this.getSelectedIndex()-1);
    }
}
