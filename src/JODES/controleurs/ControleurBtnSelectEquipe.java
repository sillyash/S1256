/*
 * 
 */
package JODES.controleurs;
import JODES.JO2024;
import JODES.modeles.Administrateur;
import JODES.modeles.Equipe;
import JODES.vues.ComboBoxEquipe;
import JODES.vues.MessageBox;
import JODES.vues.ModifierEquipe;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;


// TODO: Auto-generated Javadoc
/**
 * The Class ControleurBtnSelectEquipe.
 *
 * @author Ash Merienne
 */
public class ControleurBtnSelectEquipe implements ActionListener  {

    /** The equipe. */
    protected Equipe equipe;
    
    /** The combo. */
    protected ComboBoxEquipe combo;
    
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
     * Instantiates a new controleur btn select equipe.
     *
     * @param vue the vue
     * @param combo the combo
     * @param option the option
     * @param admin the admin
     */
    public ControleurBtnSelectEquipe(RetourVue vue, ComboBoxEquipe combo, int option, Administrateur admin) {
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
                "Vous devez sélectionner une équipe !",
                "Champ obligatoire",
                JOptionPane.OK_OPTION);
        }
        else {
            int id = combo.getSelectedEntite().getIdEntite();
            this.equipe = (Equipe)JO2024.rechercheEntite(id);
            if (this.option == MODIF) {
                new ModifierEquipe(this.equipe, admin);
                vue.retour();
            } else {
                JO2024.removeEntite(equipe);
                vue.retour();
            };
        }
    }
    
}
