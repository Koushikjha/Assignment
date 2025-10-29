package AdvancedRecursion;
import java.util.*;
public class SubsetI {
    public static void main(String[] args) {

    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list=new ArrayList<>();
        List<Integer> current=new ArrayList<>();
        find(nums,0,current,list);
        return list;
    }
    void find(int[] nums,int index,List<Integer> current,List<List<Integer>> list){
        if(index==nums.length){
            list.add(new ArrayList<>(current));
            return;
        }
        find(nums,index+1,current,list);
        current.add(nums[index]);
        find(nums,index+1,current,list);
        current.remove(current.size()-1);
    }
}
