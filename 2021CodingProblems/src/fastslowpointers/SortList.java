package fastslowpointers;

import util.ListNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * 148. Sort List
 *
 * Given the head of a linked list, return the list after sorting it in ascending order.
 *
 * Follow up: Can you sort the linked list in O(n logn) time and O(1) memory (i.e. constant space)?
 *
 *
 * Input: head = [-1,5,3,4,0]
 * Output: [-1,0,3,4,5]
 */
public class SortList {

    public ListNode sortList(ListNode head) {

        List<ListNode> ls=new ArrayList<>();
        ListNode iter=head;
        while(iter != null){
            ls.add(iter);
            iter=iter.next;
        }

        Collections.sort(ls, (o1, o2)-> o1.val - o2.val);

        ListNode res=null;

        for(ListNode n: ls){
            if(res==null){
                res=new ListNode(n.val, null);
                head=res;
            }else{
                res.next=new ListNode(n.val, null);
                res=res.next;
            }

        }

        return head;

    }


    /**
     * Merge sort solution
     * @param head
     * @return
     */
    public ListNode sortList2(ListNode head) {
        if (head == null || head.next == null)
            return head;

        // step 1. cut the list to two halves
        ListNode prev = null, slow = head, fast = head;

        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        prev.next = null;

        // step 2. sort each half
        ListNode l1 = sortList2(head);
        ListNode l2 = sortList2(slow);

        // step 3. merge l1 and l2
        return merge(l1, l2);
    }

    ListNode merge(ListNode l1, ListNode l2) {
        ListNode l = new ListNode(0), p = l;

        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                p.next = l1;
                l1 = l1.next;
            } else {
                p.next = l2;
                l2 = l2.next;
            }
            p = p.next;
        }

        if (l1 != null)
            p.next = l1;

        if (l2 != null)
            p.next = l2;

        return l.next;
    }


    public static void main(String[] args) {
        new SortList().sortList2(new ListNode(4,new ListNode(2,new ListNode(1,new ListNode(3,null)))));
    }
}
