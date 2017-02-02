import util.TreeNode;

import java.util.ArrayList;
import java.util.Stack;

/**
 * Created by Nutcave on 1/23/2017.
 */
public class PreOrderTreeTraversal {

    public ArrayList<Integer> preorderTraversal(TreeNode a) {

        ArrayList<Integer> arr= new ArrayList<>();
        Stack<TreeNode> st= new Stack<>();

        st.push(a);
        while(!st.isEmpty()){

            TreeNode n= st.pop();

            arr.add(n.val);
            if (n.right != null) {

                st.push(n.right);

            }

            if(n.left != null){

                st.push(n.left);
            }

        }

        return arr;

    }
}
