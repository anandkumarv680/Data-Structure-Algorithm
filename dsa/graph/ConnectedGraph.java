package dsa.graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class ConnectedGraph {
    public static class Edge {
        int wt;
        int src;
        int dest;

        public Edge(int s, int d, int w) {
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }

    public static void createGraph(ArrayList<Edge>[] graph) {

        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        // Vertex 0
        graph[0].add(new Edge(0, 1, 1));
        graph[0].add(new Edge(0, 2, 1));

        // Vertex 1
        graph[1].add(new Edge(1, 0, 1));
        graph[1].add(new Edge(1, 3, 1));

        // Vertex 2
        graph[2].add(new Edge(2, 0, 1));
        graph[2].add(new Edge(2, 4, 1));

        // Vertex 3
        graph[3].add(new Edge(3, 1, 1));
        graph[3].add(new Edge(3, 4, 1));
        graph[3].add(new Edge(3, 5, 1));

        // Vertex 4
        graph[4].add(new Edge(4, 2, 1));
        graph[4].add(new Edge(4, 3, 1));
        graph[4].add(new Edge(4, 5, 1));

        // Vertex 5
        graph[5].add(new Edge(5, 3, 1));
        graph[5].add(new Edge(5, 4, 1));
        graph[5].add(new Edge(5, 6, 1));

        // Vertex 6
        graph[6].add(new Edge(6, 5, 1));
    }

    public static void bfs(ArrayList<Edge>[] graph){
        boolean[] visited = new boolean[graph.length];

        for(int i = 0; i < graph.length; i++){
            if(!visited[i]){
                utilBFS(graph,visited);
            }
        }
    }


    public static void utilBFS(ArrayList<Edge>[] graph, boolean[] visited ) {

        Queue<Integer> q = new LinkedList<>();
        // Start BFS from vertex 6
        q.add(4);

        while (!q.isEmpty()) {

            int curr = q.remove();

            if (!visited[curr]) {

                System.out.print(curr + " ");
                visited[curr] = true;

                // Add all neighbours
                for (int i = 0; i < graph[curr].size(); i++) {

                    Edge e = graph[curr].get(i);
                    q.add(e.dest);
                }
            }
        }
    }

    public static void dfs(ArrayList<Edge>[] graph){
        boolean[] visited = new boolean[graph.length];

        for(int i = 0; i < graph.length; i++){
            if(!visited[i]){
                utilDFS(graph,i,visited);
            }
        }
    }

    public static void utilDFS(ArrayList<Edge>[] graph, int curr, boolean[] visited) {
        System.out.print(curr + " ");
        visited[curr] = true;

        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if (!visited[e.dest]) {
                utilDFS(graph, e.dest, visited);
            }
        }
    }


    public static void main(String[] args) {

        int v = 7;   // vertices: 0,1,2,3,4,5,6

        ArrayList<Edge>[] graph = new ArrayList[v];

        createGraph(graph);

        bfs(graph);
        System.out.println();
        dfs(graph);


    }
}
