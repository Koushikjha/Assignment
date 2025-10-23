package LinkedListII;

import LinkedListI.MiddleOfLL;

public class AddTwoNumbers {
    static class ListNode{
        int val;
        ListNode next;
        ListNode(int data){
            this.val=data;
        }
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        String p="";
        ListNode temp1=l1;
        ListNode temp2=l2;
        ListNode dummy=new ListNode(-1);
        ListNode curr=dummy;
        int quo=0;
        while(temp1!=null && temp2!=null){
            int sum=temp1.val+temp2.val+quo;
            int rem=sum%10;
            ListNode node=new ListNode(rem);
            curr.next=node;
            curr=curr.next;
            quo=sum/10;
            temp1=temp1.next;
            temp2=temp2.next;
        }
        while(temp1!=null){
            int sum=temp1.val+quo;
            int rem=sum%10;
            ListNode node=new ListNode(rem);
            curr.next=node;
            curr=curr.next;
            quo=sum/10;
            temp1=temp1.next;
        }
        while(temp2!=null){
            int sum=temp2.val+quo;
            int rem=sum%10;
            ListNode node=new ListNode(rem);
            curr.next=node;
            curr=curr.next;
            quo=sum/10;
            temp2=temp2.next;
        }
        if(quo>0){
            curr.next=new ListNode(quo);
        }
        return dummy.next;
    }

    public static void main(String[] args) {

    }
}
