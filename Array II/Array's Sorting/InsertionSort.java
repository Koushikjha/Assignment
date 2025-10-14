package ArrayIII;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] nums={5,4,3,2,1};
        sort(nums);
        System.out.println(Arrays.toString(nums));
    }
    public static void sort(int[] arr){
        int n=arr.length;
        for(int i=1;i<n;i++){
            int key=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }
    }
}
