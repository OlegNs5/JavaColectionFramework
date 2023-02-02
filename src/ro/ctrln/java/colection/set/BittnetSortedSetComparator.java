package ro.ctrln.java.colection.set;

import ro.ctrln.java.colection.model.Person;

import java.util.Comparator;
import java.util.TreeSet;

public class BittnetSortedSetComparator {
    public static void main(String[] args) {
        TreeSet<Person> personTreeSet = new TreeSet<>(new Comparator<Person>() {
            @Override
            public int compare(Person personOne, Person personTwo) {
                return personOne.getAge().compareTo(personTwo.getAge());
            }
        });
        personTreeSet.add(new Person("Joe","Dumas",23,"Ingeneer"));
        personTreeSet.add(new Person("Luisa","Muler",20,"Java Developer"));
        personTreeSet.add(new Person("Luciano","Celentano",59,"Cintaret"));
        System.out.println("personTreeSet: " + personTreeSet);
    }
}
