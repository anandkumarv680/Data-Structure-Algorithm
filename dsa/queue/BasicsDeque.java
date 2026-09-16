package dsa.queue;

import java.util.Deque;
import java.util.LinkedList;

public class BasicsDeque {
    // double ended queue
    static void main(String[] args) {
        Deque<Integer> dq = new LinkedList<>();
        dq.addFirst(4);
        dq.addLast(7);
        dq.removeFirst();
        dq.removeLast();
    }
}
