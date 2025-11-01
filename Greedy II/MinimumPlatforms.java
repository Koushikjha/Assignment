package GreedyII;

import java.util.Arrays;

public class MinimumPlatforms {
    public static void main(String[] args) {

    }
    public int minPlatform(int arr[], int dep[]) {
        Arrays.sort(arr);
        Arrays.sort(dep);
        int i=0,j=0,c=0;
        int ans=0;
        while(i<arr.length && j<dep.length){
            if(arr[i]<=dep[j]){
                i++;
                c++;
            }else{
                c--;
                j++;

            }
            ans=Math.max(c,ans);
        }
        return ans;
    }
}
