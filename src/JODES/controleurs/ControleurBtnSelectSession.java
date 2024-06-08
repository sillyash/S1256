/*
 * 
 */
package JODES.controleurs;
import JODES.JO2024;
import JODES.modeles.Administrateur;
import JODES.modeles.Session;
import JODES.vues.ComboBoxSession;
import JODES.vues.MessageBox;
import JODES.vues.ModifierSession;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

// TODO: Auto-generated Javadoc
/**
 * The Class ControleurBtnSelectSession.
 *
 * @author Ash Merienne
 */
public class ControleurBtnSelectSession implements ActionListener  {

    /** The session. */
    protected Session session;
    
    /** The combo. */
    protected ComboBoxSession combo;
    
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
     * Instantiates a new controleur btn select session.
     *
     * @param vue the vue
     * @param combo the combo
     * @param option the option
     * @param admin the admin
     */
    public ControleurBtnSelectSession(RetourVue vue, ComboBoxSession combo, int option, Administrateur admin) {
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
            this.session = (Session)JO2024.rechercheEntite(id);
            if (this.option == MODIF) {
                new ModifierSession(this.session, null);
                vue.retour();
            } else {
                JO2024.removeEntite(session);
                vue.retour();
            };
        }
    }
    
}
