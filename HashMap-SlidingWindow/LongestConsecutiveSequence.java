package HashMapSlidingWindow;
import java.util.*;
public class LongestConsecutiveSequence {
    public static void main(String[] args) {

    }
    public int longestConsecutive(int[] nums) {
        Set<Integer> set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        int ans=0;
        for(int num: set){
            if(!set.contains(num-1)){
                int streak=1;
                int current=num;
                while(set.contains(current+1)){
                    streak++;
                    current++;
                }
                ans=Math.max(ans,streak);
            }
        }
        return ans;
    }
}
