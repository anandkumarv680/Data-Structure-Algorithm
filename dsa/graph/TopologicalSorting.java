package dsa.graph;

import java.util.ArrayList;
import java.util.Stack;

public class TopologicalSorting {
    public static class Edge {
        int src;
        int dst;

        public Edge(int src, int dst) {
            this.src = src;
            this.dst = dst;
        }
    }

    public static void createGraph(ArrayList<Edge> graph[]) { // topological sort DAG (Directed Acyclic Graph) ke liye hota hai

        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 2));

        graph[1].add(new Edge(1, 0));

        graph[2].add(new Edge(2, 3));

        graph[3].add(new Edge(3, 0));
    }

    public static void topSort(ArrayList<Edge> graph[]){
        boolean[] vis = new boolean[graph.length];
        Stack<Integer> s= new Stack<>();

        for(int i = 0; i < graph.length; i++){
            if(!vis[i]){
                topSortUtil(graph, i, vis, s);
            }
        }

        while(!s.isEmpty()){
            System.out.print(s.pop() + " ");
        }
    }

    public static void topSortUtil(ArrayList<Edge> graph[],int curr, boolean[] vis, Stack<Integer> s){
        vis[curr] = true;
        for(int i = 0; i < graph[curr].size(); i++){
            Edge e = graph[curr].get(i);
            if(!vis[e.dst]){
                topSortUtil(graph, e.dst, vis, s);
            }
        }
        s.push(curr);
    }


    static void main(String[] args) {
        int v = 4;
        ArrayList<Edge>[] graph = new ArrayList[v];
        createGraph(graph);
        topSort(graph);
    }
}
