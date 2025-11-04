package BitManipulationII;

public class FindDuplicateNummber {
    public static void main(String[] args) {

    }
    public int findDuplicate(int[] nums) {
        int ans=0;
        for(int i=0;i<nums.length;i++){
            ans^=nums[i];
        }
        return ans;
    }
}
