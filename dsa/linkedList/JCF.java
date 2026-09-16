package dsa.linkedList;

import java.util.LinkedList;

public class JCF {
    // esme hum dekhenge collection framework se kaise implement krte hai humhe scratch se likhna nhi padta hai..
    static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.addFirst(7);
        ll.addLast(8);
        ll.addLast(9);
        System.out.println(ll);
        ll.removeLast();
        ll.removeFirst();
        System.out.println(ll);
    }
}
