package tests;

import org.junit.Before;
import org.junit.Test;
import people.*;
import persons.IPerson;

import java.util.ArrayList;
import java.util.List;

public class PeopleTest
{
    private PersonneTest personneTest;

    @Before
    public void initialize() {
        this.setPersonneTest(new PersonneTest());
    }

    @Test
    public void testGetAge() {
        this.getPersonneTest().testGetAge();

    }

    @Test
    public void testWasBorn() {
        this.getPersonneTest().testWasBorn();
    }

    public PersonneTest getPersonneTest() {
        return personneTest;
    }

    public void setPersonneTest(PersonneTest personneTest) {
        this.personneTest = personneTest;
    }
}
