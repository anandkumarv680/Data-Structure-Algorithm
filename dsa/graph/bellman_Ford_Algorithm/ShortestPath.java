package dsa.graph.bellman_Ford_Algorithm;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class ShortestPath {
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

        graph[0].add(new Edge(0, 1, 2));
        graph[0].add(new Edge(0, 2, 4));

        graph[1].add(new Edge(1, 2, -4));

        graph[2].add(new Edge(2, 3, 2));

        graph[3].add(new Edge(3, 4, 4));

        graph[4].add(new Edge(4, 1, -1));
    }

    public static void shortpath(ArrayList<Edge>[] graph, int src, int v){
        int[] dist = new int[graph.length];
        for(int i = 0; i < graph.length; i++){
            if(src != i){
                dist[i] = Integer.MAX_VALUE;
            }
        }

        for(int i = 0; i < v - 1; i++){
            for ( int j = 0; j < graph.length; j++){
                for(int k = 0; k < graph[j].size(); k++ ){
                    Edge e = graph[j].get(k);
                    if(dist[e.src] != Integer.MAX_VALUE && dist[e.src] + e.wt < dist[e.dst]){
                        dist[e.dst] = e.wt + dist[e.src];
                    }
                }
            }
        }

        for(int i = 0; i < dist.length; i++){
            System.out.print(dist[i]);
            if(i != dist.length - 1){
                System.out.print(" -> ");
            }

        }
        System.out.println();
    }


    static void main(String[] args) {
        int v = 5;

        ArrayList<Edge>[] graph = new ArrayList[v];
        createGraph(graph);
        shortpath(graph, 0,v);


    }


}
