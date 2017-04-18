package tests.testOutils;
import static org.assertj.core.api.Java6Assertions.assertThat;
import static org.mockito.Mockito.*;


import outils.OutilsPerson;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import persons.IPerson;
import persons.Person;

import java.util.ArrayList;
import java.util.List;

public class testOutils {
    private static final List<IPerson> PERSONS = new ArrayList<IPerson>();

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Before
    /**
     * Initialisation d'une liste contenant 4 Mocks personne
     */
    public void initPersons() {

        PERSONS.clear();

        final Person jeanMichel = mock(Person.class);
        // Spécification de la valeur de retour attendue pour getAge() sur l'objet jeanMichel
        when(jeanMichel.getAge(anyObject())).thenReturn(0);

        final Person JeanEude = mock(Person.class);
        when(JeanEude.getAge(anyObject())).thenReturn(10);

        final Person JeanPatrick = mock(Person.class);
        when(JeanPatrick.getAge(anyObject())).thenReturn(20);

        final Person JeanJean = mock(Person.class);
        when(JeanJean.getAge(anyObject())).thenReturn(30);

        PERSONS.add(jeanMichel);
        PERSONS.add(JeanEude);
        PERSONS.add(JeanPatrick);
        PERSONS.add(JeanJean);
    }

    @Test
    /**
     * Vérifie getPersonOnRange() entre 0 et 10 ans
     */
    public void testGetPersonsOnRangeValid() {
        assertThat(OutilsPerson.getPersonsOnRange(PERSONS, null, 0, 10).size()).isEqualTo(2);
        checkPersons();
    }

    @Test
    /**
     * Vérifie getPersonOnRange() entre 10 et 0 ans
     */
    public void testGetPersonsOnRangeInvalid() {
        this.expectedException.expect(IllegalArgumentException.class);
        OutilsPerson.getPersonsOnRange(PERSONS, null, 10, 0);
        checkPersons();
    }

    @Test
    /**
     * Vérifie l'age max de la liste de personnes (30 est attendu)
     */
    public void testGetMaxAgeValid() {
        assertThat(OutilsPerson.getMaxAge(PERSONS, null)).isEqualTo(30);
        checkPersons();
    }

    @Test
    /**
     * Vérifie l'age max de la liste de personnes si la liste est vide (-1 est attendu par défaut)
     */
    public void testGetMaxAgeInvalid() {
        PERSONS.clear();
        assertThat(OutilsPerson.getMaxAge(PERSONS, null)).isEqualTo(-1);
        checkPersons();
    }

    /**
     * Réponse à la question 10
     */
    private void checkPersons() {
        for (IPerson person : PERSONS) {
            // Vérifie que l'age de la personne est lu au moins une fois
            verify(person, atLeastOnce()).getAge(anyObject());
            // Vérifie que le prénom de la personne n'est jamais lu
            verify(person, never()).getFirstName();
            // Vérifie que le nom de la personne n'est jamais lu
            verify(person, never()).getName();
        }
    }
}
