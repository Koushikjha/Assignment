package ArrayIII;

public class MaxSubarray {
    public static void main(String[] args) {
        int[] nums={5,4,-1,7,8};
        System.out.println(maxSubArray(nums));
    }
    public static int maxSubArray(int[] nums) {
        int ans=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum=Math.max(nums[i],sum+nums[i]);
            ans=Math.max(ans,sum);
        }
        return ans;

    }
}
