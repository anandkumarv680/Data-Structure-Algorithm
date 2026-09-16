package dsa.queue;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class Basics {
    static void main(String[] args) {
        // queue ek interface and interface ka object nhi bnta es liye hum jis se queue ko implement krte hai uska object bana dete hai,
        Queue<Integer> q = new LinkedList<>();
        // Linkedlist ki jagah hum ArrayDeque<>(); likh skte hai
        q.add(5);
        q.add(6);
        q.add(9);
        while (!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
