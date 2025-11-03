package HashMapSlidingWindowII;
import java.util.*;
public class Count0SumSubarray {
    public static void main(String[] args) {

    }
    public int findSubarray(int[] arr) {
        Map<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        int count=0;
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(map.containsKey(sum)){
                count+=map.get(sum);
            }
            map.putIfAbsent(sum,0);
            map.put(sum,map.get(sum)+1);
        }
        return count;
    }
}
