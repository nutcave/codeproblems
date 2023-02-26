package bfs;


import util.TreeNode;

import java.util.*;

public class ZigzagTraversal {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res= new ArrayList<>();

        if(root==null){
            return res;
        }

        Queue<TreeNode> queue= new LinkedList<>();
        queue.add(root);
        boolean leftToRight = true;
        while(!queue.isEmpty()){
            LinkedList<Integer> lvlRes = new LinkedList<>();
            int size= queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode cur= queue.remove();

                if(leftToRight){
                    lvlRes.addLast(cur.val);
                }else{
                    lvlRes.addFirst(cur.val);
                }

                if (cur.left != null) {
                    queue.add(cur.left);
                }
                if (cur.right != null) {
                    queue.add(cur.right);
                }

            }
            res.add(lvlRes);
            leftToRight = !leftToRight;
        }
        return  res;
    }
}
