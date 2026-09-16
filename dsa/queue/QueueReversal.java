package dsa.queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class QueueReversal {
    public static void queueReversal(Queue<Integer> q){
        Stack<Integer> s = new Stack<>();

        while(!q.isEmpty()){
            s.push(q.remove());
        }
        while (!s.isEmpty()){
            q.add(s.pop());
        }
    }
    static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        for(int i = 1; i < 6; i++){
            q.add(i);
        }
        System.out.println(q);
        queueReversal(q);
        System.out.println(q);
    }
}
