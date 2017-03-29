package Adapter;

import people.Personne;
import persons.IPerson;
import java.util.GregorianCalendar;

public class PersonneAdapter implements IPerson {

    private Personne personne;

    public PersonneAdapter (String var1, String var2, int var3, int var4, int var5) {
        this.personne = new Personne(var1, var2, var3, var4, var5);
    }

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
