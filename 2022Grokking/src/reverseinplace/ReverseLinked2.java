package reverseinplace;

import fastslow.ReorderedList;
import util.ListNode;

public class ReverseLinked2 {

    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode cur=head;
        ListNode prev=null;

        for(int i=0; cur != null && i< left - 1; i++){
            prev=cur;
            cur=cur.next;
        }



        ListNode lastNodeFirstPart=prev; // left -1 node

        ListNode lastNodeOfSubList=cur; //is val 2

        for(int i=0; cur != null && i < right - left + 1; i++){
            ListNode next=cur.next;
            cur.next=prev;
            prev=cur;
            cur=next;
        }

        //cur is right+1 now
        //prev is right
        if( lastNodeFirstPart != null){
            lastNodeFirstPart.next=prev;
        }else{
            head=prev; // left == 1 so lastNodeFirstPart is null
        }


        lastNodeOfSubList.next=cur;

        return head;

    }
    public static void main(String[] args) {
        ListNode node = new ListNode(1);
        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(3);
        ListNode node3 = new ListNode(4);
        ListNode node4 = new ListNode(5);
        node.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;

        new ReverseLinked2().reverseBetween(node, 2, 4);

    }

}
