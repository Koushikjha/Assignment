package ArrayII;

public class PivotIndex {
    public static void main(String[] args) {
        int[] nums={1,7,3,6,5,6};
        System.out.println(pivotIndex(nums));
    }
    public static int pivotIndex(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        int left=0;
        int ans=-1;
        for(int i=0;i<nums.length;i++){
            int right=sum-left-nums[i];
            if(right==left){
                ans=i;
                break;
            }

            left+=nums[i];
        }
        return ans;
    }
}
