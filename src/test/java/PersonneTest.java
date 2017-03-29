import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import persons.Person;

import java.util.GregorianCalendar;

public class PersonneTest {

	private Person person2000;

	@Test
	public void testGetAge() {
		GregorianCalendar date2010 = new GregorianCalendar(2010, 01, 01);
		GregorianCalendar date2000Janv = new GregorianCalendar(2000, 01, 01);
		GregorianCalendar date2000Dec = new GregorianCalendar(2000, 01, 12);
		GregorianCalendar date1990 = new GregorianCalendar(1990, 01, 01);


		//Premier constructeur - permet de run directement la classe sans erreur
		if (this.getPerson2000() == null)
		 	this.setPerson2000(new Person("lastname", "firstname", 2000, 01, 01));

		// 10 ans après sa naissance
		assertThat(getPerson2000().getAge(date2010)).isEqualTo(10);

		// A sa naissance - début année
		assertThat(getPerson2000().getAge(date2000Janv)).isEqualTo(0);

		// A sa naissance - fin année
		assertThat(getPerson2000().getAge(date2000Dec)).isEqualTo(0);

		// 10 ans avant sa naissance
		try {
			assertThat(getPerson2000().getAge(date1990)).isEqualTo(0);
		}
		catch (IllegalArgumentException e) {
			assertThat(e.getMessage()).isNotEmpty();
		}
	}

	@Test
	public void testWasBorn() {
		GregorianCalendar date2010 = new GregorianCalendar(2010, 01, 01);
		GregorianCalendar date2000Janv = new GregorianCalendar(2000, 01, 01);
		GregorianCalendar date2000Dec = new GregorianCalendar(2000, 01, 12);
		GregorianCalendar date1990 = new GregorianCalendar(1990, 01, 01);


		//Premier constructeur - permet de run directement la classe sans erreur
		if (this.getPerson2000() == null)
			this.setPerson2000(new Person("lastname", "firstname", 2000, 01, 01));

		// 10 ans après sa naissance
		assertThat(person2000.wasBorn(date2010)).isTrue();

		// A sa naissance - début année
		assertThat(person2000.wasBorn(date2000Janv)).isTrue();

		// A sa naissance - fin année
		assertThat(person2000.wasBorn(date2000Dec)).isTrue();

		// 10 ans avant sa naissance
		assertThat(person2000.wasBorn(date1990)).isFalse();
	}

	public Person getPerson2000() {
		return person2000;
	}

	public void setPerson2000(Person person2000) {
		this.person2000 = person2000;
	}
}
