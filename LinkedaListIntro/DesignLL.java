package LinkedListIntro;

public class DesignLL {
    private static class Node {
        int data;
        Node next;
        Node(int data) { this.data = data; }
    }

    private static Node head;
    private static int size;

    public DesignLL() {
        head = null;
        size = 0;
    }

    public static int get(int index) {
        if (index < 0 || index >= size) return -1;
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp.data;
    }

    public static void addAtHead(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;
        size++;
    }

    public static void addAtTail(int val) {
        Node node = new Node(val);
        if (head == null) {
            head = node;
        } else {
            Node temp = head;
            while (temp.next != null) temp = temp.next;
            temp.next = node;
        }
        size++;
    }

    public static void addAtIndex(int index, int val) {
        if (index < 0 || index > size) return;
        if (index == 0) {
            addAtHead(val);
            return;
        }
        Node temp = head;
        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }
        Node node = new Node(val);
        node.next = temp.next;
        temp.next = node;
        size++;
    }

    public static void deleteAtIndex(int index) {
        if (index < 0 || index >= size) return;
        if (index == 0) {
            head = head.next;
        } else {
            Node temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
        }
        size--;
    }

    public static void main(String[] args) {

    }
}
