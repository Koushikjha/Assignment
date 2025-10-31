package DynamicProgrammingI;

import java.util.Arrays;
import java.util.*;
public class ClimbingStairs {
    public static void main(String[] args) {
        ClimbingStairs cs=new ClimbingStairs();
        System.out.println(cs.climbStairs(1));
    }
    public int climbStairs(int n) {
        if(n<4){
            return n;
        }
        int[] dp=new int[n+1];
        dp[0]=1;
        dp[1]=1;
        dp[2]=2;
        dp[3]=3;
        for(int i=4;i<=n;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];
    }
}
