package SWAYAM;
import java.util.*;
class NQueens {
    public static void main(String[] args) {
        NQueens nq=new NQueens();
        List<List<String>> list=nq.solveNQueens(4);
        for(List<String> p : list){
            System.out.println(p);
        }
    }
    public List<List<String>> solveNQueens(int n) {
        boolean[][] board=new boolean[n][n];
        List<List<String>> list=new ArrayList<>();
        findQueens(board,0,list);
        return list;

    }
    public void findQueens(boolean[][] board,int row,List<List<String>> list){
        if(row==board.length){
            addTo(board,list);
            System.out.println();
            return;
        }
        for(int j=0;j< board.length;j++) {
            if (isSafe(board, row, j)) {
                board[row][j] = true;
                findQueens(board, row + 1,list);
                board[row][j] = false;
            }
        }
    }
    public boolean isSafe(boolean[][] board,int row,int col){
        for(int i=0;i<=row;i++){
            if(board[i][col]){
                return false;
            }
        }
        int left=Math.min(row,col);
        for(int i=1;i<=left;i++){
            if(board[row-i][col-i]){
                return false;
            }
        }
        int right=Math.min(row, board.length-col-1);
        for(int i=1;i<=right;i++){
            if(board[row-i][col+i]){
                return false;
            }
        }
        return true;
    }
    public void addTo(boolean[][] board,List<List<String>> list){
        List<String> row=new ArrayList<>();
        for(int i=0;i<board.length;i++){
            String p="";
            for(int j=0;j< board.length;j++){
                if(board[i][j]){
                    p=p+'Q';
                }else{
                    p=p+'.';
                }
            }
            row.add(p);
        }
        list.add(row);
    }
}

