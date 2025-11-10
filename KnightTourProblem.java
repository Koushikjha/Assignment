package SWAYAM;

import java.util.*;

public class KnightTourProblem {
    static int[] dr = {2, 1, -1, -2, -2, -1, 1, 2};
    static int[] dc = {1, 2, 2, 1, -1, -2, -2, -1};

    static boolean solve(int r, int c, int move, int n, int[][] board) {
        board[r][c] = move;
        if (move == n * n - 1) return true;
        List<int[]> moves = new ArrayList<>();
        for (int i = 0; i < 8; i++) {
            int nr = r + dr[i], nc = c + dc[i];
            if (nr >= 0 && nr < n && nc >= 0 && nc < n && board[nr][nc] == -1)
                moves.add(new int[]{nr, nc});
        }
        moves.sort(Comparator.comparingInt(a -> countMoves(a[0], a[1], board, n)));
        for (int[] m : moves) {
            if (solve(m[0], m[1], move + 1, n, board)) return true;
        }
        board[r][c] = -1;
        return false;
    }

    static int countMoves(int r, int c, int[][] board, int n) {
        int count = 0;
        int[] dr = {2, 1, -1, -2, -2, -1, 1, 2};
        int[] dc = {1, 2, 2, 1, -1, -2, -2, -1};
        for (int i = 0; i < 8; i++) {
            int nr = r + dr[i], nc = c + dc[i];
            if (nr >= 0 && nr < n && nc >= 0 && nc < n && board[nr][nc] == -1)
                count++;
        }
        return count;
    }

    public static List<Integer> knightsTour(int n) {
        int[][] board = new int[n][n];
        for (int[] row : board) Arrays.fill(row, -1);
        if (!solve(0, 0, 0, n, board)) return new ArrayList<>();
        List<Integer> result = new ArrayList<>();
        int[][] order = new int[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                order[board[i][j]] = new int[]{i * n + j};
        for (int i = 0; i < n * n; i++)
            result.add(boardOrderToIndex(board, i, n));
        return result;
    }

    static int boardOrderToIndex(int[][] board, int move, int n) {
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                if (board[i][j] == move) return i * n + j;
        return -1;
    }

    public static void main(String[] args) {
        int n = 5;
        List<Integer> tour = knightsTour(n);
        if (!tour.isEmpty()) System.out.println(tour);
        else System.out.println("No solution exists");
    }
}

