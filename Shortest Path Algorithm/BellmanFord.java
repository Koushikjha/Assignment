package ShortestPathAlgo;
import java.util.*;
public class BellmanFord {
    public static void main(String[] args) {

    }
    public int[] bellmanFord(int V, int[][] edges, int src) {
        int[] dist=new int[V];
        int mod=1_000_000_00;
        Arrays.fill(dist,mod);
        dist[src]=0;
        for(int i=0;i<V;i++){
            for(int j=0;j<edges.length;j++){
                int u=edges[j][0];
                int v=edges[j][1];
                int wt=edges[j][2];
                if(dist[u]!=mod && dist[u]+wt<dist[v]){
                    dist[v]=dist[u]+wt;
                }
            }
        }
        for(int j=0;j<edges.length;j++){
            int u=edges[j][0];
            int v=edges[j][1];
            int wt=edges[j][2];
            if(dist[u]!=mod && dist[u]+wt<dist[v]){
                return new int[]{-1};
            }
        }
        return dist;
    }
}
