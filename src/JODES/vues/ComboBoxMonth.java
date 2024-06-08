package JODES.vues;
import java.time.Month;
import java.util.ArrayList;
import javax.swing.JComboBox;

public class ComboBoxMonth extends JComboBox<String> {

	private static final long serialVersionUID = 1L;
	protected ArrayList<String> months = new ArrayList<>();
    protected ArrayList<Month> mois = new ArrayList<>();

    public ComboBoxMonth() {
        addItems();
    }

    protected void addItems() {
        months.add("");
        months.add("JAN");
        months.add("FEB");
        months.add("MAR");
        months.add("APR");
        months.add("MAY");
        months.add("JUN");
        months.add("JUL");
        months.add("AUG");
        months.add("SEP");
        months.add("NOV");
        months.add("DEC");

        mois.add(Month.JANUARY);
        mois.add(Month.FEBRUARY);
        mois.add(Month.MARCH);
        mois.add(Month.APRIL);
        mois.add(Month.MAY);
        mois.add(Month.JUNE);
        mois.add(Month.JULY);
        mois.add(Month.AUGUST);
        mois.add(Month.SEPTEMBER);
        mois.add(Month.OCTOBER);
        mois.add(Month.NOVEMBER);
        mois.add(Month.DECEMBER);

        for (String months : months) {
        	this.addItem(months);
        }
    }

    public ArrayList<String> getItemList() {
        return months;
    }

    public ArrayList<Month> getMonths() {
        return mois;
    }

    public int getSelectedMonth() {
        return this.getSelectedIndex();
    }
    
    public boolean isSelectedNull() {
    	if (this.getItemCount() == 0)
    		return true;
    	if (this.getSelectedItem()== "")
    		return true;
    	else 
    		return false;
    }
}
