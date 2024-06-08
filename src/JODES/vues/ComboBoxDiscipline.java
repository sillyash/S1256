package JODES.vues;
import java.util.ArrayList;
import javax.swing.JComboBox;
import JODES.modeles.*;

/**
 * @author Ash Merienne
 */
public class ComboBoxDiscipline extends JComboBox<String> {
    
    protected ArrayList<Discipline> disciplines;

    public ComboBoxDiscipline(ArrayList<Discipline> disciplines) {
        this.disciplines = disciplines;
        addItems();
    }

    protected void addItems() {
        this.addItem("");
        for (Discipline p : disciplines)
        {
            this.addItem(p.getNom());
        }
    }

    public ArrayList<Discipline> getItemList() {
        return disciplines;
    }
    
    public boolean isSelectedNull() {
    	if (this.getItemCount() == 0)
    		return true;
    	if (this.getSelectedIndex() == 0)
    		return true;
    	else 
    		return false;
    }
    
    public Discipline getSelectedEntite() {
		return disciplines.get(this.getSelectedIndex()-1);
    }
}
