package fastslowpointers;

import util.ListNode;

/**
 *
 *
 * 82. Remove Duplicates from Sorted List II
 *
 * Given the head of a sorted linked list, delete all nodes that have duplicate numbers, leaving only distinct numbers from the original list. Return the linked list sorted as well.
 *
 *
 * Input: head = [1,2,3,3,4,4,5]
 * Output: [1,2,5]
 *
 */
public class RemoveDuplicateFromSortedList2 {

    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy=new ListNode(-111,head);
        ListNode cur=dummy.next;
        ListNode prev=dummy;

        while(cur != null){

            if(cur.next == null){
                break;
            }


            boolean foundDupe=false;
            while(cur.next != null && cur.val == cur.next.val){
                cur.next=cur.next.next;
                foundDupe=true;
            }

            if(foundDupe){
                prev.next=cur.next;
            }else{
                prev=cur;
            }
            cur=cur.next;


        }

        return dummy.next;

    }
}
