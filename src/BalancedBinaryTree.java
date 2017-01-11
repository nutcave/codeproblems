import util.TreeNode;

/**
 * Created by Nutcave on 1/10/2017.
 */
public class BalancedBinaryTree {

    public int isBalanced(TreeNode a) {

        if(a==null){
            return 1;
        }

        int left=getHeight(a.left);
        int right=getHeight(a.right);


        if( (Math.abs(left - right) <= 1)
                && isBalanced(a.left) == 1
                && isBalanced(a.right) == 1 ){
            return 1;
        }


        return 0;

    }

    public int getHeight(TreeNode a){
        if(a==null){
            return 0;
        }

        return Math.max(getHeight(a.left),getHeight(a.right)) +1;
    }
}
