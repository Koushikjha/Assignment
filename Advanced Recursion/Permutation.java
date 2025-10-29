package AdvancedRecursion;
import java.util.*;
public class Permutation {
    public static void main(String[] args) {

    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list=new ArrayList<>();
        find(nums,list,new ArrayList<>(),0);
        return list;
    }
    public void find(int[] nums,List<List<Integer>> list,List<Integer> p,int index){
        if(index==nums.length){
            list.add(new ArrayList<>(p));
            return ;
        }
        int val=nums[index];
        for(int i=0;i<=p.size();i++){
            p.add(i,val);
            find(nums,list,p,index+1);
            p.remove(i);
        }
    }
}
