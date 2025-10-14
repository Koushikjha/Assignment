package ArrayII;

import java.util.ArrayList;
import java.util.List;

public class RepeatElements {
    public static void main(String[] args) {
        int[] nums={1,1,1,2,2,3,3,5,5,4,4};
        System.out.println(find(nums));
    }
    public static List<Integer> find(int[] nums){
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(!list.contains(nums[i])){
                list.add(nums[i]);
            }
        }
        return list;
    }
}
