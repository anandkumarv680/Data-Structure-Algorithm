package dsa.graph;

import dsa.graph.kahn_Algorithm.TopologicalSort;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class AllPath {


    public static class Edge {
        int src;
        int dst;

        public Edge(int src, int dst) {
            this.src = src;
            this.dst = dst;
        }
    }

    static void createGraph(ArrayList<Edge> graph[]) {

        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 3));

        graph[2].add(new Edge(2, 3));

        graph[3].add(new Edge(3, 1));

        graph[4].add(new Edge(4, 0));
        graph[4].add(new Edge(4, 1));

        graph[5].add(new Edge(5, 0));
        graph[5].add(new Edge(5, 2));
    }

    public static void allPath(ArrayList<Edge> graph[], int src, int dst, String path){
        if(src == dst){
            System.out.println(path + dst);
            return;
        }

        for(int i = 0; i < graph[src].size(); i++){
            Edge e = graph[src].get(i);
            allPath(graph, e.dst, dst, path + src+ " -> ");
        }
    }

    static void main(String[] args) {
        int v = 6;
        ArrayList<Edge>[] graph = new ArrayList[v];
        createGraph(graph);

        allPath(graph, 5,1,"");

    }


}
