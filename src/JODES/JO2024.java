package JODES;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;
import JODES.modeles.*;

/**
 * @author Ash Merienne
 */
public class JO2024 {

	public static ArrayList<Entite> sesEntites = new ArrayList<Entite>();
	protected static ArrayList<Utilisateur> sesUtilisateurs = new ArrayList<Utilisateur>();
	
	public static ArrayList<Pays> PAYS = new ArrayList<Pays>();
	public static ArrayList<Discipline> DISCIPLINES = new ArrayList<>();
	public static ArrayList<Ville> VILLES = new ArrayList<>();
	public static ArrayList<Lieu> LIEUX = new ArrayList<>();
	
	public static final LocalDate dateDebutJO = LocalDate.of(2024, Month.JULY, 12);
	public static final LocalDate dateFinJO = LocalDate.of(2024, Month.JULY, 30);
	public static final Saison Paris2024 = new Saison("2024 Paris Summer Olympics", dateDebutJO, dateFinJO);
	
	// ----------- Getters & setters -----------
	
	public static ArrayList<Entite> getSesEntites() {
		return sesEntites;
	}

	public static void setSesEntites(ArrayList<Entite> sesEntites) {
		JO2024.sesEntites = sesEntites;
	}

	public static ArrayList<Utilisateur> getSesUtilisateurs() {
		return sesUtilisateurs;
	}

	public static void setSesUtilisateurs(ArrayList<Utilisateur> sesUtilisateurs) {
		JO2024.sesUtilisateurs = sesUtilisateurs;
	}
	
	public static void addEntite(Entite entite) {
		sesEntites.add(entite);
	}
	
	public static void removeEntite(Entite entite) {
		sesEntites.remove(entite);
	}
	
	// ----------- Methods -----------
	
	/**
	 * @author Nicolas Vouilloux
	 */
	public static int demandeConnexion(String login, String motDePasse) {
		Locale unicode = Locale.FRANCE;
		for (Utilisateur user : sesUtilisateurs)
		{
			if (user.getLogin().toUpperCase(unicode) == login.toUpperCase(unicode))
			{
				if (user.connexion(motDePasse)) {
					return 1;
				}
				else return -1;
			}
		}
		return 0;
	}

	/**
	 * @author Ash Merienne
	 */
	public static Entite rechercheEntite(String nomEntite) {
		nomEntite = nomEntite.toUpperCase();
		for (Entite entite : sesEntites) {
			if (entite.getNom().toUpperCase().contains(nomEntite))
			{
				return entite;
			}
		}
		return null;
	}
	
	/**
	 * @author Ash Merienne
	 */
	public static Entite rechercheEntite(int idEntite) {
		for (Entite entite : sesEntites) {
			if (entite.getIdEntite() == idEntite)
			{
				return entite;
			}
		}
		return null;
	}
	
	/**
	 * @author Nicolas Vouilloux
	 */
	public static Utilisateur rechercheUtilisateur(String login) {
		Locale unicode = Locale.FRANCE;
		for (Utilisateur user : sesUtilisateurs) {
			if(user.getLogin().toUpperCase(unicode) == login.toUpperCase(unicode)) {
				return user;
			}
		}
		return null;
	}

	/**
	 * @author Ash Merienne
	 */
	public static Entite rechercheEntite(String nomEntite, String typeEntite) {
		nomEntite = nomEntite.toUpperCase();
		for (Entite entite : sesEntites) {
			System.out.println(entite.getClass());
			if (entite.getClass().toString() == typeEntite)
			{
				if (entite.getNom().toUpperCase().contains(nomEntite))
				{
					return entite;
				}
			}
		}
		return null;
	}

	/**
	 * @author Ash Merienne
	 */
	public static ArrayList<Athlete> getAthletes()
	{
		ArrayList<Athlete> athletes = new ArrayList<>();
		for (Entite e : sesEntites)
		{
			if (DataParser.isAthlete(e))
			{
				athletes.add((Athlete)e);
			}
		}
		return athletes;
	}

	/**
	 * @author Ash Merienne
	 */
	public static ArrayList<Session> getSessions()
	{
		ArrayList<Session> sessions = new ArrayList<>();
		for (Entite e : sesEntites)
		{
			if (DataParser.isSession(e))
			{
				sessions.add((Session)e);
			}
		}
		return sessions;
	}

