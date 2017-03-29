package tests;

import org.junit.Before;
import org.junit.Test;

public class PeopleTest
{
    private PersonTest personneTest;

    @Before
    public void initialize() {
        this.setPersonneTest(new PersonTest());
    }

    @Test
    public void testGetAge() {
        this.getPersonneTest().testGetAge();

    }

    @Test
    public void testWasBorn() {
        this.getPersonneTest().testWasBorn();
    }

    public PersonTest getPersonneTest() {
        return personneTest;
    }

    public void setPersonneTest(PersonTest personneTest) {
        this.personneTest = personneTest;
    }
}
