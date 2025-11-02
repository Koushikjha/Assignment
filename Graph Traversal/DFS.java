package GraphTraversal;
import java.util.*;
public class DFS {
    public static void main(String[] args) {

    }
    public ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> adj) {
        // Code here
        ArrayList<Integer> res=new ArrayList<>();
        boolean[] visited=new boolean[adj.size()];
        for(int i=0;i<visited.length;i++){
            if(!visited[i]){
                dfs(i,visited,adj,res);
            }
        }
        return res;
    }
    public static void dfs(int i,boolean[] visited,ArrayList<ArrayList<Integer>> list,ArrayList<Integer> res){
        visited[i]=true;
        res.add(i);
        for(int boundary : list.get(i)){
            if(!visited[boundary]){
                dfs(boundary,visited,list,res);
            }
        }
    }
}
