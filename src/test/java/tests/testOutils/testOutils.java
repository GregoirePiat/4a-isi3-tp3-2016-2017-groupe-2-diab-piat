package tests.testOutils;
import static org.assertj.core.api.Java6Assertions.assertThat;
import static org.mockito.Mockito.*;


import Outils.OutilsPerson;
import org.junit.Assert;
import org.junit.Test;
import persons.IPerson;
import persons.Person;
import tests.PersonTest;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

public class testOutils {
    @Test
    public void testOutils() {

        List<IPerson> list = new ArrayList<>();

        Person jeanLuc = new Person("jean-luc", "lastname", 2000, 10, 10);
        list.add(jeanLuc);
        Person jeanAlbert = new Person("jean-albert", "lastname", 2010, 10, 10);
        list.add(jeanAlbert);
        Person jeanMichel = new Person("jean-michel", "lastname", 2020, 10, 10);
        list.add(jeanMichel);
        Person jeanPatick = new Person("jean-patrick", "lastname", 2030, 10, 10);
        list.add(jeanPatick);

        GregorianCalendar date2040 = new GregorianCalendar(2040, 10, 10);

        List<IPerson> listSortie = OutilsPerson.getPersonsOnRange(list, date2040, 30, 40);

        //MOCK
        List<IPerson> mockedList = mock(List.class);
        // TODO remplacer avec les 2 lignes ci-dessous (voir cours)
        //Person mo = mock(Person.class);
        //when(mo.getAge(null)).thenReturn(30);
        for (IPerson jeanEude : listSortie) {
            mockedList.add(jeanEude);
        }

        verify(mockedList, times(0)).add(jeanMichel);
        verify(mockedList, times(0)).add(jeanPatick);
        verify(mockedList, times(1)).add(jeanAlbert);
        verify(mockedList, times(1)).add(jeanLuc);

        List<Integer> mockedInt = mock(List.class);
        mockedInt.add(OutilsPerson.getMaxAge(list, date2040));
        verify(mockedInt, times(1)).add(40);
    }

}
