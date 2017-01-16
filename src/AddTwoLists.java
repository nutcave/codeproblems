import util.ListNode;

/**
 *
 * You are given two linked lists representing two non-negative numbers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.

 Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 Output: 7 -> 0 -> 8

 * Created by Nutcave on 1/16/2017.
 */
public class AddTwoLists {

    public ListNode addTwoNumbers(ListNode a, ListNode b) {

        int carry=0;
        ListNode res=null;
        ListNode head=null;
        while(a != null ||  b != null){
            int valA= (a== null)? 0: a.val;
            int valB= (b== null)? 0: b.val;
            int v=valA + valB + carry;

            carry= v / 10;

            ListNode tmp= new ListNode( v % 10);
            if(res == null){
                head=tmp;
                res=tmp;
            }else{
                res.next=tmp;
                res=tmp;


            }

            // Move first and second pointers to next nodes
            if (a != null) {
                a = a.next;
            }
            if (b != null) {
                b = b.next;
            }
        }

        if(carry>0){
            res.next=new ListNode(carry);
        }

        return head;

    }
}
