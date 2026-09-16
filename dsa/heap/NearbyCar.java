package dsa.heap;

import java.awt.*;
import java.util.PriorityQueue;

public class NearbyCar {
    public static class Point implements Comparable<Point>{
        int x;

        public Point(int x, int y, int distSq, int i) {
            this.x = x;
            this.y = y;
            this.distSq = distSq;
            this.i = i;
        }

        int i;
        int y;
        int distSq;

        @Override
        public int compareTo(Point p2){
            return this.distSq - p2.distSq;
        }
    }
    static void main(String[] args) {
        int coods[][] = {{3, 3}, {5, -1}, {-2, 4}};
        int k = 2;

        PriorityQueue<Point> pq = new PriorityQueue<>();

        for(int i = 0; i < coods.length; i++){
            int distSq = coods[i][0]*coods[i][0] + coods[i][1]*coods[i][1] ;
            pq.add(new Point(coods[i][0], coods[i][1], distSq,i));
        }

        for(int i = 0; i < k; i++){
            System.out.println("C" +pq.remove().i);
        }
    }
}
