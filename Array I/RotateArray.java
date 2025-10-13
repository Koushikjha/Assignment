package ArrayI;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int[] num={1,2,3,4,5,6,7};
        int k=3;
        rotate(num,k);
        System.out.println(Arrays.toString(num));
    }
    public static void rotate(int[] nums, int k) {
        int n=nums.length;
        int time=k%n;
        reverse(nums,0,n-1);
        reverse(nums,0,time-1);
        reverse(nums,time,n-1);
    }
    public static void reverse(int[] nums,int start,int end){
        while(start<end){
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;

        }
    }
}
