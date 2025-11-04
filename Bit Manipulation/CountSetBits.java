package BitManipulation;

public class CountSetBits {
    public static void main(String[] args) {

    }
    public static int countSetBits(int n) {
        if(n<=0){
            return 0;
        }
        int x=find(n);
        int a=x*(1<<(x-1));//bit upto 2x
        int b=n-(1<<x)+1;//MSB bits from 2x to n
        return a+b+countSetBits(n-(1<<x));
    }
    public static int find(int n){
        int x=0;
        while((1<<x)<=n){
            x++;
        }
        return x-1;
    }
}
