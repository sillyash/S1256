package JODES.vues;
import javax.swing.*;
import java.awt.*;

/**
 * @author Nicolas Vouilloux
 */
public class GridFormField extends JPanel {

    protected JComponent input;
    protected JLabel label;
    protected GridLayout grid;

    // ----------- Constructors -----------

    public GridFormField(JComponent input, JLabel label) {
        this.input = input;
        this.label = label;
        this.grid = new GridLayout(2,1);
        this.input.setPreferredSize(new Dimension(300, 25));
        this.label.setPreferredSize(new Dimension(300, 25));
        this.add(label);
        this.add(input);
    }

    // ----------- Getters & setters -----------

    public JComponent getInput() {
        return input;
    }

    public void setInput(JComponent input) {
        this.input = input;
    }

    public JLabel getLabel() {
        return label;
    }

    public void setLabel(JLabel label) {
        this.label = label;
    }

    // ----------- Methods -----------

}
