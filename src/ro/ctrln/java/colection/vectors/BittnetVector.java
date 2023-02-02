package ro.ctrln.java.colection.vectors;

import java.util.Arrays;
import java.util.Stack;
import java.util.Vector;

public class BittnetVector {
    public static void main(String[] args) {
        Vector<String> vector =new Stack<>();

        vector.add("One");
        vector.add("Two");
        vector.add("Three");
        vector.add("Five");
        vector.add("Six");
        vector.add("Seven");
        vector.add("Eight");
        vector.add("Nine");
        vector.add("Ten");
        vector.add("Eleven");
        vector.add("Twelve");

        System.out.println("elementul de pozitia 0 este: " + vector.get(0));
        System.out.println("Marimea vectorului este: " + vector.size());
        System.out.println("Capacitatea vectorului este: " + vector.capacity());
        System.out.println("Ce se intimpla cu capacitatea dupa stergere: " + vector.removeAll(Arrays.asList("Three","Four","Five")));
        System.out.println("Capacitatea vectorului este: " + vector.capacity());
        System.out.println("Marimea vectorului este: " + vector.size());


    }
}
