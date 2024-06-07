package JODES.vues;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;

public class DatePicker extends JPanel {

    private final JTextField dayTextField;
    private final JTextField monthTextField;
    private final JTextField yearTextField;
    private LocalDate selectedDate;

    public DatePicker() {
        setLayout(new GridLayout(1,3));

        // Create text fields for day, month, and year
        ComboBoxDay = new ComboBoxDay();
        ComboBoxMonth = new ComboBoxMonth();
        ComboBoxYear = new ComboBoxYear();

        
        // Add components to the panel
        add(ComboBoxDay);
        add(ComboBoxMonth);
        add(ComboBoxYear);

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
}
