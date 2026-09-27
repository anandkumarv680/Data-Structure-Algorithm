package dsa.graph.kahn_Algorithm;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class TopologicalSort { // by using BFS

    public static class Edge{
        int src;
        int dst;

        public Edge(int src, int dst) {
            this.src = src;
            this.dst = dst;
        }
    }

    public static void findInDeg(ArrayList<Edge> graph[], int[] inDeg){
        for( int i = 0; i < graph.length; i++){
            int v = i;
            for ( int j = 0; j < graph[v].size(); j++){
                Edge e = graph[v].get(j);
                inDeg[e.dst]++;
            }
        }
    }

    public static void topSort(ArrayList<Edge> graph[]){
        int[] inDeg = new int[graph.length];
        findInDeg(graph, inDeg);

        Queue<Integer> q = new LinkedList<>();

        for(int i = 0; i < inDeg.length; i++){
            if(inDeg[i] == 0){
                q.add(i);
            }
        }


        while (!q.isEmpty()){
            int curr = q.remove();
            System.out.print(curr + " ");

            for(int i = 0; i < graph[curr].size(); i++){
                Edge e = graph[curr].get(i);
                inDeg[e.dst]--;
                if(inDeg[e.dst] == 0){
                    q.add(e.dst);
                }
            }
        }

        System.out.println();

    }

    static void createGraph(ArrayList<Edge> graph[]) {

        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[2].add(new Edge(2, 3));

        graph[3].add(new Edge(3, 1));

        graph[4].add(new Edge(4, 0));
        graph[4].add(new Edge(4, 1));

        graph[5].add(new Edge(5, 0));
        graph[5].add(new Edge(5, 2));
    }

    static void main(String[] args) {
        int v = 6;
        ArrayList<Edge> [] graph = new ArrayList[v];
        createGraph(graph);

        topSort(graph);

    }
}
