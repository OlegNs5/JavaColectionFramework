package ro.ctrln.java.colection.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BittnetList {

    public static void main(String[] args) {

        List<String> strings = new ArrayList<>();
        ArrayList<String> aStrings = new ArrayList<>();
        ArrayList<Integer> integers = new ArrayList<>(3);

        int element = 10;
        integers.add(1);
        integers.add(Integer.valueOf(2));
        integers.add(element);
        integers.add(200);
        System.out.println("\tLista 'integers' cu valoti initiale: " + integers);

        strings.add("One");
        strings.add("Two");
        strings.add("Three");
        System.out.println("\tLista 'strings' cu valori initiale: " + strings);

        aStrings.add("Four");
        aStrings.add("Five");
        System.out.println("\tLista 'aStrings' cu valori initiale: " + aStrings);

        System.out.println("Returnarea elementelor dintr-o lista: ");
        System.out.println("\tindexul  0  din lista strings este: "+strings.get(0));
        System.out.println("\tindexul  2 din lista integers este: " + integers.get(2));
        //System.out.println(integers.get(100)); //in acest caz ne arunca o exceptie

        System.out.println("Marimea listei 'strings' este: " + strings.size());
        System.out.println("Marimea listei 'integers' este: " + integers.size());

        strings.addAll(aStrings);
        System.out.println("strings cu valorile din aStrings adaugate: " + strings);
        System.out.println("Marimea listei 'strings' acuma este: " + strings.size());

        integers.addAll(Arrays.asList(300,400,500));
        System.out.println("integers cu valorile dint-o lista creata cu Array.asList: " + integers);
        System.out.println("Marimea listei 'integers' este: " + integers.size());

        integers.addAll(3,Arrays.asList(1000,2000,3000));
        System.out.println("Completarea listei de la indexul 3: " + integers);

        strings.remove("Four");
        System.out.println("Marimea listei 'strings' dupa ce am sters 'Four': " + strings.size()+","+" care sunt; "+strings);

        strings.remove(3);
        System.out.println("Marimea listei 'strings' dupa ce am sters indexul 3: " + strings.size()+","+" care sunt; "+strings);

        strings.removeAll(Arrays.asList("One","Three"));
        System.out.println("Marimea listei 'strings' dupa ce am sters sublistei 'Arrays.asList(\"One\",\"Three\")': " + strings.size()+","+" care sunt; "+strings);

        System.out.println("'integers' contine 1000? : " + integers.contains(1000));//asta vine ca o intrebare
        System.out.println("'integers' contine 1, 10,3000,400? : " + integers.containsAll(Arrays.asList(1,10,3000,400)));

        strings.clear();
        System.out.println("Este lista 'strings' goala ?" + strings.isEmpty());
    }
}
