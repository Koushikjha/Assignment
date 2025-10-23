package LinkedListII;

public class RemoveDuplicatesSorted {
    static class ListNode{
        int val;
        ListNode next;
        ListNode(int data){
            this.val=data;
        }
    }
    public ListNode deleteDuplicates(ListNode head) {
        ListNode temp=head;
        while(temp!=null){
            if(temp.next==null){
                break;
            }
            while(temp.next!=null && temp.next.val==temp.val){
                temp.next=temp.next.next;
            }
            temp=temp.next;
        }
        return head;
    }

    public static void main(String[] args) {

    }
}
