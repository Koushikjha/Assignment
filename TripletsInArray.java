package SWAYAM;

import java.util.*;

public class TripletsInArray {
    public static void main(String[] args) {
        int[] nums={2, 7, 4, 9, 5, 1, 3 };
        int sum=10;
        Arrays.sort(nums);
        List<List<Integer>> list=new ArrayList<>();
        find(nums,sum,0,new ArrayList<>(),list);
        for(List<Integer> p : list){
            System.out.println(p);
        }
    }
    public static void find(int[] nums,int sum,int index,List<Integer> p,List<List<Integer>> list){
        if(p.size()==3 && sum>=0){
            list.add(new ArrayList<>(p));
            return;
        }
        for(int i=index;i<nums.length && nums[i]<=sum;i++){
            p.addLast(nums[i]);
            find(nums,sum-nums[i],i+1,p,list);
            p.removeLast();
        }
    }
}
