package tests;

import org.junit.Test;
import people.*;
import persons.IPerson;

import java.util.ArrayList;
import java.util.List;

public class PeopleTest
{
    private PersonneTest personneTest;

    @Test
    public void testGetAge() {

        new OneMorePerson("Lastname", "Firstname", 2000, 01, 01);
        new SimplePerson("Lastname", "Firstname", 2000, 01, 01);
        new SmallCodePerson("Lastname", "Firstname", 2000, 01, 01);
        new YetAnotherPerson("Lastname", "Firstname", 2000, 01, 01);

        personneTest = new PersonneTest();

    }

    @Test
    public void testWasBorn() {
        List<IPerson> persons = new ArrayList<>();

        persons.add(new EfficientPerson("Lastname", "Firstname", 10));
        persons.add(new OneMorePerson("Lastname", "Firstname", 2000, 01, 01));
        persons.add(new SimplePerson("Lastname", "Firstname", 2000, 01, 01));
        persons.add(new SmallCodePerson("Lastname", "Firstname", 2000, 01, 01));
        persons.add(new YetAnotherPerson("Lastname", "Firstname", 2000, 01, 01));

        personneTest = new PersonneTest();

        for (IPerson person : persons){
            personneTest.setPerson(person);
            personneTest.testWasBorn();
        }
    }

    public PersonneTest getPersonneTest() {
        return personneTest;
    }

    public void setPersonneTest(PersonneTest personneTest) {
        this.personneTest = personneTest;
    }
}
