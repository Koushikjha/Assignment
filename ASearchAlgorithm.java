package SWAYAM;

import java.util.*;

class Node {
    int row, col, g, h;
    Node parent;
    Node(int row, int col, int g, int h, Node parent) {
        this.row = row;
        this.col = col;
        this.g = g;
        this.h = h;
        this.parent = parent;
    }
    int f() { return g + h; }
}

public class ASearchAlgorithm {
    static int[] dr = {-1, 1, 0, 0};
    static int[] dc = {0, 0, -1, 1};

    static List<int[]> aStar(int[][] grid, int[] start, int[] goal) {
        int n = grid.length, m = grid[0].length;
        boolean[][] visited = new boolean[n][m];
        PriorityQueue<Node> pq = new PriorityQueue<>(Comparator.comparingInt(Node::f));
        pq.add(new Node(start[0], start[1], 0, Math.abs(goal[0]-start[0])+Math.abs(goal[1]-start[1]), null));

        while (!pq.isEmpty()) {
            Node cur = pq.poll();
            if (visited[cur.row][cur.col]) continue;
            visited[cur.row][cur.col] = true;
            if (cur.row == goal[0] && cur.col == goal[1]) {
                List<int[]> path = new ArrayList<>();
                while (cur != null) {
                    path.add(new int[]{cur.row, cur.col});
                    cur = cur.parent;
                }
                Collections.reverse(path);
                return path;
            }
            for (int i = 0; i < 4; i++) {
                int nr = cur.row + dr[i], nc = cur.col + dc[i];
                if (nr >= 0 && nr < n && nc >= 0 && nc < m && grid[nr][nc] == 0 && !visited[nr][nc]) {
                    int gNew = cur.g + 1;
                    int hNew = Math.abs(goal[0]-nr) + Math.abs(goal[1]-nc);
                    pq.add(new Node(nr, nc, gNew, hNew, cur));
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int[][] grid = {
                {0,0,0,0,0},
                {0,1,1,0,0},
                {0,0,0,1,0},
                {1,0,0,0,0},
                {0,0,1,0,0}
        };
        int[] start = {0,0};
        int[] goal = {4,4};
        List<int[]> path = aStar(grid, start, goal);
        if (path != null) for (int[] p : path) System.out.println(Arrays.toString(p));
        else System.out.println("No path found");
    }
}

