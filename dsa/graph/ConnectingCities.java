package dsa.graph;

import java.util.PriorityQueue;

public class ConnectingCities {
    public static class Edge implements Comparable<Edge>{
        public Edge(int dst, int cost) {
            this.dst = dst;
            this.cost = cost;
        }

        int dst;
        int cost;

        @Override
        public int compareTo(Edge e2){
            return this.cost - e2.cost;
        }
    }

    public static int connecting(int[][] cities){
        boolean [] visit = new boolean[cities.length];

        PriorityQueue<Edge> pq = new PriorityQueue<>();
        pq.add(new Edge(0,0));
        int finalCost = 0;

        while(!pq.isEmpty()){
            Edge curr = pq.remove();
            if(!visit[curr.dst]){
                visit[curr.dst] = true;
                finalCost += curr.cost;
                for( int i = 0; i < cities[curr.dst].length; i++){
                    if(cities[curr.dst][i] != 0){
                        pq.add(new Edge(i, cities[curr.dst][i]));
                    }
                }
            }
        }

        return finalCost;

    }

    static void main(String[] args) {
        int[][] cities = {{0,1,2,3,4}, {1,0,5,0,7},{2,5,0,6,0}, {3, 0, 6,0,0},{4,7,0,0,0}};

        System.out.println(connecting(cities));
    }
}

