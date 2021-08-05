package tree;

import util.TreeNode;

/**
 * Created by Nutcave on 1/23/2017.
 */
public class KSmallestInBST {

    int count = 0;
    int res = 0;

    public int kthSmallest(TreeNode root, int k) {
        inOrder(root, k);
        return res;

    }

    public void inOrder(TreeNode root, int k) {
        if (root == null) return;

        inOrder(root.left, k);
        count++;
        if (count == k) {
            res = root.val;
        }
        inOrder(root.right, k);

    }
}
