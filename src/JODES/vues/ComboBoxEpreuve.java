/*
 * 
 */
package JODES.vues;
import java.util.ArrayList;
import javax.swing.JComboBox;
import JODES.modeles.*;

// TODO: Auto-generated Javadoc
/**
 * The Class ComboBoxEpreuve.
 *
 * @author Nicolas Vouilloux
 */
public class ComboBoxEpreuve extends JComboBox<String> {
    
    /** The liste epreuves. */
    protected ArrayList<Epreuve> listeEpreuves;

    /**
     * Instantiates a new combo box epreuve.
     *
     * @param listeEpreuves the liste epreuves
     */
    public ComboBoxEpreuve(ArrayList<Epreuve> listeEpreuves) {
        this.listeEpreuves = listeEpreuves;
        addItems();
    }

    /**
     * Adds the items.
     */
    protected void addItems() {
        this.addItem("");
        for (Epreuve p : listeEpreuves)
        {
            this.addItem(p.getNom());
        }
    }

    /**
     * Gets the item list.
     *
     * @return the item list
     */
    public ArrayList<Epreuve> getItemList() {
        return listeEpreuves;
    }
    
    /**
     * Checks if is selected null.
     *
     * @return true, if is selected null
     */
    public boolean isSelectedNull() {
    	if (this.getItemCount() == 0)
    		return true;
    	if (this.getSelectedIndex() == 0)
    		return true;
    	else 
    		return false;
    }
    
    /**
     * Gets the selected entite.
     *
     * @return the selected entite
     */
    public Epreuve getSelectedEntite() {
    	return listeEpreuves.get(this.getSelectedIndex()-1);
    }
}
