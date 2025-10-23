package LinkedListI;

import LinkedListIntro.LenghtOfLL;

public class ReverseLl {
    static class ListNode{
        int val;
        ListNode next;
        ListNode(int data){
            this.val=data;
        }
    }
    public ListNode reverseList(ListNode head) {
        ListNode prev=null;
        ListNode curr=head;
        while(curr!=null){
            ListNode newNode=curr.next;
            curr.next=prev;
            prev=curr;
            curr=newNode;
        }
        return prev;
    }

    public static void main(String[] args) {

    }
}
