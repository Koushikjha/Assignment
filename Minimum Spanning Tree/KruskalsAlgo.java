package MinimumSpanningTree;
import java.util.*;
public class KruskalsAlgo {
    public static void main(String[] args) {

    }
    int[] rank;
    int[] parent;
    public int spanningTree(int V, int[][] edges) {
        Arrays.sort(edges,(a,b)->Integer.compare(a[2],b[2]));
        rank=new int[V];
        parent=new int[V];
        for(int i=0;i<V;i++){
            parent[i]=i;
        }
        int sum=0;
        for(int[] p : edges){
            int u=p[0];
            int v=p[1];
            int wt=p[2];
            int pu=get(u);
            int pv=get(v);
            if(pu==pv){
                continue;
            }
            sum+=wt;
            if(pu<pv){
                parent[pu]=pv;
            }else if(pu>pv){
                parent[pv]=pu;
            }else{
                parent[pv]=pu;
                rank[pu]=rank[pu]+1;
            }
        }
        return sum;
    }
    int get(int node){
        if(node==parent[node]){
            return node;
        }
        int p=get(parent[node]);
        parent[node]=p;
        return parent[node];
    }

}
