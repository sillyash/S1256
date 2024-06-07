package JODES.controleurs;
import JODES.JO2024;
import JODES.modeles.Equipe;
import JODES.vues.ComboBoxEquipe;
import JODES.vues.MessageBox;
import JODES.vues.ModifierEquipe;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class ControleurBtnSelectEquipe implements ActionListener  {

    protected Equipe equipe;
    protected ComboBoxEquipe CMB;
    protected int option;
    public static final int MODIF = 0;
    public static final int SUPPR = 1;

    public ControleurBtnSelectEquipe(ComboBoxEquipe combo, int option) {
        this.CMB = combo;
        if (option == MODIF || option == SUPPR) this.option = option;
        else this.option = MODIF;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (this.CMB.getSelectedItem() == "") {
            new MessageBox(
                "Vous devez sélectionner une équipe !",
                "Champ obligatoire",
                JOptionPane.YES_NO_CANCEL_OPTION);
        }
        else {
            String nomEpreuve = (String)CMB.getSelectedItem();
            this.equipe = (Equipe)JO2024.rechercheEntite(nomEpreuve);
            if (this.option == MODIF) {
                new ModifierEquipe(this.equipe);
            } else {
                JO2024.removeEntite(equipe);
            };
        }
    }
    
}