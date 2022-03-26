package reverseinplace;

import util.ListNode;

/**
 * Given a singly linked list, group all odd nodes together followed by the even nodes. Please note here we are talking about the node number and not the value in the nodes.
 *
 * You should try to do it in place. The program should run in O(1) space complexity and O(nodes) time complexity.
 *
 * Example 1:
 *
 * Input: 1->2->3->4->5->NULL
 * Output: 1->3->5->2->4->NULL
 * Example 2:
 *
 * Input: 2->1->3->5->6->4->7->NULL
 * Output: 2->3->6->7->1->5->4->NULL
 *
 */
public class OddEvenList {

    public ListNode oddEvenList(ListNode head) {

        ListNode odd=new ListNode(0,null);
        ListNode even=new ListNode(0,null);

        int counter=1;
        while(head !=null){

            ListNode tmp=head.next;
            head.next=null;
            ListNode cur= ((counter %2)!=0 ) ? odd:even;

            while(cur.next != null){
                cur=cur.next;
            }

            cur.next=head;

            head=tmp;
            counter++;
        }

        ListNode res=odd.next;
        ListNode cur=odd;
        while(cur.next != null){
            cur=cur.next;
        }
        cur.next=even.next;

        return res;


    }

    public ListNode oddEvenList2(final ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode odd = head;
        final ListNode eHead = head.next;
        ListNode even = eHead;
        while (even != null && even.next != null) {
            odd.next = even.next;
            odd = odd.next;
            even.next = odd.next;
            even = even.next;
        }

        odd.next = eHead;
        return head;
    }

    public static void main(String[] args) {
        new OddEvenList().oddEvenList2(new ListNode(1,new ListNode(2,new ListNode(3,new ListNode(4,new ListNode(5,null))))));
    }


}
