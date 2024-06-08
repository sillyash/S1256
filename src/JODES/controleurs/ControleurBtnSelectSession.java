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

/**
 * @author Ash Merienne
 */
public class ControleurBtnSelectSession implements ActionListener  {

    protected Session session;
    protected ComboBoxSession combo;
    protected int option;
    public static final int MODIF = 0;
    public static final int SUPPR = 1;
    Administrateur admin;
    RetourVue vue;

    public ControleurBtnSelectSession(RetourVue vue, ComboBoxSession combo, int option, Administrateur admin) {
        this.combo = combo;
        this.option = option;
        this.admin = admin;
        this.vue = vue;
    }

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
