package StackImplementation;

public class DesignStack {
    private static final int STACK_CAPACITY = 101;
    private char[] stackArray = new char[STACK_CAPACITY];
    private int topIndex = -1;

    void push(char character) {
        if(topIndex==STACK_CAPACITY-1){
            System.out.println("Stack is full");
            return;
        }
        stackArray[++topIndex]=character;
    }

    char pop() {
        if(topIndex==-1){
            System.out.println("Stack is empty");
            return '\0';
        }
        return stackArray[topIndex--];
    }

    boolean isEmpty() {
        return topIndex == -1;
    }

    boolean isFull() {
        return topIndex >= STACK_CAPACITY - 1;
    }

    public static void main(String[] args) {

    }
}
