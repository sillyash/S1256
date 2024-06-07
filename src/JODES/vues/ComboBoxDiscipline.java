package JODES.vues;
import java.util.ArrayList;
import javax.swing.JComboBox;
import JODES.modeles.*;

public class ComboBoxDiscipline extends JComboBox<String> {
    
    protected ArrayList<Discipline> discipline;

    public ComboBoxDiscipline(ArrayList<Discipline> discipline) {
        this.discipline = discipline;
        addItems();
    }

    protected void addItems() {
        this.addItem("");
        for (Discipline p : discipline)
        {
            this.addItem(p.getNom());
        }
    }

    public ArrayList<Discipline> getItemList() {
        return discipline;
    }
    public boolean isSelectedNull() {
    	if (this.getSelectedItem()== "")
    		return true;
    	else 
    		return false;
    }
}
