package SWAYAM;
import java.util.*;

public class HamiltonianCycle {
    static void hamiltonian(int u, boolean[] visited, List<Integer> path, List<List<Integer>> adj, int V) {
        visited[u] = true;
        path.add(u);
        if (path.size() == V) {
            System.out.println(path);
        } else {
            for (int v : adj.get(u)) {
                if (!visited[v]) hamiltonian(v, visited, path, adj, V);
            }
        }
        path.remove(path.size() - 1);
        visited[u] = false;
    }

    public static void main(String[] args) {
        int V = 4;
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) adj.add(new ArrayList<>());

        adj.get(0).addAll(Arrays.asList(1,2,3));
        adj.get(1).addAll(Arrays.asList(0,2,3));
        adj.get(2).addAll(Arrays.asList(0,1,3));
        adj.get(3).addAll(Arrays.asList(0,1,2));

        for (int i = 0; i < V; i++) {
            boolean[] visited = new boolean[V];
            List<Integer> path = new ArrayList<>();
            hamiltonian(i, visited, path, adj, V);
        }
    }
}

