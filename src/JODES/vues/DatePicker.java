/*
 * 
 */
package JODES.vues;
import javax.swing.*;
import java.awt.*;
import java.time.LocalDate;

// TODO: Auto-generated Javadoc
/**
 * The Class DatePicker.
 *
 * @author Nicolas Vouilloux
 */
public class DatePicker extends JPanel {

    /** The combo box day. */
    ComboBoxDay comboBoxDay = new ComboBoxDay();
    
    /** The combo box month. */
    ComboBoxMonth comboBoxMonth = new ComboBoxMonth();
    
    /** The combo box year. */
    ComboBoxYear comboBoxYear = new ComboBoxYear();
    
    
    /**
     * Instantiates a new date picker.
     */
    public DatePicker() {
		setLayout(new GridLayout(1,3));
        // Add components to the panel
        add(comboBoxDay);
        add(comboBoxMonth);
        add(comboBoxYear);
    }

    /**
     * Gets the selected date.
     *
     * @return the selected date
     */
    public LocalDate getSelectedDate() {
        int day, month, year;

        day = comboBoxDay.getSelectedDay();
        month = comboBoxMonth.getSelectedMonth();
        year = comboBoxYear.getSelectedYear();

        return LocalDate.of(year,month,day);
    }

    /**
     * Checks if is date valid.
     *
     * @return true, if is date valid
     */
    public boolean isDateValid() {
		if (comboBoxDay.isSelectedNull() || comboBoxMonth.isSelectedNull() || comboBoxYear.isSelectedNull()) {
            return false;
        }
        int day = comboBoxDay.getSelectedDay();
        int month = comboBoxMonth.getSelectedMonth();
        if(((month == 2 ||month == 4 ||month == 6|| month == 9||month == 11)&&day == 31)||month == 2 && day >= 29)
        	return false;
        else
        	return true;
    }
}
