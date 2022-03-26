package fastslowpointers;

import util.ListNode;

public class IntersectionOfLinkedLists {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int listALength=0;
        int listBLength=0;
        ListNode curA=headA;
        ListNode curB=headB;

        while(curA != null){
            listALength++;
            curA=curA.next;
        }

        while(curB != null){
            listBLength++;
            curB=curB.next;
        }

        while(listALength > listBLength){
            listALength--;
            headA=headA.next;
        }


        while(listALength < listBLength){
            listBLength--;
            headB=headB.next;
        }

        while( headB != headA){
            headB=headB.next;
            headA=headA.next;
        }

        return headA;



    }

}
