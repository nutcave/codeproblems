import util.ListNode;

/**
 * Created by Nutcave on 1/16/2017.
 */
public class ReverseLinkedList {

    public ListNode reverseList(ListNode a) {

        ListNode cur=a;
        ListNode prev=null;
        while(cur != null){

            ListNode tmp=cur.next;
            cur.next=prev;

            prev=cur;
            cur=tmp;

        }

        return prev;

    }
}
