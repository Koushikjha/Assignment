package SWAYAM;
import java.util.*;
public class EditDistanceII {
    public static void main(String[] args) {

    }
    public int minDistance(String a, String b) {
        int[][] dp=new int[a.length()+1][b.length()+1];
        for(int i=0;i<=a.length();i++){
            Arrays.fill(dp[i],-1);
        }
        return find(a,b,a.length(),b.length(),dp);
    }
    int find(String a,String b,int m,int n,int[][] dp){
        if(m==0){
            return n;
        }
        if(n==0){
            return m;
        }
        if(dp[m][n]!=-1){
            return dp[m][n];
        }
        if(a.charAt(m-1)==b.charAt(n-1)){
            return dp[m][n]=find(a,b,m-1,n-1,dp);
        }
        int insert=0;
        int replace=0;
        int delete=0;
        if(dp[m][n-1]!=-1){
            insert=dp[m][n-1];
        }else{
            insert=find(a,b,m,n-1,dp);
            dp[m][n-1]=insert;
        }
        if(dp[m-1][n]!=-1){
            delete=dp[m-1][n];
        }else{
            delete=find(a,b,m-1,n,dp);
            dp[m-1][n]=delete;
        }
        if(dp[m-1][n-1]!=-1){
            replace=dp[m-1][n-1];
        }else{
            replace=find(a,b,m-1,n-1,dp);
            dp[m-1][n-1]=replace;
        }
        return dp[m][n]=1+Math.min(insert,Math.min(delete,replace));
    }
}
