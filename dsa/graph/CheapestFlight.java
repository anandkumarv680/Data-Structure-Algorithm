package dsa.graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class CheapestFlight {
    public static class Edge {
        int src;
        int dst;
        int wt;

        public Edge(int src, int dst, int wt) {
            this.src = src;
            this.dst = dst;
            this.wt = wt;
        }
    }

    public static void createGraph(int[][] flight, ArrayList<Edge>[] graph) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < flight.length; i++) {
            int src = flight[i][0];
            int dst = flight[i][1];
            int wt = flight[i][2];

            Edge e = new Edge(src, dst, wt);
            graph[src].add(e);
        }
    }

    public static class info {
        int v;
        int cost;
        int stop;

        public info(int v, int cost, int stop) {
            this.v = v;
            this.cost = cost;
            this.stop = stop;
        }
    }

    public static int cheapestFlight(int n, int src, int k,int dst, int[][] flight) {
        ArrayList<Edge>[] graph = new ArrayList[n];
        createGraph(flight, graph);

        int[] dist = new int[n];
        for (int i = 0; i < n; i++) {
            if (i != src) {
                dist[i] = Integer.MAX_VALUE;
            }
        }

        Queue<info> q = new LinkedList<>();
        q.add(new info(src, 0, 0));
        while (!q.isEmpty()) {
            info curr = q.remove();
            if (curr.stop > k) {
                break;
            }

            for (int i = 0; i < graph[curr.v].size(); i++) {
                Edge e = graph[curr.v].get(i);
                int u = e.src;
                int v = e.dst;
                int wt = e.wt;
                if ( curr.cost + wt < dist[v] && curr.stop <= k) {
                    dist[v] = dist[u] + wt;
                    q.add(new info(v, dist[v], curr.stop + 1));
                }
            }
        }

        return dist[dst] == Integer.MAX_VALUE ? -1 : dist[dst];
    }

    static void main(String[] args) {
        int n = 4;
        int[][] flight = {{0, 1, 100}, {1, 2, 100}, {2, 0, 100}, {1, 3, 600}, {2, 3, 200}};
        int k = 1;
        int src = 0;
        int dst = 3;
        System.out.println(cheapestFlight(n,src,k,dst,flight));
    }

}
