import util.ListNode;

/**
 *
 * Detect cycle in
 * Created by Nutcave on 1/16/2017.
 */
public class DetectCycleLinkedList {

    public ListNode detectCycle(ListNode a) {

        ListNode slow=a;
        ListNode fast=a;

        while(fast != null &&  fast.next != null){

            fast=fast.next.next;
            slow=slow.next;

            if(fast == slow){

                return findFirst(slow,a);

            }
        }

        return null;

    }

    public ListNode findFirst(ListNode loop, ListNode head){
        ListNode ptr1=head;
        ListNode ptr2=loop;


        while(true){

            while(ptr2.next != loop && ptr2.next != ptr1){
                ptr2= ptr2.next;
            }

            if(ptr2.next == ptr1){
                return ptr1;
            }

            ptr2=loop;
            ptr1=ptr1.next;

        }
    }
    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(3);
        ListNode listNode4 = new ListNode(4);

        listNode.next=listNode2;
        listNode2.next=listNode3;
        listNode3.next=listNode4;
        listNode4.next=listNode2;

        new DetectCycleLinkedList().detectCycle(listNode);

    }
}
