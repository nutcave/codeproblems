package fastslow;

import util.ListNode;

public class PalindromeLinkedList {

    public boolean isPalindrome(ListNode head) {

        ListNode slow=head;
        ListNode fast=head;

        while(fast != null && fast.next != null){
            slow=slow.next;
            fast=fast.next.next;
        }


        ListNode revHead=reverse(slow);

        while(revHead!= null && head != null){
            if( revHead.val != head.val ){
                return false;
            }
            revHead=revHead.next;
            head=head.next;
        }


        return revHead == null || head == null;


    }

    public ListNode reverse(ListNode node){
        ListNode prev=null;
        ListNode cur=node;

        while(cur != null){
            ListNode tmp= cur.next;
            cur.next=prev;
            prev=cur;
            cur=tmp;
        }
        return prev;
    }


    public static void main(String[] args) {
        ListNode node = new ListNode(1);
        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(1);
        node.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = null;

        new PalindromeLinkedList().isPalindrome(node);
    }
}
