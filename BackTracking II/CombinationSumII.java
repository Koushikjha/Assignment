package BackTrackingII;
import java.util.*;
public class CombinationSumII {
    public static void main(String[] args) {

    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> list=new ArrayList<>();
        Arrays.sort(candidates);
        find(candidates,target,0,new ArrayList<>(),list);
        return list;
    }
    void find(int[] candidates,int target,int start,List<Integer> p,List<List<Integer>> list){
        if(target==0){
            list.add(new ArrayList<>(p));
            return;
        }
        if(target<0){
            return ;
        }
        for(int i=start;i<candidates.length;i++){
            if(i>start && candidates[i]==candidates[i-1]){
                continue;
            }
            p.add(candidates[i]);
            find(candidates,target-candidates[i],i+1,p,list);
            p.remove(p.size()-1);
        }
    }
}
