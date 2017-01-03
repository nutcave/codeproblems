import util.TreeNode;

/**
 *
 * Given a binary tree, find its minimum depth.

 The minimum depth is the number of nodes along the shortest path from the root node down to the nearest leaf node.


 * Created by Nutcave on 1/3/2017.
 */
public class MinDepthBinaryTree {

    public int minDepth(TreeNode a) {
        if(a == null){
            return 0;
        }

        if(a.left == null && a.right== null){
            return 1;
        }



        if(a.left == null){
            return minDepth(a.right) + 1;
        }

        if(a.right == null ){
            return minDepth(a.left) + 1;
        }


        return Math.min(minDepth(a.left),minDepth(a.right)) + 1;

    }
}
