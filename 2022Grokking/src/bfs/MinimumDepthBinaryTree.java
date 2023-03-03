package bfs;

import util.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class MinimumDepthBinaryTree {

    public int minDepth(TreeNode root) {
        int res = 0;
        if (root == null)
            return res;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            int size = queue.size();
            res++;
            for (int i = 0; i < size; i++) {
                TreeNode cur = queue.remove();

                if (cur.left != null)
                    queue.add(cur.left);

                if (cur.right != null)
                    queue.add(cur.right);

                if (cur.right == null && cur.left == null) {
                    return res;
                }
            }

        }

        return res;

    }
}
