/*
 * 
 */
package JODES.modeles;

// TODO: Auto-generated Javadoc
/**
 * The Class DataParser.
 *
 * @author Ash Merienne
 */
public class DataParser {
    
    /**
     *  
     *
     * @param text the text
     * @return boolean
     */
	public static boolean isTextFieldNull(String text) {
		return text.equals("") || text.matches("[\\t ]+");
    }
	
    /**
     * Checks if is int.
     *
     * @param s the s
     * @return true, if is int
     */
    public static boolean isInt(String s) {
        try {
            Integer.parseInt(s);
        }
        catch (NumberFormatException e) {
            return false;
        }
        return true;
    }

    /**
     * Checks if is double.
     *
     * @param s the s
     * @return true, if is double
     */
    public static boolean isDouble(String s) {
        try {
            Double.parseDouble(s);
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }

    /**
     * Checks if is float.
     *
     * @param s the s
     * @return true, if is float
     */
    public static boolean isFloat(String s) {
        try {
            Float.parseFloat(s);
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }
        
    /**
     * Checks if is session.
     *
     * @param e the e
     * @return true, if is session
     */
    public static boolean isSession(Entite e) {
        return e instanceof Session;
    }

    /**
     * Checks if is athlete.
     *
     * @param e the e
     * @return true, if is athlete
     */
    public static boolean isAthlete(Entite e) {
        return e instanceof Athlete;
    }

    /**
     * Checks if is pays.
     *
     * @param e the e
     * @return true, if is pays
     */
    public static boolean isPays(Entite e) {
        return e instanceof Pays;
    }

    /**
     * Checks if is ville.
     *
     * @param e the e
     * @return true, if is ville
     */
    public static boolean isVille(Entite e) {
        return e instanceof Ville;
    }

    /**
     * Checks if is lieu.
     *
     * @param e the e
     * @return true, if is lieu
     */
    public static boolean isLieu(Entite e) {
        return e instanceof Lieu;
    }

    /**
     * Checks if is discipline.
     *
     * @param e the e
     * @return true, if is discipline
     */
    public static boolean isDiscipline(Entite e) {
        return e instanceof Discipline;
    }

    /**
     * Checks if is epreuve.
     *
     * @param e the e
     * @return true, if is epreuve
     */
    public static boolean isEpreuve(Entite e) {
        return e instanceof Session;
    }

	/**
	 * Checks if is equipe.
	 *
	 * @param e the e
	 * @return true, if is equipe
	 */
	public static boolean isEquipe(Entite e) {
		return e instanceof Equipe;
	}
}
