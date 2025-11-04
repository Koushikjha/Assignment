package MathematicalAlgorithms;

public class CatalanNumber {
    public static void main(String[] args) {

    }
    public int numTrees(int n) {
        long catalan = 1;
        for (int i = 0; i < n; i++) {
            catalan = catalan * 2 * (2 * i + 1) / (i + 2);
        }
        return (int)catalan;
    }
}
