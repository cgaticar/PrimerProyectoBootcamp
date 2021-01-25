package Clase2;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Fecha {
    GregorianCalendar timestamp = new GregorianCalendar();
    GregorianCalendar tomorrow = new GregorianCalendar();

    public Fecha(){};

    public Fecha(int year, int month, int dayOfMonth, int hours, int minutes, int seconds)
    {
        timestamp.set(year, month, dayOfMonth, hours, minutes, seconds);
    }

    public Fecha(int year, int month, int dayOfMonth)
    {
        timestamp.set(year, month, dayOfMonth);
    }

    public GregorianCalendar getTimestamp()
    {
        return timestamp;
    }

    public void addDay()
    {
        timestamp.add(Calendar.HOUR, 24);
    }

    public void setTomorrow()
    {
        tomorrow.add(Calendar.HOUR, 24);
    }

    public GregorianCalendar getTomorrow()
    {
        return tomorrow;
    }

    public String showTomorrow()
    {
        if(checkDate(tomorrow))
        {
            setTomorrow();
        }
        return "Tomorrow: " + tomorrow.getTime();
    }

    public boolean checkDate(GregorianCalendar date)
    {
        if(date.equals(timestamp)) return true;
        else return false;
    }

    @Override
    public String toString() {
        return "Fecha: " + timestamp.getTime();
    }

}
