package tests.personTest;

import org.junit.Before;
import org.junit.Test;
import people.SimplePerson;
import tests.PeopleTest;

public class SimplePersonTest extends PeopleTest {
    @Before
    public void initialize() {
        super.initialize();
        getPersonneTest().setPerson(new SimplePerson("Lastname", "Firstname", 2000, 01, 01));
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
