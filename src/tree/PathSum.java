package tree;

import util.TreeNode;

/**
 * Created by Nutcave on 1/10/2017.
 */
public class PathSum {

    int target;

    public int hasPathSum(TreeNode a, int b) {

        target=b;

        return hasPathSumHelper(a,0);

    }

    public int hasPathSumHelper(TreeNode a, int sum){
        if(a == null){
            return 0;
        }

        int curSum=a.val + sum;
        if(a.left == null && a.right == null){
            return (target == curSum)? 1:0;
        }

        int left= hasPathSumHelper(a.left, curSum);
        int right= hasPathSumHelper(a.right,curSum);


        return Math.max(left,right);

    }
}
