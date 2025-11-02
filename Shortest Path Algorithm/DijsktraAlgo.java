package ShortestPathAlgo;
import java.util.*;
public class DijkstraAlgo {
    public static void main(String[] args) {

    }
    public int[] dijkstra(int V, int[][] edges, int src) {
        List<List<int[]>> list=new ArrayList<>();
        for(int i=0;i<V;i++){
            list.add(new ArrayList<>());
        }
        for(int[] p : edges){
            int u=p[0];
            list.get(u).add(new int[]{p[2],p[1]});
        }
        PriorityQueue<int[]> pq = new PriorityQueue<>(
                (a, b) -> Integer.compare(a[0], b[0])
        );
        int[] dist=new int[V];
        Arrays.fill(dist,Integer.MAX_VALUE);
        dist[src]=0;
        int[] source=new int[2];
        source[1]=src;
        pq.offer(source);
        while(!pq.isEmpty()){
            int[] arr=pq.remove();
            int x=arr[0];
            int u=arr[1];
            if(x>dist[u]){
                continue;
            }
            for(int[] neb : list.get(u)){
                int y=neb[0];
                int v=neb[1];
                if(y+x<dist[v]){
                    dist[v]=y+x;
                    int[] num=new int[2];
                    num[0]=x+y;
                    num[1]=v;
                    pq.offer(num);
                }
            }
        }
        return dist;
    }
}
