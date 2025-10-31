package DynamicProgrammingIII;
import java.util.*;

public class GoldMineProblem {
    int m,n;
    int[][] gr={{1,1},{0,1},{-1,1}};

    public static void main(String[] args) {

    }
    public int maxGold(int[][] grid) {
        m=grid.length;
        n=grid[0].length;
        int[][] memo=new int[m][n];
        for(int i=0;i<m;i++){
            Arrays.fill(memo[i],-1);
        }
        int ans=0;
        for(int i=0;i<m;i++){
            ans=Math.max(ans,find(grid,i,0,memo));
        }
        return ans;
    }
    public int find(int[][] grid,int row,int col,int[][] memo) {
        if (row < 0 || row >= m || col < 0 || col >= n) {
            return 0;
        }
        if (memo[row][col] != -1) {
            return grid[row][col] + memo[row][col];
        }
        int maxGold = 0;

        for (int[] d : gr) {
            int r = row + d[0];
            int c = col + d[1];
            maxGold = Math.max(maxGold, find(grid, r, c, memo));
        }
        memo[row][col] = maxGold;

        return grid[row][col] + memo[row][col];
    }
}
