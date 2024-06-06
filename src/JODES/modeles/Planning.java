package JODES.modeles;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.WeekFields;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Locale;

import JODES.JO2024;

public class Planning {

    protected int numSemaine;
    protected ArrayList<LocalDate> days = new ArrayList<>();
    protected ArrayList<Session> sessions = new ArrayList<>();

    // ----------- Constructors -----------

    public Planning(LocalDate date) {
        this.numSemaine = getNumSemaineFromDate(date);
        initializeDaysOfWeek();
    }

    // ----------- Getters & setters -----------
    
    public int getNumSemaine() {
        return numSemaine;
    }

    public void setNumSemaine(int numSemaine) {
        this.numSemaine = numSemaine;
    }

    public ArrayList<LocalDate> getDays() {
        return days;
    }

    public void setDays(ArrayList<LocalDate> days) {
        this.days = days;
    }

    public ArrayList<Session> getSessions() {
        return sessions;
    }

    public void setSessions(ArrayList<Session> sessions) {
        this.sessions = sessions;
    }

    // ----------- Methods -----------

    public int getNumSemaineFromDate(LocalDate d) {
        // from StackOverflow
        return d.get(WeekFields.of(Locale.getDefault()).weekOfWeekBasedYear());
    }

    public void getSessionsFromDataBase(int numSemaine) {
        for (Entite e : JO2024.sesEntites)
        {
            if (DataParser.isSession(e))
            {
                Session s = (Session) e;
                int numSemaineSession = getNumSemaineFromDate(s.getDate());
                if (numSemaineSession == this.numSemaine)
                {
                    this.sessions.add(s);
                }
            }
        }
    }

    public void initializeDaysOfWeek() {
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.WEEK_OF_YEAR, this.numSemaine);
        cal.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);

        this.days.add(cal.getFirstDayOfWeek());

    }
    
}
