package tests.personTest;

import org.junit.Before;
import org.junit.Test;
import people.EfficientPerson;
import people.OneMorePerson;
import tests.PeopleTest;

public class OneMorePersonTest extends PeopleTest{

    @Before
    public void initialize() {
        super.initialize();
        getPersonneTest().setPerson(new OneMorePerson("Lastname", "Firstname", 2000, 01, 01));
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
