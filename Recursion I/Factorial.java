package RecursionI;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
    static int factorial(int n) {
        return find(n);
    }
    public static int find(int n){
        if(n==1){
            return 1;
        }
        return n*find(n-1);
    }
}
