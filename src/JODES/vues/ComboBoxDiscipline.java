/*
 * 
 */
package JODES.vues;
import java.util.ArrayList;
import javax.swing.JComboBox;
import JODES.modeles.*;

// TODO: Auto-generated Javadoc
/**
 * The Class ComboBoxDiscipline.
 *
 * @author Ash Merienne
 */
public class ComboBoxDiscipline extends JComboBox<String> {
    
    /** The disciplines. */
    protected ArrayList<Discipline> disciplines;

    /**
     * Instantiates a new combo box discipline.
     *
     * @param disciplines the disciplines
     */
    public ComboBoxDiscipline(ArrayList<Discipline> disciplines) {
        this.disciplines = disciplines;
        addItems();
    }

    /**
     * Adds the items.
     */
    protected void addItems() {
        this.addItem("");
        for (Discipline p : disciplines)
        {
            this.addItem(p.getNom());
        }
    }

    /**
     * Gets the item list.
     *
     * @return the item list
     */
    public ArrayList<Discipline> getItemList() {
        return disciplines;
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
    public Discipline getSelectedEntite() {
		return disciplines.get(this.getSelectedIndex()-1);
    }
}
