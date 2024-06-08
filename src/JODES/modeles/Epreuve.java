package JODES.modeles;
import java.util.ArrayList;

/**
 * @author Ash Merienne
 */
public class Epreuve extends Entite {
    
	protected ArrayList<Equipe> sesEquipes;
    protected Session session;
    
    // ----------- Constructors -----------

    public Epreuve(String nom, ArrayList<Equipe> equipes, Session session) {
        super(nom);
        this.sesEquipes = equipes;
        this.session = session;
    }

    // ----------- Getters & setters -----------

    public ArrayList<Equipe> getSesEquipes() {
        return sesEquipes;
    }

    public void setSesEquipes(ArrayList<Equipe> sesEquipes) {
        this.sesEquipes = sesEquipes;
    }

    public Session getSession() {
        return session;
    }

    public void setSession(Session session) {
        this.session = session;
    }
}
