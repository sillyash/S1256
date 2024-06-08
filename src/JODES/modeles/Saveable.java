/*
 * 
 */
package JODES.modeles;
import java.io.Serializable;


/**
 * The Interface Saveable.
 *
 * @author Ash Merienne
 */
public interface Saveable extends Serializable {

	/**
	 * Save to disk.
	 *
	 * @return the int
	 */
	public int saveToDisk();
	
}
