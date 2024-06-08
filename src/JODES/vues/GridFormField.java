/*
 * 
 */
package JODES.vues;
import javax.swing.*;
import java.awt.*;

// TODO: Auto-generated Javadoc
/**
 * The Class GridFormField.
 *
 * @author Nicolas Vouilloux
 */
public class GridFormField extends JPanel {

    /** The input. */
    protected JComponent input;
    
    /** The label. */
    protected JLabel label;
    
    /** The grid. */
    protected GridLayout grid;

    // ----------- Constructors -----------

    /**
     * Instantiates a new grid form field.
     *
     * @param input the input
     * @param label the label
     */
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

    /**
     * Gets the input.
     *
     * @return the input
     */
    public JComponent getInput() {
        return input;
    }

    /**
     * Sets the input.
     *
     * @param input the new input
     */
    public void setInput(JComponent input) {
        this.input = input;
    }

    /**
     * Gets the label.
     *
     * @return the label
     */
    public JLabel getLabel() {
        return label;
    }

    /**
     * Sets the label.
     *
     * @param label the new label
     */
    public void setLabel(JLabel label) {
        this.label = label;
    }

    // ----------- Methods -----------

}
