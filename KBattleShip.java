package SWAYAM;

import java.util.*;

public class KBattleShip {
    static int n,m,k;
    static int[] rowAttack, colAttack, diagAttack;
    static int[][] board;

    static boolean isSafe(int r, int c, int id) {
        for (int i = 1; i <= rowAttack[id]; i++) {
            if (c - i >= 0 && board[r][c - i] != -1) return false;
            if (c + i < m && board[r][c + i] != -1) return false;
        }
        for (int i = 1; i <= colAttack[id]; i++) {
            if (r - i >= 0 && board[r - i][c] != -1) return false;
            if (r + i < n && board[r + i][c] != -1) return false;
        }
        for (int i = 1; i <= diagAttack[id]; i++) {
            if (r - i >= 0 && c - i >= 0 && board[r - i][c - i] != -1) return false;
            if (r - i >= 0 && c + i < m && board[r - i][c + i] != -1) return false;
            if (r + i < n && c - i >= 0 && board[r + i][c - i] != -1) return false;
            if (r + i < n && c + i < m && board[r + i][c + i] != -1) return false;
        }
        return true;
    }

    static boolean placeShips(int id) {
        if (id == k) return true;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (board[i][j] == -1 && isSafe(i, j, id)) {
                    board[i][j] = id;
                    if (placeShips(id + 1)) return true;
                    board[i][j] = -1;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        n = 4;
        m = 4;
        k = 2;
        rowAttack = new int[]{1, 1};
        colAttack = new int[]{1, 1};
        diagAttack = new int[]{1, 1};
        board = new int[n][m];
        for (int[] row : board) Arrays.fill(row, -1);
        System.out.println(placeShips(0));
    }
}

