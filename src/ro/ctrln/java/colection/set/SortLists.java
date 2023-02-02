package ro.ctrln.java.colection.set;

import ro.ctrln.java.colection.model.Person;
import ro.ctrln.java.colection.model.PersonComparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SortLists {
    public static void main(String[] args) {

        ArrayList<PersonComparable> personComparables = new ArrayList<>();
        personComparables.add(new PersonComparable("Joe", "Dumas", 23, "Ingeneer"));
        personComparables.add(new PersonComparable("Luisa", "Muler", 20, "Java Developer"));
        personComparables.add(new PersonComparable("Luciano", "Celentano", 59, "Cintaret"));
        //System.out.println("Array list inainte de ordonare: " + personComparables);

        Collections.sort(personComparables);
        //System.out.println("Array list dupa ordonare: " + personComparables);

        ArrayList<Person> persons = new ArrayList<>();
        persons.add(new Person("Joe", "Dumas", 23, "Ingeneer"));
        persons.add(new Person("Luisa", "Muler", 20, "Java Developer"));
        persons.add(new Person("Luciano", "Celentano", 59, "Cintaret"));
        System.out.println("Array list persons inainte de ordonare: " + persons);

        Collections.sort(persons, new Comparator<Person>() {
            @Override
            public int compare(Person personOne, Person personTwo) {
                return personOne.getAge().compareTo(personTwo.getAge());
            }
        });
        System.out.println("Array list persons dupa ordonare: " + persons);
    }
}
