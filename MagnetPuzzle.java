package SWAYAM;

import java.util.*;

public class MagnetPuzzle {
    static char[][] board;
    static int[] top, bottom, left, right;
    static char[][] rules;
    static int M, N;

    static boolean valid(int r, int c) {
        char cur = board[r][c];
        if(cur=='x') return true;
        if(r>0 && board[r-1][c]==cur) return false;
        if(c>0 && board[r][c-1]==cur) return false;
        return true;
    }

    static boolean checkCounts() {
        for(int i=0;i<M;i++){
            int plus=0, minus=0;
            for(int j=0;j<N;j++){
                if(board[i][j]=='+') plus++;
                if(board[i][j]=='-') minus++;
            }
            if(left[i]!=-1 && plus!=left[i]) return false;
            if(right[i]!=-1 && minus!=right[i]) return false;
        }
        for(int j=0;j<N;j++){
            int plus=0, minus=0;
            for(int i=0;i<M;i++){
                if(board[i][j]=='+') plus++;
                if(board[i][j]=='-') minus++;
            }
            if(top[j]!=-1 && plus!=top[j]) return false;
            if(bottom[j]!=-1 && minus!=bottom[j]) return false;
        }
        return true;
    }

    static boolean solve(int r, int c) {
        if(r==M) return checkCounts();
        int nr=r, nc=c+1;
        if(nc==N){ nr++; nc=0; }
        if(board[r][c]!='x') return solve(nr,nc);

        char rule = rules[r][c];
        char[][] options;
        if(rule=='T') options = new char[][]{{'+','-'},{'-','+'}};
        else if(rule=='B') return solve(nr,nc);
        else if(rule=='L') options = new char[][]{{'+','-'},{'-','+'}};
        else if(rule=='R') return solve(nr,nc);
        else options = new char[][]{{'+','-'},{'-','+'}};

        for(char[] pair: options){
            if(rule=='T'){ board[r][c]=pair[0]; board[r+1][c]=pair[1]; }
            else if(rule=='L'){ board[r][c]=pair[0]; board[r][c+1]=pair[1]; }

            if(valid(r,c) && ((rule=='T' && valid(r+1,c)) || (rule=='L' && valid(r,c+1)))){
                if(solve(nr,nc)) return true;
            }

            if(rule=='T'){ board[r][c]='x'; board[r+1][c]='x'; }
            else if(rule=='L'){ board[r][c]='x'; board[r][c+1]='x'; }
        }
        return false;
    }

    public static void main(String[] args) {
        M = 4; N = 4;
        board = new char[M][N];
        rules = new char[][]{
                {'T','x','L','x'},
                {'B','x','R','x'},
                {'T','x','L','x'},
                {'B','x','R','x'}
        };
        top = new int[]{2,-1,1,-1};
        bottom = new int[]{-1,1,-1,1};
        left = new int[]{1,-1,1,-1};
        right = new int[]{-1,1,-1,1};

        for(char[] row: board) Arrays.fill(row,'x');

        if(solve(0,0)){
            for(char[] row: board) System.out.println(Arrays.toString(row));
        } else System.out.println("No solution");
    }
}

