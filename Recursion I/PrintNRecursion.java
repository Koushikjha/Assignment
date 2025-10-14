package RecursionI;

public class PrintNRecursion {
    public static void main(String[] args) {
        printTillN(10);
    }
    public static void printTillN(int N) {
        find(N);
    }
    public static void find(int n){
        if(n==0){
            return ;
        }
        find(n-1);
        System.out.print(n+" ");
    }
}
