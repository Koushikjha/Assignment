package ArrayI;
import java.util.*;
public class CountMaxFreqElement {
    public static void main(String[] args) {
        int[] nums={1,2,2,3,1,4};
        System.out.println(maxFrequencyElements(nums));

    }
    public static int maxFrequencyElements(int[] arr) {
        int max=0;
        Map<Integer,Integer> map=new HashMap<>();
        for(int num : arr){
            map.putIfAbsent(num,0);
            map.put(num,map.get(num)+1);
            max=Math.max(max,map.get(num));
        }
        int ans=0;
        for(int val : map.values()){
            if(val==max){
                ans+=val;
            }
        }
        return ans;

    }
}
