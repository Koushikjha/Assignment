package RecursionI;

public class CountDigits {
    public static void main(String[] args) {
        System.out.println(evenlyDivides(2446));
    }
    static int evenlyDivides(int n) {
        int m=n;
        int c=0;
        while(m>0){
            int d=m%10;
            if(d!=0 && n%d==0){
                c++;
            }
            m/=10;
        }
        return c;
    }
}
