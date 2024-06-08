/*
 * 
 */
package JODES.controleurs;
import JODES.JO2024;
import JODES.modeles.Administrateur;
import JODES.modeles.Epreuve;
import JODES.vues.ComboBoxEpreuve;
import JODES.vues.MessageBox;
import JODES.vues.ModifierEpreuve;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;


/**
 * The Class ControleurBtnSelectEpreuve.
 *
 * @author Ash Merienne
 */
public class ControleurBtnSelectEpreuve implements ActionListener  {

    /** The epreuve. */
    protected Epreuve epreuve;
    
    /** The combo. */
    protected ComboBoxEpreuve combo;
    
    /** The option. */
    protected int option;
    
    /** The Constant MODIF. */
    public static final int MODIF = 0;
    
    /** The Constant SUPPR. */
    public static final int SUPPR = 1;
    
    /** The admin. */
    Administrateur admin;
    
    /** The vue. */
    RetourVue vue;

    /**
     * Instantiates a new controleur btn select epreuve.
     *
     * @param vue the vue
     * @param combo the combo
     * @param option the option
     * @param admin the admin
     */
    public ControleurBtnSelectEpreuve(RetourVue vue, ComboBoxEpreuve combo, int option, Administrateur admin) {
        this.combo = combo;
        this.option = option;
        this.admin = admin;
        this.vue = vue;
    }

    /**
     * Action performed.
     *
     * @param e the e
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        if (this.combo.isSelectedNull()) {
            new MessageBox(
                "Vous devez sélectionner une épreuve !",
                "Champ obligatoire",
                JOptionPane.OK_OPTION);
        }
        else {
        	int id = combo.getSelectedEntite().getIdEntite();
            this.epreuve = (Epreuve)JO2024.rechercheEntite(id);
            if (this.option == MODIF) {
                new ModifierEpreuve(this.epreuve, admin);
                vue.retour();
            } else {
                JO2024.removeEntite(epreuve);
                vue.retour();
            }
        }
    }
    
}
