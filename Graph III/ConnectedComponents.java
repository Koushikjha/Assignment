package GraphIII;
import java.util.*;
public class ConnectedComponents {
    public static void main(String[] args) {

    }
    public ArrayList<ArrayList<Integer>> getComponents(int V, int[][] edges) {
        // code here
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        for(int i=0;i<V;i++){
            adj.add(new ArrayList<>());
        }
        for(int[] d : edges){
            adj.get(d[0]).add(d[1]);
            adj.get(d[1]).add(d[0]);
        }
        ArrayList<ArrayList<Integer>> res=new ArrayList<>();
        boolean[] visited=new boolean[V];
        for(int i=0;i<visited.length;i++){

            if(!visited[i]){
                ArrayList<Integer> p=new ArrayList<>();
                dfs(i,visited,adj,p);
                res.add(new ArrayList<>(p));
            }
        }
        return res;
    }
    public static void dfs(int i,boolean[] visited,ArrayList<ArrayList<Integer>> list,ArrayList<Integer> res) {
        visited[i] = true;
        res.add(i);
        for (int boundary : list.get(i)) {
            if (!visited[boundary]) {
                dfs(boundary, visited, list, res);
            }
        }
    }
}
