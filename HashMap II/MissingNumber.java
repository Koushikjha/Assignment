package HashMapII;
import java.util.*;
public class MissingNumber {
    public static void main(String[] args) {

    }
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(i!=nums[i]){
                return i;
            }
        }
        return nums.length;
    }
}
