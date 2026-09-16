package dsa.heap;

import java.util.PriorityQueue;

public class WeakestSoldier {
    public static class Row implements Comparable<Row>{
        int idx;

        public Row(int idx, int soldiers) {
            this.idx = idx;
            this.soldiers = soldiers;
        }

        int soldiers;

        @Override
        public int compareTo(Row r2){
            if(r2.soldiers == this.soldiers){
                return this.idx - r2.idx;
            }
            else{
                return this.soldiers - r2.soldiers;
            }
        }
    }
    static void main(String[] args) {
        int army[][] = {
                {1,0,0,0},
                {1,1,1,1},
                {1,0,0,0},
                {1,0,0,0}
        };
        int k = 4;

        PriorityQueue<Row> pq = new PriorityQueue<>();

        for(int i = 0; i < army.length; i++){
            int count = 0;
            for(int j = 0; j < army.length; j++){
                count += army[i][j] == 1 ? 1 : 0;
            }
            pq.add(new Row(i, count));
        }

        for(int i = 0; i < k; i++){
            System.out.println("R" + pq.remove().idx);
        }

    }
}
