package JODES.modeles;

public class Pays extends Entite {
	
	protected String codePays; // FRA, USA, GER...

	// ----------- Constructors -----------
	
	public Pays(String nom, String codePays) {
		super(nom);
		this.codePays = codePays;
	}
	
	// ----------- Getters & setters -----------
	
	public String getCodePays() {
		return codePays;
	}

	public void setCodePays(String codePays) {
		this.codePays = codePays;
	}
	
	// ----------- Methods -----------

}