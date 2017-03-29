package tests.personTest;

import org.junit.Before;
import org.junit.Test;
import people.EfficientPerson;
import tests.PeopleTest;

public class EfficientPersonTest extends PeopleTest {


    @Before public void initialize() {
        super.initialize();
        getPersonneTest().setPerson(new EfficientPerson("Lastname", "Firstname", 10));
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
