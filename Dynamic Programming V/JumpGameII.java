package DynamicProgrammingV;

public class JumpGameII {
    public int jump(int[] nums) {
        int n=nums.length;
        int far=0;
        int end=0;
        int jumps=0;
        for(int i=0;i<n-1;i++){
            far=Math.max(far,i+nums[i]);
            if(i==end){
                jumps++;
                end=far;
            }
        }
        return jumps;
    }
}
