package LinkedListIntro;

public class LenghtOfLL {
    static class Node{
        int val;
        Node next;
        Node(int data){
            this.val=data;
        }
    }
    static Node head;
    public static int getCount(Node head) {
        int size=0;
        Node temp=head;
        while(temp!=null){
            temp=temp.next;
            size++;
        }
        return size;
    }

    public static void main(String[] args) {

    }
}
