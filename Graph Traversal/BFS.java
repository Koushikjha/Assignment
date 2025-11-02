package GraphTraversal;
import java.util.*;
public class BFS {
    public static void main(String[] args) {

    }
    public ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj) {
        // code here
        Queue<Integer> queue=new LinkedList<>();
        ArrayList<Integer> res=new ArrayList<>();
        boolean[] visited=new boolean[adj.size()];
        for(int i=0;i< adj.size();i++){
            if(!visited[i]){
                bfs(i,visited,adj,res,queue);
            }
        }

        return res;
    }
    public void bfs(int node,boolean[] visited,ArrayList<ArrayList<Integer>> list,ArrayList<Integer> res,Queue<Integer> queue){
        queue.add(node);
        visited[node]=true;
        while(!queue.isEmpty()){
            int size= queue.size();
            for(int i=0;i<size;i++) {
                int neb = queue.poll();
                for (int neighbour : list.get(neb)) {
                    if (!visited[neighbour]) {
                        queue.add(neighbour);
                        visited[neighbour]=true;
                    }
                }
                res.add(neb);
            }
        }
    }
}
