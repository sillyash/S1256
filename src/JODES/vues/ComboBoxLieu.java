package JODES.vues;
import java.util.ArrayList;
import javax.swing.JComboBox;
import JODES.modeles.*;

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
    	if (this.getSelectedItem()== "")
    		return true;
    	else 
    		return false;
    }
    
    public Entite getSelectedEntite() {
    	return listeLieux.get(this.getSelectedIndex()-1);
    }
}