package JODES;

public class Epreuve extends Entité {

	protected int lastNum = 0;
	protected LocalDate date;
	protected LocalTime horaireDebut;
	protected LocalTime horaireFin;
	protected String session;
	protected final String FINALE = "finale";
	protected final String DEMIE = "demie-finale";
	protected final String QUART = "quart de finale";
	protected final String HUITIEME = "huitième de finale";
	protected final String QUALIF = "qualification";

}