package ArrayIII;

import java.util.*;

public class IntersectionTwoArrays {
    public static void main(String[] args) {
        int[]  nums1={1,2,2,3};
        int[] nums2={2,2};
        System.out.println(Arrays.toString(intersection(nums1,nums2)));
    }
    public static int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        Set<Integer> set=new HashSet<>();
        int i=0,j=0;
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]<nums2[j]){
                i++;
            }else if(nums1[i]>nums2[j]){
                j++;
            }else{
                set.add(nums1[i]);
                i++;
                j++;
            }
        }
        int[] ans=new int[set.size()];
        int k=0;
        for(int num : set){
            ans[k++]=num;
        }
        return ans;
    }
}
