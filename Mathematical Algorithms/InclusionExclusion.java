package MathematicalAlgorithms;

public class InclusionExclusion {
    public static void main(String[] args) {

    }
    public int countDivisible(int n, int[] divisors) {
        int m = divisors.length;
        int count = 0;
        for (int mask = 1; mask < (1 << m); mask++) {
            long lcm = 1;
            int bits = 0;
            for (int i = 0; i < m; i++) {
                if ((mask & (1 << i)) != 0) {
                    bits++;
                    lcm = lcm(lcm, divisors[i]);
                    if (lcm > n) break;
                }
            }
            if (lcm > n) continue;
            if (bits % 2 == 1) count += n / lcm;
            else count -= n / lcm;
        }
        return count;
    }

    private long lcm(long a, long b) {
        return a / gcd(a, b) * b;
    }

    private long gcd(long a, long b) {
        while (b != 0) {
            long t = b;
            b = a % b;
            a = t;
        }
        return a;
    }
}
