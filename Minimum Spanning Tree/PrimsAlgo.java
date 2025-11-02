package MinimumSpanningTree;
import java.util.*;
public class PrimsAlgo {
    public static void main(String[] args) {

    }
    public int spanningTree(int V, int[][] edges) {
        List<List<int[]>> list=new ArrayList<>();
        for(int i=0;i<V;i++){
            list.add(new ArrayList<>());
        }
        for(int[] p : edges){
            list.get(p[0]).add(new int[]{p[2],p[1]});
            list.get(p[1]).add(new int[]{p[2],p[0]});
        }
        PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)->Integer.compare(a[0],b[0]));
        pq.offer(new int[]{0,0});
        int sum=0;
        int[] vis=new int[V];
        while(!pq.isEmpty()){
            int[] arr=pq.remove();
            int d=arr[0];
            int u=arr[1];
            if(vis[u]==1){
                continue;
            }
            vis[u]=1;
            sum+=d;
            for(int[] p : list.get(u)){
                int w=p[0];
                int v=p[1];
                if(vis[v]==0){
                    pq.offer(new int[]{w,v});
                }
            }
        }
        return sum;
    }
}
