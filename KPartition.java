package SWAYAM;

import java.util.*;

public class KPartition {

    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 3, 5, 2, 1};
        int k = 4;

        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < k; i++) result.add(new ArrayList<>());

        if (canPartitionKSubsets(arr, k, result)) {
            System.out.println("Partition possible. Subsets:");
            for (int i = 0; i < result.size(); i++) {
                System.out.println("Subset " + (i + 1) + ": " + result.get(i));
            }
        } else {
            System.out.println("No partition possible.");
        }
    }

    public static boolean canPartitionKSubsets(int[] arr, int k, List<List<Integer>> subsets) {
        int total = Arrays.stream(arr).sum();
        if (total % k != 0) return false;

        int target = total / k;
        Arrays.sort(arr);
        reverse(arr);
        int[] subsetSums = new int[k];
        return backtrack(0, arr, subsetSums, subsets, target);
    }

    private static boolean backtrack(int index, int[] arr, int[] subsetSums, List<List<Integer>> subsets, int target) {
        if (index == arr.length) {
            for (int sum : subsetSums)
                if (sum != target) return false;
            return true;
        }

        int num = arr[index];

        for (int i = 0; i < subsetSums.length; i++) {
            if (subsetSums[i] + num <= target) {
                subsetSums[i] += num;
                subsets.get(i).add(num);

                if (backtrack(index + 1, arr, subsetSums, subsets, target)) return true;

                subsetSums[i] -= num;
                subsets.get(i).remove(subsets.get(i).size() - 1);
            }

            if (subsetSums[i] == 0) break;
        }
        return false;
    }

    private static void reverse(int[] arr) {
        int i = 0, j = arr.length - 1;
        while (i < j) {
            int tmp = arr[i];
            arr[i] = arr[j];
            arr[j] = tmp;
            i++; j--;
        }
    }
}
