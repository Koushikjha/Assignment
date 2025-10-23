package StackI;

import java.util.*;

public class SmallerOnLeft {
    public static void main(String[] args) {
        int[] arr={2, 3, 4, 5, 1};
        System.out.println(Arrays.toString(smallestonleft(arr,arr.length)));
    }
    public static int[] smallestonleft(int arr[], int n) {
        int[] ans=new int[n];
        TreeSet<Integer> set = new TreeSet<>();
        int k=0;
        for (int val : arr) {
            Integer smaller = set.lower(val);
            ans[k++]=(smaller != null ? smaller : -1);
            set.add(val);
        }
        return ans;
    }
}
