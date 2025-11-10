package SWAYAM;

import java.util.*;

public class NumberixPuzzle {
    static int[] dr = {-1,1,0,0};
    static int[] dc = {0,0,-1,1};

    static boolean solve(int[][] board, int r, int c, int n, Map<Integer,int[]> positions, int max) {
        if(n > max) return true;
        if(positions.containsKey(n)) {
            int[] pos = positions.get(n);
            return solve(board, pos[0], pos[1], n+1, positions, max);
        }
        for(int i=0;i<4;i++) {
            int nr = r + dr[i], nc = c + dc[i];
            if(nr>=0 && nr<board.length && nc>=0 && nc<board[0].length && board[nr][nc]==0) {
                board[nr][nc]=n;
                if(solve(board,nr,nc,n+1,positions,max)) return true;
                board[nr][nc]=0;
            }
        }
        return false;
    }

    public static boolean numbrix(int[][] board) {
        Map<Integer,int[]> positions = new HashMap<>();
        int max = 0, r1=0, c1=0;
        for(int i=0;i<board.length;i++)
            for(int j=0;j<board[i].length;j++)
                if(board[i][j]!=0){
                    positions.put(board[i][j], new int[]{i,j});
                    max = Math.max(max, board[i][j]);
                    if(board[i][j]==1){ r1=i; c1=j; }
                }
        return solve(board,r1,c1,2,positions,max);
    }

    public static void main(String[] args) {
        int[][] board = {
                {1,0,0,0,0},
                {0,0,0,0,0},
                {0,0,0,0,0},
                {0,0,0,0,25},
                {0,0,0,0,0}
        };
        if(numbrix(board)){
            for(int[] row: board) System.out.println(Arrays.toString(row));
        } else System.out.println("No solution");
    }
}
