/*
 * 
 */
package JODES.vues;
import java.util.ArrayList;
import javax.swing.JComboBox;
import JODES.modeles.*;


/**
 * The Class ComboBoxAthlete.
 *
 * @author Ash Merienne
 */
public class ComboBoxAthlete extends JComboBox<String> {
    
    /** The liste athletes. */
    protected ArrayList<Athlete> listeAthletes;

    /**
     * Instantiates a new combo box athlete.
     *
     * @param listeAthletes the liste athletes
     */
    public ComboBoxAthlete(ArrayList<Athlete> listeAthletes) {
        this.listeAthletes = listeAthletes;
        addItems();
    }

    /**
     * Adds the items.
     */
    protected void addItems() {
        this.addItem("");
        for (Athlete a : listeAthletes)
        {
            this.addItem(a.getPrenom() + " " + a.getNom());
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
    
    /**
     * Gets the item list.
     *
     * @return the item list
     */
    public ArrayList<Athlete> getItemList() {
        return listeAthletes;
    }
    
    /**
     * Sets the item list.
     *
     * @param athletes the new item list
     */
    public void setItemList(ArrayList<Athlete> athletes) {
        this.listeAthletes = athletes;
        this.removeAllItems();
        this.addItems();
    }
    
    /**
     * Gets the selected entite.
     *
     * @return the selected entite
     */
    public Athlete getSelectedEntite() {
		return listeAthletes.get(this.getSelectedIndex()-1);
    }
    
}
