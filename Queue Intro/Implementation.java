package QueueIntro;

public class Implementation {
    int size=1000;
    int[] arr=new int[size];
    int front=-1;
    int rear=-1;
    // Constructor
    public Implementation(int n) {
        // Define Data Structures
    }

    public boolean isEmpty() {
        return (front == -1);
    }

    public boolean isFull() {
        return ((rear + 1) % size == front);
    }

    public void enqueue(int x) {
        if (isFull()) return;
        if (isEmpty()) front = 0;
        rear = (rear + 1) % size;
        arr[rear] = x;
    }

    public void dequeue() {
        if (isEmpty()) return;
        if (front == rear) front = rear = -1;
        else front = (front + 1) % size;
    }

    public int getFront() {
        if (isEmpty()) return -1;
        return arr[front];
    }

    public int getRear() {
        if (isEmpty()) return -1;
        return arr[rear];
    }

    public static void main(String[] args) {
        Implementation ip=new Implementation(5);
    }
}
