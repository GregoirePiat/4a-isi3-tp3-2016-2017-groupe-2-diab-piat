package outils;

import persons.IPerson;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

public class OutilsPerson {

    public static List<IPerson> getPersonsOnRange(List<IPerson> persons, GregorianCalendar date, int minAge, int maxAge) throws IllegalArgumentException{

        if (minAge > maxAge)
            throw new IllegalArgumentException();

        List<IPerson> personsOnRange = new ArrayList<>();

        if (persons.size() == 0)
            return new ArrayList<>();

        for (IPerson person : persons){
            if (person.getAge(date) >= minAge && person.getAge(date) <= maxAge)
                personsOnRange.add(person);
        }

        return personsOnRange;
    }


    public static int getMaxAge(List<IPerson> persons, GregorianCalendar date){

        int maxAge = -1;

        if (persons.size() == 0)
            return -1;

        for (IPerson person : persons){
            if (person.getAge(date) > maxAge)
                maxAge = person.getAge(date);
        }

        return maxAge;
    }

}
