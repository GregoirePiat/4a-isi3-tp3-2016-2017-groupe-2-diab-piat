package tests.personTest;

import org.junit.Before;
import org.junit.Test;
import people.EfficientPerson;
import tests.PeopleTest;
import tests.PersonneTest;

public class EfficientPersonTest extends PeopleTest {


    @Before public void initialize() {

        getPersonneTest().setPerson(new EfficientPerson("Lastname", "Firstname", 10));
    }

    @Test
    public void testGetAge() {

    }

    @Test
    public void testWasBorn() {

    }
}
