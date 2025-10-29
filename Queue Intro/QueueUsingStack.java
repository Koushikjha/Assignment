package QueueIntro;
import java.util.*;
public class QueueUsingStack {
    public static void main(String[] args) {

    }
    Stack<Integer> first;
    Stack<Integer> second;
    public QueueUsingStack() {
        first=new Stack<>();
        second=new Stack<>();
    }

    public void push(int x) {
        first.push(x);
    }

    public int pop() {
        while(!first.isEmpty()){
            second.push(first.pop());
        }
        int x=second.pop();
        while(!second.isEmpty()){
            first.push(second.pop());
        }
        return x;
    }

    public int peek() {
        while(!first.isEmpty()){
            second.push(first.pop());
        }
        int x=second.peek();
        while(!second.isEmpty()){
            first.push(second.pop());
        }
        return x;
    }

    public boolean empty() {
        if(first.isEmpty()){
            return true;
        }
        return false;
    }
}
