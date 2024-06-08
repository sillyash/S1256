/*
 * 
 */
package JODES.modeles;
import java.util.ArrayList;


/**
 * The Class Epreuve.
 *
 * @author Ash Merienne
 */
public class Epreuve extends Entite {
    
	/** The ses equipes. */
	protected ArrayList<Equipe> sesEquipes;
    
    /** The session. */
    protected Session session;
    
    // ----------- Constructors -----------

    /**
     * Instantiates a new epreuve.
     *
     * @param nom the nom
     * @param equipes the equipes
     * @param session the session
     */
    public Epreuve(String nom, ArrayList<Equipe> equipes, Session session) {
        super(nom);
        this.sesEquipes = equipes;
        this.session = session;
    }

    // ----------- Getters & setters -----------

    /**
     * Gets the ses equipes.
     *
     * @return the ses equipes
     */
    public ArrayList<Equipe> getSesEquipes() {
        return sesEquipes;
    }

    /**
     * Sets the ses equipes.
     *
     * @param sesEquipes the new ses equipes
     */
    public void setSesEquipes(ArrayList<Equipe> sesEquipes) {
        this.sesEquipes = sesEquipes;
    }

    /**
     * Gets the session.
     *
     * @return the session
     */
    public Session getSession() {
        return session;
    }

    /**
     * Sets the session.
     *
     * @param session the new session
     */
    public void setSession(Session session) {
        this.session = session;
    }
}
