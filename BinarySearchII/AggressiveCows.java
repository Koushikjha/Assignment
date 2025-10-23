package BinarySearchII;

import java.util.Arrays;

public class AggressiveCows {
    public static void main(String[] args) {

    }
    public int aggressiveCows(int[] stalls, int k) {
        Arrays.sort(stalls);
        int s=1;
        int e=stalls[stalls.length-1]-stalls[0];
        int result=0;
        while(s<=e){
            int mid=(s+e)/2;
            if(canPlace(stalls,k,mid)){
                result=mid;
                s=mid+1;
            }else{
                e=mid-1;
            }
        }
        return result;
    }
    public boolean canPlace(int[] arr,int cow,int distance){
        int count=1;
        int lastpos=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]-lastpos>=distance){
                count++;
                lastpos=arr[i];
            }
            if(count==cow){
                return true;
            }
        }
        return false;
    }
}
