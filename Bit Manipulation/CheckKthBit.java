package BitManipulation;

public class CheckKthBit {
    public static void main(String[] args) {

    }
    static boolean checkKthBit(int n, int k) {
        int mask=1<<k;
        return ((n&mask)!=0);
    }
}
