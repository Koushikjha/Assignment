package RecursionII;

public class PivotElement {
    public static void main(String[] args) {
        int[] nums={1,7,3,6,5,6};
        System.out.println(pivotIndex(nums));
    }
    public static int pivotIndex(int[] nums) {
        for(int i=0;i<nums.length;i++){
            if(find(nums,0,i-1)==find(nums,i+1,nums.length-1)){
                return i;
            }
        }
        return -1;
    }
    public static int find(int[] nums,int i,int n){
        if(i>n){
            return 0;
        }
        return nums[i]+find(nums,i+1,n);
    }
}
