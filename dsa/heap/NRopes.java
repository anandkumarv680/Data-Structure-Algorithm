package dsa.heap;

import java.util.PriorityQueue;

public class NRopes {
    static void main(String[] args) {
        int ropes[] = {2,6,4,3,3};

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int i = 0; i < ropes.length; i++){
            pq.add(ropes[i]);
        }

        int cost = 0;
        while(pq.size() > 1){
            int min1 = pq.remove();
            int min2 = pq.remove();
            cost += min1 + min2;
            pq.add(min1 + min2);
        }

        System.out.println("Total Cost = " + cost);
    }
}
