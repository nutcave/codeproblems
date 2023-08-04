package fastslow;

import util.ListNode;

public class ReorderedList {

    public void reorderList(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode second = reverse(slow);
        ListNode first = head;

        while (first != null && second != null) {
            ListNode tmp = first.next;
            first.next = second;
            first = tmp;

            tmp = second.next;
            second.next = first;
            second = tmp;
        }

        if (first != null)
            first.next = null;
    }

    public ListNode reverse(ListNode head) {
        ListNode prev = null;

        while (head != null) {
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }

        return prev;
    }

    public static void main(String[] args) {
        ListNode node = new ListNode(1);
        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(3);
        ListNode node3 = new ListNode(4);
        node.next = node1;
        node1.next = node2;
        node2.next = null;
        node3.next = null;

        new ReorderedList().reorderList(node);

    }

}
