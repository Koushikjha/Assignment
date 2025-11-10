package SWAYAM;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class TopoOrderingInDAG {
    static void topoSort(int V, List<List<Integer>> adj) {
        int[] indegree = new int[V];
        for (int i = 0; i < V; i++) {
            for (int node : adj.get(i)) {
                indegree[node]++;
            }
        }

        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < V; i++) {
            if (indegree[i] == 0)
                q.add(i);
        }

        List<Integer> topoOrder = new ArrayList<>();

        while (!q.isEmpty()) {
            int curr = q.poll();
            topoOrder.add(curr);
            for (int node : adj.get(curr)) {
                indegree[node]--;
                if (indegree[node] == 0)
                    q.add(node);
            }
        }

        if (topoOrder.size() != V) {
            System.out.println("Graph is not a DAG — no topological order possible!");
            return;
        }

        System.out.println("Topological Order: " + topoOrder);
    }

    public static void main(String[] args) {
        int V = 6;
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++)
            adj.add(new ArrayList<>());

        adj.get(5).add(2);
        adj.get(5).add(0);
        adj.get(4).add(0);
        adj.get(4).add(1);
        adj.get(2).add(3);
        adj.get(3).add(1);

        topoSort(V, adj);
    }
}
