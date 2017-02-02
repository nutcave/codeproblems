import util.ListNode;

/**
 * Created by Nutcave on 1/17/2017.
 */
public class ReverseLinkedList2 {

    public ListNode reverseBetween(ListNode a, int m, int n) {

        ListNode dum=new ListNode(0);
        dum.next=a;


        ListNode pre= dum;

        for(int i=0; i< m-1 ; ++i){
            pre=pre.next;

        }

        ListNode end=pre.next;
        ListNode prev=pre;
        ListNode cur=pre.next;

        int i1 = n - m + 1;
        for(int i=0; i< i1; ++i){
            ListNode tmp= cur.next;
            cur.next=prev;
            prev=cur;
            cur=tmp;
        }

        pre.next=prev;
        end.next=cur;

        return dum.next;


    }

    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(3);
        ListNode listNode4 = new ListNode(4);

        listNode.next=listNode2;
        listNode2.next=listNode3;
        listNode3.next=listNode4;

        ListNode listNode1 = new ReverseLinkedList2().reverseBetween(listNode, 2, 3);
        System.out.println(listNode1);

    }
}
