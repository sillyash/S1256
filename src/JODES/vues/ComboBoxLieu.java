/*
 * 
 */
package JODES.vues;
import java.util.ArrayList;
import javax.swing.JComboBox;
import JODES.modeles.*;

// TODO: Auto-generated Javadoc
/**
 * The Class ComboBoxLieu.
 *
 * @author Nicolas Vouilloux
 */
public class ComboBoxLieu extends JComboBox<String> {
    
    /** The liste lieux. */
    protected ArrayList<Lieu> listeLieux;

    /**
     * Instantiates a new combo box lieu.
     *
     * @param listeLieux the liste lieux
     */
    public ComboBoxLieu(ArrayList<Lieu> listeLieux) {
        this.listeLieux = listeLieux;
        addItems();
    }

    /**
     * Adds the items.
     */
    protected void addItems() {
        this.addItem("");
        for (Lieu p : listeLieux)
        {
            this.addItem(p.getNom());
        }
    }

    /**
     * Gets the item list.
     *
     * @return the item list
     */
    public ArrayList<Lieu> getItemList() {
        return listeLieux;
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
    public Lieu getSelectedEntite() {
    	return listeLieux.get(this.getSelectedIndex()-1);
    }
}