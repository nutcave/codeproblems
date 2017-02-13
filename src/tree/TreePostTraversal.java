package tree;

import util.TreeNode;

import java.util.ArrayList;
import java.util.Stack;

/**
 * Created by Nutcave on 1/23/2017.
 */
public class TreePostTraversal {

    public ArrayList<Integer> postorderTraversal(TreeNode a) {

        ArrayList<Integer> arr= new ArrayList<>();
        Stack<TreeNode> st= new Stack<>();

        st.push(a);
        while(!st.isEmpty()){

            TreeNode n= st.peek();

            if(n.left == null && n.right == null){
                arr.add(st.pop().val);
            }

            if(n.right != null){
                st.push(n.right);
                n.right=null;

            }

            if(n.left != null){
                st.push(n.left);
                n.left=null;

            }



        }

        return arr;


    }
}
