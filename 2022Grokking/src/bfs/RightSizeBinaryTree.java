package bfs;

import util.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class RightSizeBinaryTree {

    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> res = new ArrayList<>();

        if (root == null) return res;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            int size = queue.size();

            TreeNode prev = null;
            for (int i = 0; i < size; i++) {
                TreeNode cur = queue.remove();

                if (cur.left != null)
                    queue.add(cur.left);

                if (cur.right != null)
                    queue.add(cur.right);

                prev = cur;
            }

            res.add(prev.val);
        }

        return res;


    }
}
