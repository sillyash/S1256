/*
 * 
 */
package JODES.vues;
import java.util.ArrayList;
import javax.swing.JComboBox;
import JODES.modeles.*;


/**
 * The Class ComboBoxSession.
 *
 * @author Ash Merienne
 */
public class ComboBoxSession extends JComboBox<String> {
    
    /** The liste sessions. */
    protected ArrayList<Session> listeSessions;

    /**
     * Instantiates a new combo box session.
     *
     * @param listeSessions the liste sessions
     */
    public ComboBoxSession(ArrayList<Session> listeSessions) {
        this.listeSessions = listeSessions;
        addItems();
    }

    /**
     * Adds the items.
     */
    protected void addItems() {
        this.addItem("");
        for (Session s : listeSessions)
        {
            this.addItem(s.getNom() + " " +
                s.getSaDiscipline().getNom() +
                s.getDate().toString());
        }
    }

    /**
     * Gets the item list.
     *
     * @return the item list
     */
    public ArrayList<Session> getItemList() {
        return listeSessions;
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
    public Session getSelectedEntite() {
    	return listeSessions.get(this.getSelectedIndex()-1);
    }
    
}
