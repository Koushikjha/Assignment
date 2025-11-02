package GraphIntro;
import java.util.*;
public class Implementation {
    public static void main(String[] args) {

    }
    public List<List<Integer>> printGraph(int V, int edges[][]) {
        adjacencyMatrix(V,edges);
        return adjacencyList(V,edges);
    }
    public int[][] adjacencyMatrix(int v,int[][] edges){
        int[][] mat=new int[v][v];
        for(int i=0;i<v;i++){
            mat[i][i]=1;
        }
        for(int[] p : edges){
            mat[p[0]][p[1]]=1;
            mat[p[1]][p[0]]=1;

        }
        return mat;
    }
    public List<List<Integer>> adjacencyList(int v,int[][] edges){
        List<List<Integer>> list=new ArrayList<>();
        for(int i=0;i<v;i++){
            list.add(new ArrayList<>());
        }
        for(int[] p : edges){
            list.get(p[0]).add(p[1]);
            list.get(p[1]).add(p[0]);
        }
        return list;
    }
}
