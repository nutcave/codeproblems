package fastslowpointers;

import util.ListNode;

/**
 *
 * 83. Remove Duplicates from Sorted List
 * https://leetcode.com/problems/remove-duplicates-from-sorted-list/
 *
 * Given the head of a sorted linked list, delete all duplicates such that each element appears only once. Return the linked list sorted as well.
 *
 * Input: head = [1,1,2,3,3]
 * Output: [1,2,3]
 *
 */
public class RemoveDuplicateFromSortedList {

    public ListNode deleteDuplicates(ListNode head) {

        ListNode node=head;

        while(node != null){
            if(node.next == null){
                break;
            }

            if(node.val == node.next.val){
                node.next=node.next.next;
            }else{
                node=node.next;
            }
        }
        return head;

    }
}
