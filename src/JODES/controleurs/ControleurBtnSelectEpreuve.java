package JODES.controleurs;
import JODES.JO2024;
import JODES.modeles.Administrateur;
import JODES.modeles.Epreuve;
import JODES.vues.ComboBoxEpreuve;
import JODES.vues.EpreuveFrame;
import JODES.vues.MessageBox;
import JODES.vues.ModifierEpreuve;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class ControleurBtnSelectEpreuve implements ActionListener  {

    protected Epreuve epreuve;
    protected ComboBoxEpreuve CMB;
    protected int option;
    public static final int MODIF = 0;
    public static final int SUPPR = 1;
    Administrateur admin;

    public ControleurBtnSelectEpreuve(ComboBoxEpreuve combo, int option, Administrateur admin) {
        this.CMB = combo;
        if (option == MODIF || option == SUPPR) this.option = option;
        else this.option = MODIF;
        this.admin = admin;
    }

    public ControleurBtnSelectEpreuve(EpreuveFrame epreuveFrame, Administrateur admin2) {
        //TODO Auto-generated constructor stub
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (this.CMB.getSelectedItem() == "") {
            new MessageBox(
                "Vous devez sélectionner une épreuve !",
                "Champ obligatoire",
                JOptionPane.YES_NO_CANCEL_OPTION);
        }
        else {
            String nomEpreuve = (String)CMB.getSelectedItem();
            this.epreuve = (Epreuve)JO2024.rechercheEntite(nomEpreuve);
            if (this.option == MODIF) {
                new ModifierEpreuve(this.epreuve, admin);
            } else {
                JO2024.removeEntite(epreuve);
            }
        }
    }
    
}
