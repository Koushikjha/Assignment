package BackTrackingII;
import java.util.*;
public class Combination {
    public static void main(String[] args) {

    }
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans=new ArrayList<>();
        find(n,k,new ArrayList<>(),ans,1);
        return ans;
    }
    public void find(int n,int k,List<Integer> p,List<List<Integer>> ans,int start){
        if(start>n+1){
            return ;
        }
        if(p.size()==k){
            ans.add(new ArrayList<>(p));
            return ;
        }


        for(int i=start;i<=n;i++){
            p.add(i);
            find(n,k,p,ans,i+1);
            p.remove(p.size()-1);
        }

    }
}
