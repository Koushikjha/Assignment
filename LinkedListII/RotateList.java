package LinkedListII;

public class RotateList {
    static class ListNode{
        int val;
        ListNode next;
        ListNode(int data){
            this.val=data;
        }
    }
    public ListNode rotateRight(ListNode head, int k) {
        ListNode tail=head;
        int size=1;
        if(tail==null){
            return head;
        }
        while(tail.next!=null){
            tail=tail.next;
            size++;
        }
        k=k%size;
        ListNode temp=head;
        for(int i=1;i<=k;i++){
            tail.next=temp;
            head=tail;
            temp=head;
            int index=1;
            while(index!=size){
                tail=tail.next;
                index++;
            }
            tail.next=null;
        }
        return head;
    }

    public static void main(String[] args) {

    }
}
