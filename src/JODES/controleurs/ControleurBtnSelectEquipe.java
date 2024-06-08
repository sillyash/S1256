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

public class ControleurBtnSelectEquipe implements ActionListener  {

    protected Equipe equipe;
    protected ComboBoxEquipe combo;
    protected int option;
    public static final int MODIF = 0;
    public static final int SUPPR = 1;
    Administrateur admin;
    RetourVue vue;

    public ControleurBtnSelectEquipe(RetourVue vue, ComboBoxEquipe combo, int option, Administrateur admin) {
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
