package GraphIII;
import java.util.*;
public class DetectingCycles {
    public static void main(String[] args) {

    }
    public static boolean isCyclic(int V, int[][] edges) {
        List<List<Integer>> list=new ArrayList<>();
        for(int i=0;i<V;i++){
            list.add(new ArrayList<>());
        }
        for(int[] arr : edges) {
            int u = arr[0];
            int v = arr[1];
            list.get(u).add(v);
        }
        int[] vis=new int[V];
        int[] pathvis=new int[V];
        for(int i=0;i<V;i++){
            if(vis[i]==0){
                if(dfs(list,i,V,vis,pathvis)==true){
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean dfs(List<List<Integer>> list,int node,int v,int[] vis,int[] pathvis){
        vis[node]=1;
        pathvis[node]=1;
        for(int num : list.get(node)){
            if(vis[num]==0){
                if(dfs(list,num,v,vis,pathvis)==true){
                    return true;
                }
            }
            else if(pathvis[num]==1){
                return true;
            }
        }
        pathvis[node]=0;
        return false;
    }
}
