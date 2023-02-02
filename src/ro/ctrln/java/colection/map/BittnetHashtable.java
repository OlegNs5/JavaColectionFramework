package ro.ctrln.java.colection.map;

import ro.ctrln.java.colection.model.Person;

import java.util.Hashtable;

public class BittnetHashtable {
    public static void main(String[] args) {
        Hashtable<Person,String> personHashtable = new Hashtable<>();

        personHashtable.put(new Person("AnaMaria", "Chirtoaca",26,"Engineer"), "One"+"\n");
        personHashtable.put(new Person("Ada", "Lovelace",23,"Web Developer"), "Two");//valorile nu pot fi dublicate (la fel ca in HashMap)
        personHashtable.put(new Person("Ada", "Lovelace",23,"Web Developer"), "Three");
        //personHashtable.put(new Person(), null); // null arunca exceptia NullPointerException

        System.out.println(personHashtable);
        System.out.println(personHashtable.get(new Person("Ada", "Lovelace",23,"Web Developer")));

    }
}
