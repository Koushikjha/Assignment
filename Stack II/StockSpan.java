package StackII;
import java.util.*;

public class StockSpan {
    public static void main(String[] args) {
        StockSpan s=new StockSpan();
    }
    Stack<int[]> stack=new Stack<>();
    public StockSpan() {

    }

    public int next(int price) {
        int span = 1;

        while (!stack.isEmpty() && stack.peek()[0] <= price) {
            span += stack.pop()[1];
        }

        stack.push(new int[]{price, span});
        return span;
    }

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */
}
