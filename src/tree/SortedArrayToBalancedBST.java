package tree;

import util.TreeNode;

import java.util.Arrays;
import java.util.List;

/**
 *
 * 108. Convert Sorted Array to Binary Search Tree
 *
 * https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/
 *
 Given an integer array nums where the elements are sorted in ascending order, convert it to a height-balanced binary search tree.

 A height-balanced binary tree is a binary tree in which the depth of the two subtrees of every node never differs by more than one.

 Input: nums = [-10,-3,0,5,9]
 Output: [0,-3,9,-10,null,5]
 Explanation: [0,-10,5,null,-3,null,9] is also accepted:
 */
public class SortedArrayToBalancedBST {

    public TreeNode sortedArrayToBST(int[] nums) {
        return helper(nums,0,nums.length-1);

    }

    public TreeNode helper(int[] nums,int i, int j){

        if(i>j){
            return null;
        }

        int mid= (i+j)/2;
        int val = nums[mid];
        TreeNode node= new TreeNode(val);

        node.left=helper(nums,i,mid-1);
        node.right=helper(nums,mid+1,j);

        return node;

    }


    public static void main(String[] args) {

        new SortedArrayToBalancedBST().sortedArrayToBST(new int[]{-10,-3,0,5,9});
    }
}
