package ArrayIII;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] nums={5,4,3,2,1};
        sort(nums);
        System.out.println(Arrays.toString(nums));
    }
    public static void sort(int[] nums){
        int n=nums.length;
        for(int i=0;i<n-1;i++){
            int minindex=i;
            for(int j=i+1;j<n;j++){
                if(nums[j]<nums[minindex]){
                    minindex=j;
                }
            }
            int temp=nums[minindex];
            nums[minindex]=nums[i];
            nums[i]=temp;
        }
    }
}
