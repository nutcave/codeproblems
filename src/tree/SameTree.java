package tree;

import util.TreeNode;

/**
 *
 *
 * Given two binary trees, write a function to check if they are equal or not.

 Two binary trees are considered equal if they are structurally identical and the nodes have the same value.

 Return 0 / 1 ( 0 for false, 1 for true ) for this problem


 * Created by Nutcave on 1/3/2017.
 */
public class SameTree {


    public int isSameTree(TreeNode a, TreeNode b) {

        if(a == null && b== null){
            return 1;
        }else if(a == null || b==null){
            return 0;
        }

        if( a.val != b.val){
            return 0;
        }

        int l=isSameTree(a.left,b.left);
        int r = isSameTree(a.right,b.right);




        return Math.min(Math.min(l,r), 1);


    }

}
