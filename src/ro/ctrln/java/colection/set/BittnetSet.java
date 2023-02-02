package ro.ctrln.java.colection.set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class BittnetSet {

    public static void main(String[] args) {

        Set<String> strings = new HashSet<>();
        HashSet<Integer> integers = new HashSet<>();

        strings.add("One");
        strings.add("Two");
        strings.add("Three");
        strings.add("One");
        System.out.println("strings: " + strings);

        integers.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 1));
        System.out.println("integers: " + integers);

        System.out.format("Marimea setului strings este: %d", strings.size());
        System.out.println("Marimea setului strings este: " + strings.size());

        System.out.println("Stergerea unui element dintr-un set! " + strings.remove("Two") + strings);

        System.out.println("Stergera unei colectii!" + integers.removeAll(Arrays.asList(4,5,6))+integers);

        System.out.format("Exista 3 in integerul nostru? %b\n", integers.contains(3));

        integers.clear();
        System.out.format("Este strings gol? %b\n ",  integers.isEmpty());
    }
}
