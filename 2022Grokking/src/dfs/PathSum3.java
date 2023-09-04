package dfs;

import util.TreeNode;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class PathSum3 {

    public int pathSum(TreeNode root, int targetSum) {
        return helper(root, targetSum, new LinkedList<>());
    }

    int helper(TreeNode root, int targetSum, List<Integer> path){
        if(root == null){
            return 0;
        }

        int count=0;
        long pathSum=0;

        path.add(root.val);
        ListIterator<Integer> ls = path.listIterator(path.size());
        while(ls.hasPrevious()){
            pathSum += ls.previous();

            if(targetSum == pathSum){
                count++;
            }
        }

        count += helper(root.left, targetSum, path);
        count += helper(root.right, targetSum, path);
        path.remove(path.size() -1);

        return count;

    }

    public static void main(String[] args) {
        TreeNode a= new TreeNode(1000000000);
        a.left = new TreeNode(1000000000);
        a.left.left=new TreeNode(294967296);
        a.left.left.left=new TreeNode(1000000000);
        a.left.left.left.left=new TreeNode(1000000000);

        new PathSum3().pathSum(a, 0);

    }
}
