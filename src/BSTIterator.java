import util.TreeNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

/**
 * Created by Nutcave on 1/11/2017.
 */
public class BSTIterator {

    Stack<TreeNode> st=new Stack<TreeNode>();

    public BSTIterator(TreeNode root) {
        TreeNode n=root;
        while(n != null){
            st.push(n);
            n=n.left;
        }

    }


    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        return !st.isEmpty();

    }

    /** @return the next smallest number */
    public int next() {

        TreeNode n=st.pop();
        int result=n.val;

        if(n.right != null){

            n=n.right;
            while(n != null){
                st.push(n);
                n=n.left;
            }
        }

        return result;

    }

}
