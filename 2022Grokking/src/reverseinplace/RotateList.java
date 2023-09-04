package reverseinplace;

import util.ListNode;

public class RotateList {
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null || k <= 0)
            return head;

        ListNode lastNode = head;

        int length = 1;

        while (lastNode.next != null) {
            lastNode = lastNode.next;
            length++;
        }

        k %= length;

        lastNode.next = head;
        int skipCount = length - k;
        ListNode lastNodeOfRotatedList = head;
        for (int i = 0; i < skipCount-1; i++) {
            lastNodeOfRotatedList = lastNodeOfRotatedList.next;

        }
        ListNode res = lastNodeOfRotatedList.next;
        lastNodeOfRotatedList.next = null;


        return res;

    }


    public static void main(String[] args) {
//        example1();
        example2();



    }

    private static void example1() {
        ListNode head = new ListNode(1);
        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(3);
        ListNode node3 = new ListNode(4);
        ListNode node4 = new ListNode(5);
        head.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        new RotateList().rotateRight(head, 1);
    }

    private static void example2() {
        ListNode head = new ListNode(0);
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);

        head.next = node1;
        node1.next = node2;
        node2.next = null;

        new RotateList().rotateRight(head, 4);
    }
}
