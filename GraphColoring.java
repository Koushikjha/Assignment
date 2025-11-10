package SWAYAM;

import java.util.*;

public class GraphColoring {
    static boolean isSafe(int node, int color[], boolean[][] graph, int c, int V) {
        for (int i = 0; i < V; i++) {
            if (graph[node][i] && color[i] == c) return false;
        }
        return true;
    }

    static boolean solve(int node, boolean[][] graph, int m, int V, int color[]) {
        if (node == V) return true;
        for (int c = 1; c <= m; c++) {
            if (isSafe(node, color, graph, c, V)) {
                color[node] = c;
                if (solve(node + 1, graph, m, V, color)) return true;
                color[node] = 0;
            }
        }
        return false;
    }

    static boolean graphColoring(boolean[][] graph, int m, int V) {
        int[] color = new int[V];
        return solve(0, graph, m, V, color);
    }

    public static void main(String[] args) {
        int V = 4, m = 3;
        boolean[][] graph = {
                {false, true, true, true},
                {true, false, true, false},
                {true, true, false, true},
                {true, false, true, false}
        };
        System.out.println(graphColoring(graph, m, V));
    }
}

