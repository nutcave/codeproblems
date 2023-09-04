package bfs;

import util.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeOrderTraversal {

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res= new ArrayList<>();

        if(root == null){
            return res;
        }

        Queue<TreeNode> queue= new LinkedList<>();

        queue.add(root);

        while(!queue.isEmpty()){

            int size=queue.size();
            List<Integer> level=new ArrayList<>();

            for(int i=0; i < size; i++){
                TreeNode node=queue.remove();

                if(node.left != null){
                    queue.add(node.left);
                }

                if(node.right != null){
                    queue.add(node.right);
                }

                level.add(node.val);

            }
            res.add(level);


        }

        return res;

    }
}
