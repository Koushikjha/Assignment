package LinkedListI;

import LinkedListIntro.LenghtOfLL;

public class MiddleOfLL {
    static class ListNode{
        int val;
        ListNode next;
        ListNode(int data){
            this.val=data;
        }
    }
    public static ListNode middleNode(ListNode head) {
        ListNode fast=head;
        ListNode slow=head;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        return slow;
    }

    public static void main(String[] args) {

    }
}
