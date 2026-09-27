package dsa.graph.prims_Algorithm;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class MinSpaningTree {

    // for weighted graph  and total path will be greater than 0 or positive

    public static class Edge {
        int src;
        int dst;

        public Edge(int src, int dst, int wt) {
            this.src = src;
            this.dst = dst;
            this.wt = wt;
        }

        int wt;

    }

    // Edge[]
    static void createGraph(ArrayList<Edge> graph[]) {

        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1, 10));
        graph[0].add(new Edge(0, 2, 15));
        graph[0].add(new Edge(0, 3, 30));

        graph[1].add(new Edge(1, 0, 10));
        graph[1].add(new Edge(1, 3, 40));

        graph[2].add(new Edge(2, 0, 15));
        graph[2].add(new Edge(2, 3, 50));

        graph[3].add(new Edge(3, 1, 40));
        graph[3].add(new Edge(3, 2, 50));
    }

    public static class Pair implements Comparable<Pair>{
        int v;
        int cost;

        public Pair(int v, int cost) {
            this.v = v;
            this.cost = cost;
        }
        @Override
        public int compareTo(Pair p2){
            return this.cost - p2.cost;
        }
    }

    public static void mst(ArrayList<Edge>[] graph) {
        boolean[] vist = new boolean[graph.length];
        int minCost = 0;

        PriorityQueue<Pair> pq = new PriorityQueue<>();

        pq.add(new Pair(0,0));

        while (!pq.isEmpty()){
            Pair curr = pq.remove();
            if(!vist[curr.v]){
                vist[curr.v] = true;
                minCost += curr.cost;
                for (int i = 0; i < graph[curr.v].size(); i++) {
                    Edge e = graph[curr.v].get(i);
                    pq.add(new Pair(e.dst, e.wt));
                }
            }
        }


        System.out.println("The minimum cost of our MST : " + minCost);
    }


    static void main(String[] args) {
        int v = 5;

        ArrayList<Edge>[] graph = new ArrayList[v];
        createGraph(graph);
        mst(graph);


    }


}
