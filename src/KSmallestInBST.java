import util.TreeNode;

/**
 * Created by Nutcave on 1/23/2017.
 */
public class KSmallestInBST {

    int k;
    int res;
    public int kthsmallest(TreeNode root, int k) {
        this.k=k;


        inOrder(root);
        return res;

    }

    void inOrder(TreeNode root){

        if(root == null) return;
        if(k==0) return;

        inOrder(root.left);

        --k;
        if(k==0){
            res=root.val;
            return;
        }

        inOrder(root.right);

    }

}
