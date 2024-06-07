package JODES.vues;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JComboBox;
import JODES.modeles.*;

public class ComboBoxAthlete extends JComboBox<String> {
    
    protected ArrayList<Athlete> listeAthletes;

    public ComboBoxAthlete(ArrayList<Athlete> listeAthletes) {
        this.listeAthletes = listeAthletes;
        addItems();
    }

    protected void addItems() {
        this.addItem("");
        for (Athlete a : listeAthletes)
        {
            this.addItem(a.getPrenom() + " " + a.getNom());
        }
    }
    public boolean isSelectedNull() {
    	if (this.getSelectedItem()== "")
    		return true;
    	else 
    		return false;
    }
    
    
    public ArrayList<Athlete> getItemList() {
        return listeAthletes;
    }
    
}
