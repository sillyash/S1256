/*
 * 
 */
package JODES.vues;
import JODES.modeles.Equipe;
import java.util.ArrayList;
import javax.swing.JComboBox;

// TODO: Auto-generated Javadoc
/**
 * The Class ComboBoxEquipe.
 *
 * @author Ash Merienne
 */
public class ComboBoxEquipe extends JComboBox<String> {
    
    /** The liste equipes. */
    protected ArrayList<Equipe> listeEquipes;

    /**
     * Instantiates a new combo box equipe.
     *
     * @param listeEquipes the liste equipes
     */
    public ComboBoxEquipe(ArrayList<Equipe> listeEquipes) {
        this.listeEquipes = listeEquipes;
        addItems();
    }

    /**
     * Adds the items.
     */
    protected void addItems() {
        this.addItem("");
        for (Equipe e : listeEquipes)
        {
            this.addItem(e.getNom());
        }
    }

    /**
     * Gets the item list.
     *
     * @return the item list
     */
    public ArrayList<Equipe> getItemList() {
        return this.listeEquipes;
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
    public Equipe getSelectedEntite() {
		return listeEquipes.get(this.getSelectedIndex()-1);
    }
}
