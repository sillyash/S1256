/*
 * 
 */
package JODES.vues;
import java.util.ArrayList;
import javax.swing.JComboBox;
import JODES.modeles.*;

// TODO: Auto-generated Javadoc
/**
 * The Class ComboBoxPays.
 *
 * @author Ash Merienne
 */
public class ComboBoxPays extends JComboBox<String> {
    
    /** The liste pays. */
    protected ArrayList<Pays> listePays;

    /**
     * Instantiates a new combo box pays.
     *
     * @param listePays the liste pays
     */
    public ComboBoxPays(ArrayList<Pays> listePays) {
        this.listePays = listePays;
        addItems();
    }

    /**
     * Adds the items.
     */
    protected void addItems() {
        this.addItem("");
        for (Pays p : listePays)
        {
            this.addItem(p.getNom());
        }
    }

    /**
     * Gets the item list.
     *
     * @return the item list
     */
    public ArrayList<Pays> getItemList() {
        return listePays;
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
    public Pays getSelectedEntite() {
    	return listePays.get(this.getSelectedIndex()-1);
    }
}
