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
        return personne.getFirstName();
    }

    @Override
    public boolean wasBorn(GregorianCalendar gregorianCalendar) {
        //TODO Personne ne possède pas cette méthode
        return true;
    }

    @Override
    public int getAge(GregorianCalendar gregorianCalendar) {
        return personne.getAge(gregorianCalendar);
    }
}
