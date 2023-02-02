package ro.ctrln.java.colection.map;

import java.util.HashMap;

public class BittnetMap {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>();

        hashMap.put(1, "One");
        hashMap.put(2, "Two");
        hashMap.put(3, "Three");//nu exista chei dublicate in hashMap
        hashMap.put(3, "3rd value");
        hashMap.put(null, "Null value");
        System.out.println(hashMap);

        System.out.format("Exista cheia null? %b\n ", hashMap.containsKey(null));
        System.out.println("Valoarea care are cheia 2: " + hashMap.get(2));
        System.out.println("Valoarea de pe pozitia 2: " + hashMap.containsValue("3rd value") + hashMap);

        System.out.println("Setul de chei: " + hashMap.keySet());
        System.out.println("Setul de valori: " + hashMap.values());
        System.out.println("Setul de intrari/entries: " + hashMap.entrySet());
    }
}
