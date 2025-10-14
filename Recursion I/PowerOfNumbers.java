package RecursionI;

public class PowerOfNumbers {
    public static void main(String[] args) {
        System.out.println(reverseExponentiation(2));
    }
    public static int reverseExponentiation(int n) {
        // code here
        int x=reverse(n);
        return find(n,x);
    }
    public static int reverse(int n){
        int s=0;
        while(n>0){
            int d=n%10;
            s=(s*10)+d;
            n/=10;
        }
        return s;
    }
    public static int find(int n,int x){
        if(x==0){
            return 1;
        }
        return n*find(n,x-1);
    }
}
