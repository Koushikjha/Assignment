package HashMapSlidingWindowII;
import java.util.*;
public class LargestSubrray0Sum {
    public static void main(String[] args) {

    }
    int maxLength(int arr[]) {
        Map<Integer,Integer> map=new HashMap<>();
        map.put(0,-1);
        int ans=0;
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(map.containsKey(sum)){
                ans=Math.max(ans,i-map.get(sum));
            }else{
                map.put(sum,i);
            }
        }
        return ans;
    }
}
