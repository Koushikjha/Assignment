package RecursionII;

public class TowerOfHanoi {
    public static void main(String[] args) {
        System.out.println(towerOfHanoi(2,1,2,3));
    }
    public static int towerOfHanoi(int n, int from, int to, int aux) {
        if(n==1){
            return 1;
        }
        return towerOfHanoi(n-1,from,aux,to)+towerOfHanoi(n-1,aux,to,from)+1;
    }
}
