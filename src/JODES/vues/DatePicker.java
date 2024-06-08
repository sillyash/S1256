package JODES.vues;
import javax.swing.*;
import java.awt.*;
import java.time.LocalDate;

/**
 * @author Nicolas Vouilloux
 */
public class DatePicker extends JPanel {

    ComboBoxDay comboBoxDay = new ComboBoxDay();
    ComboBoxMonth comboBoxMonth = new ComboBoxMonth();
    ComboBoxYear comboBoxYear = new ComboBoxYear();
    
    
    public DatePicker() {
		setLayout(new GridLayout(1,3));
        // Add components to the panel
        add(comboBoxDay);
        add(comboBoxMonth);
        add(comboBoxYear);
    }

    public LocalDate getSelectedDate() {
        int day, month, year;

        day = comboBoxDay.getSelectedDay();
        month = comboBoxMonth.getSelectedMonth();
        year = comboBoxYear.getSelectedYear();

        return LocalDate.of(year,month,day);
    }

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
