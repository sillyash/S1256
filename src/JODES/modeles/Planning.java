/*
 * 
 */
package JODES.modeles;
import java.time.LocalDate;
import java.time.temporal.WeekFields;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import JODES.JO2024;


/**
 * The Class Planning.
 *
 * @author Ash Merienne and Emma Escoffier
 */
public class Planning {

    /** The num semaine. */
    protected int numSemaine;
    
    /** The sessions. */
    protected List<List<Session>> sessions = new ArrayList<List<Session>>();
    
    /** The days. */
    protected ArrayList<LocalDate> days = new ArrayList<>();
    
    /** The year. */
    protected int year;
    
    /** The month. */
    protected int month;
    
    /** The day. */
    protected int day;

    // ----------- Constructors -----------

    /**
     * Instantiates a new planning.
     *
     * @param date the date
     */
    public Planning(LocalDate date) {
        this.numSemaine = getNumSemaineFromDate(date);
        this.year = date.getYear();
        this.month = date.getMonthValue();
        this.day = date.getDayOfMonth();
        initializeDaysOfWeek();
        getSessionsFromDataBase(this.numSemaine);
    }

    // ----------- Getters & setters -----------
    
    
    /**
     * Gets the num semaine from date.
     *
     * @param d the d
     * @return the num semaine from date
     */
    public int getNumSemaineFromDate(LocalDate d) {
        // from StackOverflow
        return d.get(WeekFields.of(Locale.getDefault()).weekOfWeekBasedYear());
    }

    /**
     * Gets the num semaine.
     *
     * @return the num semaine
     */
    public int getNumSemaine() {
        return numSemaine;
    }

    /**
     * Gets the sessions.
     *
     * @return the sessions
     */
    public List<List<Session>> getSessions() {
        return sessions;
    }

    /**
     * Gets the days.
     *
     * @return the days
     */
    public ArrayList<LocalDate> getDays() {
        return days;
    }

    /**
     * Gets the year.
     *
     * @return the year
     */
    public int getYear() {
        return year;
    }

    /**
     * Gets the month.
     *
     * @return the month
     */
    public int getMonth() {
        return month;
    }

    /**
     * Gets the day.
     *
     * @return the day
     */
    public int getDay() {
        return day;
    }

    // ----------- Methods -----------

    /**
     * Gets the sessions from data base.
     *
     * @param numSemaine the num semaine
     * @return the sessions from data base
     */
    public void getSessionsFromDataBase(int numSemaine) {
        for (Entite e : JO2024.sesEntites)
        {
            if (DataParser.isSession(e))
            {
                Session s = (Session) e;
                int numSemaineSession = getNumSemaineFromDate(s.getDate());
                if (numSemaineSession == this.numSemaine)
                {
                    this.sessions.get(0).add(s);
                }
            }
        }
    }

    /**
     * Initialize days of week.
     */
    public void initializeDaysOfWeek() {
        WeekFields week = WeekFields.of(Locale.FRANCE);
        for (int i=0; i<7; i++)
        {
            LocalDate date = LocalDate.of(year, month, day)
            .with(week.weekOfYear(), numSemaine)
            .with(week.dayOfWeek(), i+1);
            this.days.add(date);

            this.sessions.add(new ArrayList<Session>());
        }
    }

}
