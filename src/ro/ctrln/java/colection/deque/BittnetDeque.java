package ro.ctrln.java.colection.deque;

import java.util.Deque;
import java.util.LinkedList;

public class BittnetDeque {
    public static void main(String[] args) {
        Deque<String> deque = new LinkedList<String>();
        deque.add("One");
        deque.add("Two");
        deque.add("Three");
        deque.add("Four");
        System.out.println(deque);

        deque.addFirst("Zero");
        deque.addLast("Five");
        System.out.println(deque);

        System.out.println(" .peekFirst() si .peekLast(): " + deque.peekFirst() +" "+ deque.peekLast());//if empty list return NULL

        System.out.println(".getFirst() si .getLast(): " + deque.getFirst() +" "+deque.getLast());// if empty list return exception

        System.out.println(".pollFirst() si .pollLast()" + deque.pollFirst() +" "+deque.pollLast());

        System.out.println(".removeFirst() si .removeLast()" + deque.removeFirst() +" "+deque.removeLast());
        System.out.println(".offerFirst() si .offerLast()" +" "+deque.offerFirst("first") +"; "+ deque.offerLast("last")+";"+deque);

    }
}
