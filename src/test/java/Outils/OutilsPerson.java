package Outils;

import persons.IPerson;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

public class OutilsPerson {

    public List<IPerson> getPersonsOnRange(List<IPerson> persons, GregorianCalendar date, int minAge, int maxAge){

        List<IPerson> personsOnRange = new ArrayList<>();

        for (IPerson person : persons){
            if (person.getAge(date) >= minAge && person.getAge(date) <= maxAge)
                personsOnRange.add(person);
        }

        return personsOnRange;
    }


    public int maxAge(List<IPerson> persons, GregorianCalendar date){

        int maxAge = -1;

        for (IPerson person : persons){
            if (person.getAge(date) > maxAge)
                maxAge = person.getAge(date);
        }

        return maxAge;
    }

}
