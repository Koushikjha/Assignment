package SWAYAM;

import java.util.*;

public class PathTwoVerticesGraph {
    static boolean dfs(int src, int dest, List<List<Integer>> adj, boolean[] visited, List<Integer> path) {
        visited[src] = true;
        path.add(src);
        if (src == dest) return true;
        for (int next : adj.get(src)) {
            if (!visited[next] && dfs(next, dest, adj, visited, path))
                return true;
        }
        path.remove(path.size() - 1);
        return false;
    }

    public static void main(String[] args) {
        int V = 8;
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) adj.add(new ArrayList<>());

        adj.get(0).add(1);
        adj.get(0).add(2);
        adj.get(0).add(3);
        adj.get(1).add(4);
        adj.get(2).add(5);
        adj.get(3).add(4);
        adj.get(3).add(5);
        adj.get(4).add(6);
        adj.get(5).add(6);
        adj.get(6).add(7);

        int src = 0, dest = 7;
        boolean[] visited = new boolean[V];
        List<Integer> path = new ArrayList<>();

        if (dfs(src, dest, adj, visited, path))
            System.out.println("Path exists: " + path);
        else
            System.out.println("No path exists from " + src + " to " + dest);
    }

}
