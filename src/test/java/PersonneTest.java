import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import persons.Person;

import java.util.GregorianCalendar;

public class PersonneTest {

	@Test
	public void test() {
		GregorianCalendar date2010 = new GregorianCalendar(2010, 01, 01);
		GregorianCalendar date2000Janv = new GregorianCalendar(2000, 01, 01);
		GregorianCalendar date2000Dec = new GregorianCalendar(2000, 01, 12);
		GregorianCalendar date1990 = new GregorianCalendar(1990, 01, 01);


		//Premier constructeur
		Person person2000 = new Person("lastname", "firstname", 2000, 01, 01);

		// 10 ans après sa naissance
		assertThat(person2000.getAge(date2010)).isEqualTo(10);
		assertThat(person2000.wasBorn(date2010)).isTrue();

		// A sa naissance - début année
		assertThat(person2000.getAge(date2000Janv)).isEqualTo(0);
		assertThat(person2000.wasBorn(date2000Janv)).isTrue();

		// A sa naissance - fin année
		assertThat(person2000.getAge(date2000Dec)).isEqualTo(0);
		assertThat(person2000.wasBorn(date2000Dec)).isTrue();

		// 10 ans avant sa naissance
		// assertThat(person2000.getAge(date1990)).isEqualTo(0); - la méthode lance une exception
		assertThat(person2000.wasBorn(date1990)).isFalse();


		// deuxième contructeur
		person2000 = new Person("lastname", "firstname", date2000Janv);

		// 10 ans après sa naissance
		assertThat(person2000.getAge(date2010)).isEqualTo(10);
		assertThat(person2000.wasBorn(date2010)).isTrue();

		// A sa naissance - début année
		assertThat(person2000.getAge(date2000Janv)).isEqualTo(0);
		assertThat(person2000.wasBorn(date2000Janv)).isTrue();

		// A sa naissance - fin année
		assertThat(person2000.getAge(date2000Dec)).isEqualTo(0);
		assertThat(person2000.wasBorn(date2000Dec)).isTrue();

		// 10 ans avant sa naissance
		// assertThat(person2000.getAge(date1990)).isEqualTo(0); - la méthode lance une exception
		assertThat(person2000.wasBorn(date1990)).isFalse();
	}
}
