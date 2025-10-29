package BackTrackingII;
import java.util.*;
public class CombinationSum {
    public static void main(String[] args) {

    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<Integer> p=new ArrayList<>();
        Arrays.sort(candidates);
        List<List<Integer>> list=letter(candidates,p,target,0);
        return list;
    }
    public static List<List<Integer>> letter(int[] arr, List<Integer> p, int target,int start) {
        if (target == 0) {
            List<List<Integer>> list = new ArrayList<>();
            list.add(new ArrayList<>(p));
            return list;
        }

        if (target < 0) {
            return new ArrayList<>();
        }

        List<List<Integer>> list = new ArrayList<>();
        for (int i = start; i < arr.length; i++) {
            p.add(arr[i]);
            list.addAll(letter(arr, p, target - arr[i],i));
            p.remove(p.size() - 1);
        }
        return list;
    }
}
