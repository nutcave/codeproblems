import util.ListNode;

/**
 * Created by Nutcave on 1/15/2017.
 */
public class RemoveNthLinkedList {

    public ListNode removeNthFromEnd(ListNode a, int b) {


        ListNode n = a;
        ListNode target=a;
        int ptr1=0;

        while(n.next != null){
            if(ptr1>b-1){
                target=target.next;

            }

            n=n.next;
            ptr1++;
        }

        //If n is greater than the size of the list, remove the first node of the list
        if(b>ptr1){
            return a.next;
        }


        //swap

        if(target.next ==null){
            return null;
        }
        target.next=target.next.next;



        return a;
    }

    public ListNode removeNthFromEnd2(ListNode head, int n) {
        if(head == null)
            return null;

        ListNode fast = head;
        ListNode slow = head;

        for(int i=0; i<n; i++){
            fast = fast.next;
        }

        //if remove the first node
        if(fast == null){
            head = head.next;
            return head;
        }

        while(fast.next != null){
            fast = fast.next;
            slow = slow.next;
        }

        slow.next = slow.next.next;

        return head;
    }

    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(3);
        ListNode listNode4 = new ListNode(4);

        listNode.next=listNode2;
        listNode2.next=listNode3;
        listNode3.next=listNode4;

        new RemoveNthLinkedList().removeNthFromEnd(listNode,1);
        new RemoveNthLinkedList().removeNthFromEnd2(listNode,2);
    }
}
