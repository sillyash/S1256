package JODES.modeles;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.WeekFields;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;

import JODES.JO2024;

public class Planning {

    protected int numSemaine;
    protected ArrayList<List<LocalTime>> days = new ArrayList<>();

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

    public ArrayList<List<LocalTime>> getDays() {
        return days;
    }

    public void setDays(ArrayList<List<LocalTime>> days) {
        this.days = days;
    }

    public List<LocalTime> getDay(int dayNum) {
        if (dayNum < 0 || dayNum > 6) return new List<LocalTime>();
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
        WeekFields week = WeekFields.of(Locale.FRANCE);
        LocaleDate date;
        this.days.
    }
    
}
