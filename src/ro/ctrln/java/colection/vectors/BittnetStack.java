package ro.ctrln.java.colection.vectors;

import java.util.Stack;

public class BittnetStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.add(1);
        stack.add(10);
        stack.add(100);
        stack.add(1000);
        System.out.println(stack);

        stack.push(20);
        stack.push(30);
        System.out.println("stack dupa .push(): " + stack);

        Integer top = stack.pop();//virful stivei
        System.out.println("virful stivei: " + top);
        System.out.println("stack dupa .pop(): " + stack);
        System.out.println("Pozitia lui 10 este: " + stack.search(10));
    }
}
