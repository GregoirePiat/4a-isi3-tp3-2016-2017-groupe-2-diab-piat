package tests.personTest;

import Adapter.PersonneAdapter;
import org.junit.Before;
import org.junit.Test;
import people.EfficientPerson;
import tests.PeopleTest;

public class PersonneTest extends PeopleTest {


    @Before public void initialize() {
        super.initialize();
        getPersonneTest().setPerson(new PersonneAdapter("Lastname", "Firstname", 2000, 1, 1));
    }

    @Test
    public void testGetAge() {
        super.testGetAge();
    }

    @Test
    public void testWasBorn() {
        super.testWasBorn();
    }
}
