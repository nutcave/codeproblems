import util.ListNode;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Nutcave on 1/16/2017.
 */
public class LinkedListIntersection {

    public ListNode getIntersectionNode(ListNode a, ListNode b) {

        Set<ListNode> s=new HashSet<>();

        ListNode ptr=a;
        while(ptr!=null){
            s.add(ptr);
            ptr=ptr.next;
        }

        ptr=b;
        while(ptr !=null){
            if(s.contains(ptr)){
                return ptr;
            }
            ptr=ptr.next;

        }

        return null;


    }
}
