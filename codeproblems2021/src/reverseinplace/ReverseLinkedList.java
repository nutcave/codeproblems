package reverseinplace;

import util.ListNode;

public class ReverseLinkedList {

    public ListNode reverseList(ListNode head) {
        ListNode prev=null;

        while(head != null){
            ListNode tmp=head.next;
            head.next=prev;
            prev=head;
            head=tmp;

        }

        return prev;
    }

    public static void main(String[] args) {
        new ReverseLinkedList().reverseList(new ListNode(1,new ListNode(2,new ListNode(3,new ListNode(4,new ListNode(5,null))))));
    }
}
