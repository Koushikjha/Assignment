package MathematicalAlgorithms;

import java.util.*;

class Permutations {
    public static void main(String[] args) {

    }
    public List<List<Integer>> permute(int[] nums) {
        int n = nums.length;
        int total = 1;
        for (int i = 2; i <= n; i++) total *= i; // n!

        List<List<Integer>> result = new ArrayList<>();

        for (int k = 0; k < total; k++) {
            int temp = k;
            List<Integer> tempList = new ArrayList<>();
            List<Integer> numbers = new ArrayList<>();
            for (int num : nums) numbers.add(num);

            for (int i = n; i >= 1; i--) {
                int fact = factorial(i - 1);
                int index = temp / fact;
                tempList.add(numbers.get(index));
                numbers.remove(index);
                temp %= fact;
            }

            result.add(tempList);
        }

        return result;
    }

    private int factorial(int n) {
        int f = 1;
        for (int i = 2; i <= n; i++) f *= i;
        return f;
    }
}
