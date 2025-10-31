package DynamicProgrammingVIII;
import java.util.*;
public class EggDropping {
    public static void main(String[] args) {

    }
    public int superEggDrop(int k, int n) {
        int[][] dp=new int[k+1][n+1];
        for(int i=0;i<=k;i++){
            Arrays.fill(dp[i],-1);
        }
        return find(k,n,dp);
    }
    public int find(int k,int n,int[][] dp){
        if(n==0 || n==1 || k==1){
            return n;
        }
        int count=Integer.MAX_VALUE;
        int low=1;
        int high=n;
        while (low <= high) {
            int mid = (low + high) / 2;

            int breakCase, surviveCase;

            if (dp[k - 1][mid - 1] != -1) {
                breakCase = dp[k - 1][mid - 1];
            } else {
                breakCase = find(k - 1, mid - 1, dp);
                dp[k - 1][mid - 1] = breakCase;
            }

            if (dp[k][n - mid] != -1) {
                surviveCase = dp[k][n - mid];
            } else {
                surviveCase = find(k, n - mid, dp);
                dp[k][n - mid] = surviveCase;
            }

            int worst = 1 + Math.max(breakCase, surviveCase);
            count = Math.min(count, worst);
            if (breakCase > surviveCase) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return dp[k][n]=count;
    }
}
