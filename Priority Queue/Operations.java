package PriorityQueue;
import java.util.*;
public class Operations {
    public static void main(String[] args) {

    }
    static void insert(PriorityQueue<Integer> q, int k) {
        q.add(k);

    }

    static boolean find(PriorityQueue<Integer> q, int k) {

        return q.contains(k);
    }

    static int delete(PriorityQueue<Integer> q) {

        return q.poll();
    }
}
