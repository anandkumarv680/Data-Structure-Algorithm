package dsa.graph.kosaRaju_Algorithm;

import java.util.ArrayList;
import java.util.Stack;

public class StronglyConnectedComponent {

    public static class Edge {

        int src;
        int dst;

        public Edge(int s, int d) {
            this.src = s;
            this.dst = d;
        }
    }

    public static void createGraph(ArrayList<Edge> graph[]) {

        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<Edge>();
        }

        graph[0].add(new Edge(0, 2));
        graph[0].add(new Edge(0, 3));

        graph[1].add(new Edge(1, 0));

        graph[2].add(new Edge(2, 1));

        graph[3].add(new Edge(3, 4));
    }

    public static void topologicalSort(ArrayList<Edge> graph[], int curr, Stack<Integer> s, boolean[] visit){
        visit[curr] = true;

        for(int i = 0; i < graph[curr].size(); i++){
            Edge e = graph[curr].get(i);
            if(!visit[e.dst]){
                topologicalSort(graph, e.dst, s, visit);
            }
        }

        s.push(curr);
    }

    public static void kosaRaju(ArrayList<Edge> graph[], int v){

        // step 1 pehle hum topological sort nikalenge
        Stack<Integer> s = new Stack<>();
        boolean[] visit = new boolean[v]; 

        for(int i = 0; i < v; i++){
            if(!visit[i]){
                topologicalSort(graph, i, s, visit);
            }
        }

        // step 2 tranpose graph nikalna hai esme hum src ko dst kr denge and vice versa for dst

        ArrayList<Edge> transpose[] = new ArrayList[v];

        for (int i = 0; i < v; i++) {
            visit[i] = false;
            transpose[i] = new ArrayList<Edge>();
        }


        for(int i = 0; i < v; i++){
            for (int j = 0; j < graph[i].size(); j++){
                Edge e = graph[i].get(j);

                transpose[e.dst].add(new Edge(e.dst, e.src));
            }
        }

        while(!s.isEmpty()){
            int curr = s.pop();
            if(!visit[curr]){
                System.out.print("src -> ");
                dfs(transpose, curr, visit);
                System.out.println();
            }
        }

    }

    public static void dfs(ArrayList<Edge> graph[], int curr, boolean[] visit){
        visit[curr] = true;
        System.out.print(curr + " ");

        for(int i = 0; i < graph[curr].size(); i++){
            Edge e = graph[curr].get(i);
            if(!visit[e.dst]){
                dfs(graph, e.dst, visit);
            }
        }

    }

    public static void main(String[] args) {

        int v = 5;

        ArrayList<Edge> graph[] = new ArrayList[v];

        createGraph(graph);

        kosaRaju(graph, v);

    }
}
