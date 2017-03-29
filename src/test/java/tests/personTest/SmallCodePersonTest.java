package tests.personTest;

import org.junit.Before;
import org.junit.Test;
import people.SmallCodePerson;
import tests.PeopleTest;

public class SmallCodePersonTest extends PeopleTest {

    @Before
    public void initialize() {
        super.initialize();
        getPersonneTest().setPerson(new SmallCodePerson("Lastname", "Firstname", 2000, 01, 01));
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
