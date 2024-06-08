/*
 * 
 */
package JODES.vues;
import java.util.ArrayList;
import javax.swing.JComboBox;
import JODES.modeles.*;

// TODO: Auto-generated Javadoc
/**
 * The Class ComboBoxStatutSession.
 *
 * @author Nicolas Vouilloux
 */
public class ComboBoxStatutSession extends JComboBox<String> {
    
    /** The statut. */
    protected ArrayList<String> statut = new ArrayList<>();

    /**
     * Instantiates a new combo box statut session.
     */
    public ComboBoxStatutSession() {
        statut.add(Session.AMICAL);
        statut.add(Session.DEMIE);
        statut.add(Session.FINALE);
        statut.add(Session.HUITIEME);
        statut.add(Session.QUALIF);
        statut.add(Session.QUART);
        addItems();
    }

    /**
     * Gets the item list.
     *
     * @return the item list
     */
    public ArrayList<String> getItemList() {
        return statut;
    }

    /**
     * Adds the items.
     */
    protected void addItems() {
        this.addItem("");
        for (String s : statut)
        {
            this.addItem(s);
        }
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
}

