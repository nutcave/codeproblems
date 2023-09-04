package dfs;

import util.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * https://leetcode.com/problems/path-sum-ii/description/
 *
 * Given the root of a binary tree and an integer targetSum, return all root-to-leaf paths where the sum of the node values in the path equals targetSum. Each path should be returned as a list of the node values, not node references.
 *
 * A root-to-leaf path is a path starting from the root and ending at any leaf node. A leaf is a node with no children.
 *
 *
 */
public class PathSum2 {

    List<List<Integer>> res= new ArrayList<>();

    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {

        helper(root, targetSum, new ArrayList<>());
        return res;
    }

    public void helper(TreeNode root, int targetSum, List<Integer> path) {
        if(root == null){
            return;
        }

        int currentSum= targetSum - root.val;
        path.add(root.val);
        if(root.right == null && root.left == null && currentSum ==0){
            res.add(new ArrayList<>(path));
        }else{
            helper(root.right, currentSum, path);
            helper(root.left, currentSum, path);
        }
        path.remove(path.size()-1);

    }

}
