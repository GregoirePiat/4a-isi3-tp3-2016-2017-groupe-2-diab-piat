package adapter;

import people.Personne;
import persons.IPerson;
import java.util.GregorianCalendar;

public class PersonneAdapter extends Personne implements IPerson {

    public PersonneAdapter (String var1, String var2, int var3, int var4, int var5) {
        super(var1, var2, var3, var4, var5);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getFirstName() {
        return super.getFirstName();
    }

    @Override
    public boolean wasBorn(GregorianCalendar gregorianCalendar) {
        return gregorianCalendar.before(super.dateNaissance);
    }

    @Override
    public int getAge(GregorianCalendar gregorianCalendar) {
        return super.getAge(gregorianCalendar);
    }
}
