import util.TreeNode;

/**
 * Second solution to Balanced Binary Tree
 *
 * Created by Nutcave on 1/10/2017.
 */
public class BalancedBinaryTree2 {

    int isBalanced=1;
    public int isBalanced(TreeNode a) {
        getHeight(a);
        return isBalanced;

    }

    public int getHeight(TreeNode a){
        if(a==null){
            return 0;
        }

        int left=getHeight(a.left);
        int right=getHeight(a.right);


        if(Math.abs(left-right)>1){
            isBalanced=0;
        }

        return Math.max(left,right) +1;
    }
}
