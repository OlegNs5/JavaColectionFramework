package ro.ctrln.java.colection.queue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class BittnetQueue {
    public static void main(String[] args) {

        Queue<String> queue = new LinkedList<>();
        queue.add("One");
        queue.add("Two");
        queue.add("Three");
        queue.add("Four");

        System.out.println(queue);

        queue.remove("Operators");
        System.out.println(queue);

        queue.addAll(Arrays.asList("Six", "Seven"));
        System.out.println(queue);
        queue.removeAll(Arrays.asList("One", "Five"));
        System.out.println(queue);
        //Operatiuni aditionale pentru adaugare, stergere si instectare

        //peek() intoarce capul cozii dar ne il sterge
        System.out.println("Capul listei peek(): " + queue.peek());
        System.out.println("Coada dupa peek(): " + queue);

        //poll() intoarce capul cozii dar il si sterge
        System.out.println("Capul listei poll(): " + queue.poll());
        System.out.println("Coada dupa poll(): " + queue);

        //offer() adauga(insereaza) un element si intoarce true sau false  daca elementul este adaugat sau nu
        Boolean offerd = queue.offer("Offerd element"); //Acesta este elementul adaugat
        System.out.format("Elementul adaugat: %b\n ", offerd);
        System.out.println("Coada dupa offer(): " + queue);

        String head = queue.element();
        System.out.println("Capul cozii este: " + head);
        System.out.println("Coada dupa head element(): " + queue);

    }
}