	/**
	 * @author Ash Merienne
	 */
	public static ArrayList<Epreuve> getEpreuves()
	{
		ArrayList<Epreuve> epreuves = new ArrayList<>();
		for (Entite e : sesEntites)
		{
			if (DataParser.isEpreuve(e))
			{
				epreuves.add((Epreuve)e);
			}
		}
		return epreuves;
	}

	/**
	 * @author Ash Merienne
	 */
	public static ArrayList<Equipe> getEquipes()
	{
		ArrayList<Equipe> equipes = new ArrayList<>();
		for (Entite e : sesEntites)
		{
			if (DataParser.isEpreuve(e))
			{
				equipes.add((Equipe)e);
			}
		}
		return equipes;
	}

	/**
	 * @author Ash Merienne
	 */
	public static ArrayList<Pays> getPays()
	{
		return PAYS;
	}

	/**
	 * @author Ash Merienne
	 */
	public static ArrayList<Discipline> getDisciplines()
	{
		return DISCIPLINES;
	}

	public static ArrayList<Lieu> getLieux() {
		return LIEUX;
	}

	public static void initialize() {
		Collections.addAll(PAYS,
		new Pays("Afghanistan", "AFG"),
		new Pays("Albanie", "ALB"),
		new Pays("Algérie", "ALG"),
		new Pays("Andorre", "AND"),
		new Pays("Angola", "ANG"),
		new Pays("Antigua-et-Barbuda", "ANT"),
		new Pays("Argentine", "ARG"),
		new Pays("Arménie", "ARM"),
		new Pays("Australie", "AUS"),
		new Pays("Autriche", "AUT"),
		new Pays("Azerbaïdjan", "AZE"),
		new Pays("Bahamas", "BAH"),
		new Pays("Bahreïn", "BHR"),
		new Pays("Bangladesh", "BAN"),
		new Pays("Barbade", "BRB"),
		new Pays("Bélarus", "BLR"),
		new Pays("Belgique", "BEL"),
		new Pays("Belize", "BIZ"),
		new Pays("Bénin", "BEN"),
		new Pays("Bhoutan", "BHU"),
		new Pays("Bolivie", "BOL"),
		new Pays("Bosnie-Herzégovine", "BIH"),
		new Pays("Botswana", "BOT"),
		new Pays("Brésil", "BRA"),
		new Pays("Brunéi Darussalam", "BRU"),
		new Pays("Bulgarie", "BUL"),
		new Pays("Burkina Faso", "BUR"),
		new Pays("Burundi", "BDI"),
		new Pays("Cabo Verde", "CPV"),
		new Pays("Cambodge", "CAM"),
		new Pays("Cameroun", "CMR"),
		new Pays("Canada", "CAN"),
		new Pays("République centrafricaine", "CAF"),
		new Pays("Tchad", "CHA"),
		new Pays("Chili", "CHI"),
		new Pays("Chine", "CHN"),
		new Pays("Colombie", "COL"),
		new Pays("Comores", "COM"),
		new Pays("République du Congo", "COG"),
		new Pays("République démocratique du Congo", "COD"),
		new Pays("Îles Cook", "COK"),
		new Pays("Costa Rica", "CRC"),
		new Pays("Côte d'Ivoire", "CIV"),
		new Pays("Croatie", "CRO"),
		new Pays("Cuba", "CUB"),
		new Pays("Chypre", "CYP"),
		new Pays("République tchèque", "CZE"),
		new Pays("Danemark", "DEN"),
		new Pays("Djibouti", "DJI"),
		new Pays("Dominique", "DMA"),
		new Pays("République dominicaine", "DOM"),
		new Pays("Équateur", "ECU"),
		new Pays("Égypte", "EGY"),
		new Pays("El Salvador", "ESA"),
		new Pays("Guinée équatoriale", "GNQ"),
		new Pays("Érythrée", "ERI"),
		new Pays("Estonie", "EST"),
		new Pays("Eswatini", "SWZ"),
		new Pays("Éthiopie", "ETH"),
		new Pays("Fidji", "FIJ"),
		new Pays("Finlande", "FIN"),
		new Pays("France", "FRA"),
		new Pays("Gabon", "GAB"),
		new Pays("Gambie", "GAM"),
		new Pays("Géorgie", "GEO"),
		new Pays("Allemagne", "GER"),
		new Pays("Ghana", "GHA"),
		new Pays("Grèce", "GRE"),
		new Pays("Grenade", "GRN"),
		new Pays("Guam", "GUM"),
		new Pays("Guatemala", "GUA"),
		new Pays("Guinée", "GUI"),
		new Pays("Guinée-Bissau", "GBS"),
		new Pays("Guyana", "GUY"),
		new Pays("Haïti", "HAI"),
		new Pays("Honduras", "HON"),
		new Pays("Hongrie", "HUN"),
		new Pays("Islande", "ISL"),
		new Pays("Inde", "IND"),
		new Pays("Indonésie", "INA"),
		new Pays("Iran", "IRI"),
		new Pays("Irak", "IRQ"),
		new Pays("Irlande", "IRL"),
		new Pays("Israël", "ISR"),
		new Pays("Italie", "ITA"),
		new Pays("Jamaïque", "JAM"),
		new Pays("Japon", "JPN"),
		new Pays("Jordanie", "JOR"),
		new Pays("Kazakhstan", "KAZ"),
		new Pays("Kenya", "KEN"),
		new Pays("Kiribati", "KIR"),
		new Pays("Kosovo", "KOS"),
		new Pays("Koweït", "KUW"),
		new Pays("Kirghizistan", "KGZ"),
		new Pays("Laos", "LAO"),
		new Pays("Lettonie", "LAT"),
		new Pays("Liban", "LBN"),
		new Pays("Lesotho", "LES"),
		new Pays("Libéria", "LBR"),
		new Pays("Libye", "LBY"),
		new Pays("Liechtenstein", "LIE"),
		new Pays("Lituanie", "LTU"),
		new Pays("Luxembourg", "LUX"),
		new Pays("Madagascar", "MAD"),
		new Pays("Malawi", "MAW"),
		new Pays("Malaisie", "MAS"),
		new Pays("Maldives", "MDV"),
		new Pays("Mali", "MLI"),
		new Pays("Malte", "MLT"),
		new Pays("Îles Marshall", "MHL"),
		new Pays("Mauritanie", "MTN"),
		new Pays("Maurice", "MRI"),
		new Pays("Mexique", "MEX"),
		new Pays("Micronésie", "FSM"),
		new Pays("Moldavie", "MDA"),
		new Pays("Monaco", "MON"),
		new Pays("Mongolie", "MGL"),
		new Pays("Monténégro", "MNE"),
		new Pays("Maroc", "MAR"),
		new Pays("Mozambique", "MOZ"),
		new Pays("Myanmar", "MYA"),
		new Pays("Namibie", "NAM"),
		new Pays("Nauru", "NRU"),
		new Pays("Népal", "NEP"),
		new Pays("Pays-Bas", "NED"),
		new Pays("Nouvelle-Zélande", "NZL"),
		new Pays("Nicaragua", "NCA"),
		new Pays("Niger", "NIG"),
		new Pays("Nigeria", "NGR"),
		new Pays("Macédoine du Nord", "MKD"),
		new Pays("Norvège", "NOR"),
		new Pays("Oman", "OMA"),
		new Pays("Pakistan", "PAK"),
		new Pays("Palaos", "PLW"),
		new Pays("Palestine", "PLE"),
		new Pays("Panama", "PAN"),
		new Pays("Papouasie-Nouvelle-Guinée", "PNG"),
		new Pays("Paraguay", "PAR"),
		new Pays("Pérou", "PER"),
		new Pays("Philippines", "PHI"),
		new Pays("Pologne", "POL"),
		new Pays("Portugal", "POR"),
		new Pays("Porto Rico", "PUR"),
		new Pays("Qatar", "QAT"),
		new Pays("Roumanie", "ROU"),
		new Pays("Russie", "RUS"),
		new Pays("Rwanda", "RWA"),
		new Pays("Sainte-Lucie", "LCA"),
		new Pays("Samoa", "SAM"),
		new Pays("Saint-Marin", "SMR"),
		new Pays("Sao Tomé-et-Principe", "STP"),
		new Pays("Arabie saoudite", "KSA"),
		new Pays("Sénégal", "SEN"),
		new Pays("Serbie", "SRB"),
		new Pays("Seychelles", "SEY"),
		new Pays("Sierra Leone", "SLE"),
		new Pays("Singapour", "SGP"),
		new Pays("Slovaquie", "SVK"),
		new Pays("Slovénie", "SLO"),
		new Pays("Îles Salomon", "SOL"),
		new Pays("Somalie", "SOM"),
		new Pays("Afrique du Sud", "RSA"),
		new Pays("Corée du Sud", "KOR"),
		new Pays("Soudan du Sud", "SSD"),
		new Pays("Espagne", "ESP"),
		new Pays("Sri Lanka", "SRI"),
		new Pays("Soudan", "SUD"),
		new Pays("Suriname", "SUR"),
		new Pays("Suède", "SWE"),
		new Pays("Suisse", "SUI"),
		new Pays("Syrie", "SYR"),
		new Pays("Taïwan", "TPE"),
		new Pays("Tadjikistan", "TJK"),
		new Pays("Tanzanie", "TAN"),
		new Pays("Thaïlande", "THA"),
		new Pays("Timor oriental", "TLS"),
		new Pays("Togo", "TOG"),
		new Pays("Tonga", "TGA"),
		new Pays("Trinité-et-Tobago", "TTO"),
		new Pays("Tunisie", "TUN"),
		new Pays("Turquie", "TUR"),
		new Pays("Turkménistan", "TKM"),
		new Pays("Tuvalu", "TUV"),
		new Pays("Ouganda", "UGA"),
		new Pays("Ukraine", "UKR"),
		new Pays("Émirats arabes unis", "UAE"),
		new Pays("Royaume-Uni", "GBR"),
		new Pays("États-Unis", "USA"),
		new Pays("Uruguay", "URU"),
		new Pays("Ouzbékistan", "UZB"),
		new Pays("Vanuatu", "VAN"),
		new Pays("Venezuela", "VEN"),
		new Pays("Vietnam", "VIE"),
		new Pays("Îles Vierges des États-Unis", "ISV"),
		new Pays("Yémen", "YEM"),
		new Pays("Zambie", "ZAM"),
		new Pays("Zimbabwe", "ZIM"));

		Collections.addAll(DISCIPLINES, 
		new Discipline("Athletics", "Track and field events including running, jumping, and throwing."),
        new Discipline("Swimming", "Competitive swimming races in a pool."),
        new Discipline("Gymnastics", "Artistic and rhythmic gymnastics events."),
        new Discipline("Cycling", "Track, road, mountain, and BMX cycling events."),
        new Discipline("Rowing", "Competitive rowing races on water."),
        new Discipline("Wrestling", "Freestyle and Greco-Roman wrestling matches."),
        new Discipline("Boxing", "Boxing matches with various weight classes."),
        new Discipline("Judo", "Martial arts competition involving throws and holds."),
        new Discipline("Fencing", "Sword fighting competitions with foil, epee, and sabre."),
        new Discipline("Equestrian", "Horse riding events including dressage, jumping, and eventing."),
        new Discipline("Shooting", "Precision shooting events with rifles and pistols."),
        new Discipline("Archery", "Target archery competition."),
        new Discipline("Badminton", "Racket sport played with a shuttlecock."),
        new Discipline("Basketball", "Team sport where the goal is to score by shooting a ball through a hoop."),
        new Discipline("Handball", "Team sport where the objective is to throw a ball into the opposing team's goal."),
        new Discipline("Volleyball", "Team sport where the goal is to ground the ball on the opponent's court."),
        new Discipline("Tennis", "Racket sport played individually or in doubles on a court."),
        new Discipline("Table Tennis", "Racket sport played on a table divided by a net."),
        new Discipline("Soccer", "Team sport where the goal is to score by getting a ball into the opposing goal."),
        new Discipline("Rugby", "Team sport played with an oval ball which can be kicked, carried, and passed."),
        new Discipline("Weightlifting", "Sport where athletes lift heavy weights."),
        new Discipline("Taekwondo", "Korean martial art competition involving kicks and punches."),
        new Discipline("Canoeing", "Racing on water in a canoe or kayak."),
        new Discipline("Sailing", "Racing boats on water using wind power."),
        new Discipline("Triathlon", "Combination of swimming, cycling, and running."),
        new Discipline("Golf", "Sport where players use clubs to hit a ball into a series of holes on a course."),
        new Discipline("Surfing", "Riding waves on a surfboard."),
        new Discipline("Skateboarding", "Performing tricks and maneuvers on a skateboard."),
        new Discipline("Climbing", "Sport climbing on indoor or outdoor rock walls."),
        new Discipline("Karate", "Martial arts competition involving strikes, kicks, and blocks."),
        new Discipline("Modern Pentathlon", "Combination of fencing, swimming, equestrian, shooting, and running."),
        new Discipline("Hockey", "Field hockey sport played with a ball and sticks."),
        new Discipline("Baseball", "Team sport where the goal is to score runs by hitting a ball and running bases."),
        new Discipline("Softball", "Team sport similar to baseball but played with a larger ball.")
		);


		Ville Paris = new Ville("Paris", 75000);
		Ville Marseille = new Ville("Marseille", 13000);
		Ville Villeneuve = new Ville("Villeneuve-d'Ascq", 59400);
		Ville Chateauroux = new Ville("Châteauroux", 36000);
		Ville Tahiti = new Ville("Tahiti", 98700);
		Ville Bourget = new Ville("Le Bourget", 93350);
		Ville Colombes = new Ville("Colombes", 92700);
		Ville StDenis = new Ville("Saint-Denis", 93200);
		Ville Vaires = new Ville("Vaires-sur-Marne", 77360);
		Ville Nanterre = new Ville("Nanterre", 92000);
		Ville Villepinte = new Ville("Villepinte", 93420);
		Ville Versailles = new Ville("Versailles", 78000);
		Ville Elancourt = new Ville("Élancourt", 78990);
		Ville SQY = new Ville("Saint-Quentin-en-Yvelines", 78180);
		Ville Guyancourt = new Ville("Guyancourt", 78286);
		Ville Bordeaux = new Ville("Bordeaux", 33000);
		Ville Nantes  = new Ville("Nantes", 44000);
		Ville Lyon = new Ville("Lyon", 69000);
		Ville StEtienne = new Ville("Saint-Etienne", 42100);
		Ville Nice = new Ville("Nice", 06000);

		Collections.addAll(VILLES, Paris, Marseille, Villeneuve,
							Chateauroux, Tahiti, Bourget, Colombes, StDenis,
							Vaires, Nanterre, Villepinte, Versailles,
							Elancourt, SQY, Guyancourt, Bordeaux, Nantes,
							StEtienne, Lyon, Nice);

		Collections.addAll(LIEUX,
		new Lieu("Arena Bercy", Paris),
		new Lieu("Arena Champ-de-Mars", Paris),
		new Lieu("Arena Paris Nord", Paris),
		new Lieu("Arena Paris Sud", Paris),
		new Lieu("Arena Porte de La Chapelle", Paris),
		new Lieu("Centre Aquatique", Paris),
		new Lieu("Centre National de Tir de Châteauroux", Chateauroux),
		new Lieu("Château de Versailles", Versailles),
		new Lieu("Colline d'Elancourt", Elancourt),
		new Lieu("Grand Palais", Paris),
		new Lieu("Hôtel de Ville", Paris),
		new Lieu("Invalides", Paris),
		new Lieu("La Concorde", Paris),
		new Lieu("Golf National", Guyancourt),
		new Lieu("Marina de Marseille", Paris),
		new Lieu("Parc des Princes", Paris),
		new Lieu("La Défense Arena", Paris),
		new Lieu("Pont Alexandre III", Paris),
		new Lieu("Site d'escalade Bourget", Bourget),
		new Lieu("Concorde", SQY),
		new Lieu("Stade de Bordeaux", Bordeaux),
		new Lieu("Stade de France", StDenis),
		new Lieu("Stade de la Beaujoire", Nantes),
		new Lieu("Stade de Lyon", Lyon),
		new Lieu("Stade de Marseille", Marseille),
		new Lieu("Stade de Nice", Nice),
		new Lieu("Stade Geoffroy-Guichard", StEtienne),
		new Lieu("Stade Nautique de Vaires-sur-Marne", Vaires),
		new Lieu("Stade Pierre Mauroy", Villeneuve),
		new Lieu("Stade Roland-Garros", Paris),
		new Lieu("Stade Tour Eiffel", Paris),
		new Lieu("Stade Yves-du-Manoir", Colombes),
		new Lieu("Teahupo'o", Tahiti),
		new Lieu("Trocadéro", Paris),
		new Lieu("Vélodrome National", SQY)
		);
	}

}