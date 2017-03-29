package tests;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import persons.IPerson;
import persons.Person;

import java.util.GregorianCalendar;

public class PersonTest {

	private IPerson person;

	@Test
	public void testGetAge() {
		GregorianCalendar date2010 = new GregorianCalendar(2010, 0, 1);
		GregorianCalendar date2000Janv = new GregorianCalendar(2000, 0, 1);
		GregorianCalendar date2000Dec = new GregorianCalendar(2000, 11, 2);
		GregorianCalendar date1990 = new GregorianCalendar(1990, 0, 1);


		//Premier constructeur - permet de run directement la classe sans erreur
		if (this.getPerson() == null)
		 	this.setPerson(new Person("lastname", "firstname", 2000, 01, 01));

		// 10 ans après sa naissance
		assertThat(getPerson().getAge(date2010)).isEqualTo(10);

		// A sa naissance - début année
		assertThat(getPerson().getAge(date2000Janv)).isEqualTo(0);

		// A sa naissance - fin année
		assertThat(getPerson().getAge(date2000Dec)).isEqualTo(0);

		// 10 ans avant sa naissance
		try {
			assertThat(getPerson().getAge(date1990)).isEqualTo(0);
		}
		catch (IllegalArgumentException e) {
			assertThat(e.getMessage()).isNotEmpty();
		}
	}

	@Test
	public void testWasBorn() {
		GregorianCalendar date2010 = new GregorianCalendar(2010, 0, 1);
		GregorianCalendar date2000Janv = new GregorianCalendar(2000, 0, 1);
		GregorianCalendar date2000Dec = new GregorianCalendar(2000, 0, 12);
		GregorianCalendar date1990 = new GregorianCalendar(1990, 0, 1);
		GregorianCalendar date0 = new GregorianCalendar(0, 0, 0);


		//Premier constructeur - permet de run directement la classe sans erreur
		if (this.getPerson() == null)
			this.setPerson(new Person("lastname", "firstname", 2000, 1, 1));

		// 10 ans après sa naissance
		assertThat(person.wasBorn(date2010)).isTrue();

		// A sa naissance - début année
		assertThat(person.wasBorn(date2000Janv)).isTrue();

		// A sa naissance - fin année
		assertThat(person.wasBorn(date2000Dec)).isTrue();

		// 10 ans avant sa naissance
		assertThat(person.wasBorn(date1990)).isFalse();
	}

	public IPerson getPerson() {
		return person;
	}

	public void setPerson(IPerson person) {
		this.person = person;
	}
}
