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

public class ControleurBtnSelectSession implements ActionListener  {

    protected Session session;
    protected ComboBoxSession CMB;
    protected int option;
    public static final int MODIF = 0;
    public static final int SUPPR = 1;
    Administrateur admin;

    public ControleurBtnSelectSession(ComboBoxSession combo, Session session, Administrateur admin) {
        this.admin = admin;
        this.session = session;
        this.CMB = combo;
    }

    public ControleurBtnSelectSession(ComboBoxSession combo, int modif2) {
        //TODO Auto-generated constructor stub
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
            this.session = (Session)JO2024.rechercheEntite(nomEpreuve);
            if (this.option == MODIF) {
                new ModifierSession(this.session, null);
            } else {
                JO2024.removeEntite(session);
            };
        }
    }
    
}
