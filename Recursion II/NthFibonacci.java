package RecursionII;

public class NthFibonacci {
    public static void main(String[] args) {
        System.out.println(nthFibonacci(5));
    }
    public static int nthFibonacci(int n) {
        // code here
        return find(n);
    }
    public static int find(int n){
        if(n==0 || n==1){
            return n;
        }
        return find(n-1)+find(n-2);
    }
}
