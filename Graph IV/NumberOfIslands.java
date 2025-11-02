package GraphIV;
import java.util.*;
public class NumberOfIslands {
    public static void main(String[] args) {

    }
    public int numIslands(char[][] grid) {
        boolean[][] visited=new boolean[grid.length][grid[0].length];
        int c=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(!visited[i][j] && grid[i][j]=='1'){
                    find(grid,i,j,visited);
                    c++;
                }
            }
        }
        return c;
    }
    public void find(char[][] grid,int row,int col,boolean[][] vis){
        if(grid[row][col]=='0' || vis[row][col]){
            return ;
        }
        vis[row][col]=true;
        if(row>0){
            find(grid,row-1,col,vis);
        }
        if(row<grid.length-1){
            find(grid,row+1,col,vis);
        }
        if(col>0){
            find(grid,row,col-1,vis);
        }
        if(col<grid[0].length-1){
            find(grid,row,col+1,vis);
        }
    }
}
