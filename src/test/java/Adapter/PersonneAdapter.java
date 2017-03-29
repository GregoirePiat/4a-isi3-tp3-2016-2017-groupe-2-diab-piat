package Adapter;

import people.Personne;
import persons.IPerson;

import java.util.GregorianCalendar;


public class PersonneAdapter implements IPerson {

    private Personne personne;


    @Override
    public String getName() {
        return personne.getName();
    }

    @Override
    public String getFirstName() {
        return null;
    }

    @Override
    public boolean wasBorn(GregorianCalendar gregorianCalendar) {
        return false;
    }

    @Override
    public int getAge(GregorianCalendar gregorianCalendar) {
        return 0;
    }
}
