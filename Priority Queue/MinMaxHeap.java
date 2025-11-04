package PriorityQueue;
import java.util.*;
public class MinAndMaxHeap {
    public static void main(String[] args) {

    }
    public static ArrayList<Integer> buildHeap(ArrayList<Integer> heap, int n) {
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(heap, n, i);
        }
        return heap;
    }

    static void heapify(ArrayList<Integer> heap, int n, int i) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < n && heap.get(left) > heap.get(largest))
            largest = left;

        if (right < n && heap.get(right) > heap.get(largest))
            largest = right;

        if (largest != i) {
            int temp = heap.get(i);
            heap.set(i, heap.get(largest));
            heap.set(largest, temp);
            heapify(heap, n, largest);
        }
    }
}
