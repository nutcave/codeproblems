import util.TreeNode;

import java.util.ArrayList;
import java.util.Stack;

/**
 * Created by Nutcave on 1/11/2017.
 */
public class TreeInOrderNoRecursion {


    ArrayList<Integer> arr = new ArrayList<>();
    Stack<TreeNode> st = new Stack<>();

    public ArrayList<Integer> inorderTraversal(TreeNode a) {

        st.push(a);
        while (!st.isEmpty()) {

            a = st.peek();
            if (a.left != null) {

                st.push(a.left);
                a.left = null;


            } else {
                st.pop();
                arr.add(a.val);
                if (a.right != null) {
                    st.push(a.right);
                }
            }
        }


        return arr;

    }

}
