package SWAYAM;
import java.util.*;
public class LongestIncreasingSubsequence {
    public static void main(String[] args) {
        int[] arr={10, 22, 9, 33, 21, 50, 41, 60, 80};
        System.out.println(getLIS(arr));
    }
    public static ArrayList<Integer> getLIS(int[] arr) {
        int n=arr.length;
        int[] dp=new int[n];
        int[] prev=new int[n];
        Arrays.fill(dp,1);
        Arrays.fill(prev,-1);
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                if(arr[j]<arr[i] && dp[j]+1>dp[i]){
                    dp[i]=dp[j]+1;
                    prev[i]=j;
                }
            }
        }
        int max=0;
        int last=0;
        for(int i=0;i<n;i++){
            if(dp[i]>max){
                max=dp[i];
                last=i;
            }
        }
        ArrayList<Integer> res=new ArrayList<>();
        while(last!=-1){
            res.addFirst(arr[last]);
            last=prev[last];
        }
        return res;
    }

}
