package GreedyII;
import java.util.*;
public class ActivitySelection {
    public static void main(String[] args) {

    }
    public int activitySelection(int[] arr, int[] dep) {
        int[][] act=new int[arr.length][2];
        for(int i=0;i<arr.length;i++){
            act[i][0]=arr[i];
            act[i][1]=dep[i];
        }
        Arrays.sort(act,(a,b)->Integer.compare(a[1],b[1]));
        int cnt=1;
        int last=act[0][1];
        for(int i=1;i<act.length;i++){
            if(act[i][0]>last){
                cnt++;
                last=act[i][1];
            }
        }
        return cnt;
    }
}
