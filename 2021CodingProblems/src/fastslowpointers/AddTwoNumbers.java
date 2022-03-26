package fastslowpointers;

import util.ListNode;

public class AddTwoNumbers {

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

    public static void main(String[] args) {
        new AddTwoNumbers().addTwoNumbers(new ListNode(2,new ListNode(4,new ListNode(3,null))),new ListNode(5,new ListNode(6,new ListNode(4,null))));
    }


}
