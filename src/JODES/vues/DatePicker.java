package JODES.vues;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;

public class DatePicker extends JPanel {

    private LocalDate selectedDate;
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
        return selectedDate;
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Simple Text Date Picker");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new DatePicker());
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
    public boolean isDateValid() {
		if (comboBoxDay.isSelectedNull() || comboBoxMonth.isSelectedNull() || comboBoxYear.isSelectedNull()) {
            return false;
        }
        int day = comboBoxDay.getSelectedDay();
        int month = comboBoxMonth.getSelectedMonth();
        if(((month == 2 ||month == 4 ||month == 6|| month == 9||month == 11)&&day == 31)||month == 2 && day == 30)
        	return false;
        else
        	return true;
    }
}
