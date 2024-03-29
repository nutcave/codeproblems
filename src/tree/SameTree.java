package tree;

import util.TreeNode;

/**
 *
 *
 Given the roots of two binary trees p and q, write a function to check if they are the same or not.

 Two binary trees are considered the same if they are structurally identical, and the nodes have the same value.


 */
public class SameTree {

    public boolean isSameTree(TreeNode p, TreeNode q) {

        // Equal nullity denotes that this branch is the same (local equality)
        // This is a base case, but also handles being given two empty trees
        if (p == null && q == null) return true;

            // Unequal nullity denotes that the trees aren't the same
            // Note that we've already ruled out equal nullity above
        else if (p == null || q == null) return false;

        // Both nodes have values; descend iff those values are equal
        // "&&" here allows for any difference to overrule a local equality
        if (p.val == q.val) return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);

        // If we're here, both nodes have values, and they're unequal, so the trees aren't the same
        return false;
    }


}
