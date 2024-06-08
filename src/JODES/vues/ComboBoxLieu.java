package JODES.vues;
import java.util.ArrayList;
import javax.swing.JComboBox;
import JODES.modeles.*;

/**
 * @author Nicolas Vouilloux
 */
public class ComboBoxLieu extends JComboBox<String> {
    
    protected ArrayList<Lieu> listeLieux;

    public ComboBoxLieu(ArrayList<Lieu> listeLieux) {
        this.listeLieux = listeLieux;
        addItems();
    }

    protected void addItems() {
        this.addItem("");
        for (Lieu p : listeLieux)
        {
            this.addItem(p.getNom());
        }
    }

    public ArrayList<Lieu> getItemList() {
        return listeLieux;
    }
    
    public boolean isSelectedNull() {
    	if (this.getItemCount() == 0)
    		return true;
    	if (this.getSelectedIndex() == 0)
    		return true;
    	else 
    		return false;
    }
    
    public Lieu getSelectedEntite() {
    	return listeLieux.get(this.getSelectedIndex()-1);
    }
}