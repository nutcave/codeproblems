package fastslow;

import util.ListNode;
import util.Node;

public class LinkedListCycle2 {

    public ListNode detectCycle(ListNode head) {

        ListNode slow = head;
        ListNode fast = head;


        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast)
                break;
        }

        if (fast == null || fast.next == null)
            return null;

        int length = 0;
        do{
            length++;
            fast = fast.next;
        }while(fast != slow);



        slow = head;
        fast = head;
        while (length > 0) {
            fast = fast.next;
            length--;
        }

        while (fast != slow) {
            fast = fast.next;
            slow = slow.next;
        }

        return slow;

    }

    public static void main(String[] args) {
        ListNode node = new ListNode(3);
        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(0);
        ListNode node3 = new ListNode(-4);
        node.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node1;

        new LinkedListCycle2().detectCycle(node);
    }
}
