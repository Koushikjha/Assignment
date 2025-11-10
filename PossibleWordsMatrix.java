package SWAYAM;

import java.util.*;

public class PossibleWordsMatrix {
    static int[][] grid={{-1,0},{0,-1},{1,0},{0,1},{-1,-1},{1,1},{-1,1},{1,-1}};
    public static void main(String[] args) {
        char[][] board =
                {
                        {'M', 'S', 'E', 'F'},
                        {'R', 'A', 'T', 'D'},
                        {'L', 'O', 'N', 'E'},
                        {'K', 'A', 'F', 'B'}
                };
        List<String> words= Arrays.asList("START", "NOTE", "SAND", "STONED");
        Set<Character> start=new HashSet<>();
        for(String s : words){
            start.add(s.charAt(0));
        }
        Set<String> res=new HashSet<>();
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(start.contains(board[i][j])){
                    Set<String> curr=new HashSet<>();
                    boolean[][] vis=new boolean[board.length][board[0].length];
                    find(vis,board,i,j,"",words,curr);
                    res.addAll(curr);
                }
            }
        }
        System.out.println(res);
    }
    public static void find(boolean[][] vis,char[][] board,int i,int j,String p,List<String> words,Set<String> set){
        if(i<0 || i>=board.length || j<0 || j>= board[0].length || vis[i][j]){
            return;
        }
        vis[i][j]=true;
        p=p+board[i][j];
        if(words.contains(p)){
            set.add(p);
        }
        for(int[] g : grid){
            int r=i+g[0];
            int c=j+g[1];
            find(vis,board,r,c,p,words,set);
        }
        vis[i][j]=false;
    }
}
