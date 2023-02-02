package ro.ctrln.java.colection.set;

import ro.ctrln.java.colection.model.Person;
import ro.ctrln.java.colection.model.PersonComparable;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class BittnetSortedSet {
    public static void main(String[] args) {

        SortedSet<String> strings = new TreeSet<>(); //SortedSet le pune in ordinea lexicografica (adica: a,b,c,d,...);

        strings.add("One");
        strings.add("Two");
        strings.add("Three");
        strings.add("Four");
        System.out.println("strings: " + strings);

        SortedSet<PersonComparable> persons = new TreeSet<>();

        persons.add(new PersonComparable("Caleb","Macarici",4,"Gradinita"));
        persons.add(new PersonComparable("Relly","Macarici",36,"Pensionara"));
        persons.add(new PersonComparable("Lucian","Dinus",22,"Facultate"));
        System.out.println("persons: "+persons);

        Set<Person> personSet = new HashSet<>();

        personSet.add(new Person("Caleb","Macarici",4,"Gradinita"));
        System.out.println("personSet: " + personSet);
    }
}
