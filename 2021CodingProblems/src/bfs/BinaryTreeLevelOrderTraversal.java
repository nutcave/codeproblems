package bfs;

import util.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


/**
 *
 * 102. Binary Tree Level Order Traversal
 *
 *
 * Given a binary tree, return the level order traversal of its nodes' values. (ie, from left to right, level by level).
 *
 * For example:
 * Given binary tree [3,9,20,null,null,15,7],
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 * return its level order traversal as:
 * [
 *   [3],
 *   [9,20],
 *   [15,7]
 * ]
 *
 */
public class BinaryTreeLevelOrderTraversal {

    public List<List<Integer>> levelOrder(TreeNode root) {

        List<List<Integer>> res= new ArrayList<>();
        if(root == null) return res;
        Queue<TreeNode> queue= new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            int size=queue.size();
            List<Integer> arr=new ArrayList<>();
            for(int i=0; i<size; i++){
                TreeNode node=queue.remove();
                if(node.left != null){
                    queue.add(node.left);
                }
                if(node.right != null)  {
                    queue.add(node.right);
                };
                arr.add(node.val);

            }
            res.add(arr);
        }

        return res;

    }




}
