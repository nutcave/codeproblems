package linkedlist;

import util.ListNode;

/**
 *
 * You are given two linked lists representing two non-negative numbers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.

 Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 Output: 7 -> 0 -> 8

 * Created by Nutcave on 1/16/2017.
 */
public class AddTwoLists {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {


        ListNode res=null;
        ListNode head=null;
        int carry=0;
        while( l1 != null || l2 != null){
            int v1= (l1==null)? 0 :l1.val;
            int v2= (l2==null)? 0 :l2.val;

            int result= v2 + v1+carry;
            carry = (result/10);
            result= result%10;

            if(res == null){
                res= new ListNode(result,null);
                head=res;
            }else{
                res.next=new ListNode(result);
                res=res.next;
            }

            if(l1 != null){
                l1=l1.next;
            }

            if(l2 != null){
                l2=l2.next;
            }


        }

        if(carry>0){
            res.next=new ListNode(carry);
        }

        return head;

    }
}
