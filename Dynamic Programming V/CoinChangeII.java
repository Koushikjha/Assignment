package DynamicProgrammingV;

public class CoinChangeII {
    public static void main(String[] args) {

    }
    public int change(int amount, int[] coins) {
        int n=coins.length;
        int[] dp=new int[amount+1];
        dp[0]=1;
        for(int num : coins){
            for(int j=amount;j>=num;j--){
                dp[j]+=dp[j-num];
            }
        }
        return dp[amount];
    }
}
