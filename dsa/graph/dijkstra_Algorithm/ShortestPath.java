package dsa.graph.dijkstra_Algorithm;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class ShortestPath { // for weighted graph

    public static class Edge{
        int src;
        int dst;

        public Edge(int src, int dst, int wt) {
            this.src = src;
            this.dst = dst;
            this.wt = wt;
        }

        int wt;

    }
    static void createGraph(ArrayList<Edge> graph[]) {

        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1, 2));
        graph[0].add(new Edge(0, 2, 4));

        graph[1].add(new Edge(1, 3, 7));
        graph[1].add(new Edge(1, 2, 1));

        graph[2].add(new Edge(2, 4, 3));

        graph[3].add(new Edge(3, 5, 1));

        graph[4].add(new Edge(4, 3, 2));
        graph[4].add(new Edge(4, 5, 5));
    }

    public static class Pair implements Comparable<Pair>{
        int n;
        int path;

        public Pair(int n, int path) {
            this.n = n;
            this.path = path;
        }

        @Override
        public int compareTo(Pair p2){
            return this.path - p2.path;
        }
    }

    public static void dijkstra(ArrayList<Edge>[] graph, int src){
        int [] dist = new int[graph.length];

        for( int i = 0; i < graph.length ; i++){
            if(i != src){
                dist[i] = Integer.MAX_VALUE;
            }
        }

        boolean [] vist = new boolean[graph.length];
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        pq.add(new Pair(src, 0));

        while (!pq.isEmpty()){
            Pair curr = pq.remove();
            if(!vist[curr.n]){
                vist[curr.n] = true;
                for (int i = 0; i < graph[curr.n].size(); i++){
                    Edge e = graph[curr.n].get(i);

                    if(dist[e.src] + e.wt < dist[e.dst]){
                        dist[e.dst] = dist[e.src] + e.wt;
                        pq.add(new Pair(e.dst, dist[e.dst]));
                    }
                }
            }
        }

        for ( int i = 0; i < dist.length; i++){
            System.out.print(dist[i] + " ");
        }
        System.out.println();

    }

    static void main(String[] args) {
        int v = 6;
        ArrayList<Edge>[] graph = new ArrayList[v];

        createGraph(graph);

        dijkstra(graph,0);

    }
}
