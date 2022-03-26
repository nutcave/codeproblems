package bfs;


import util.Node;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 *
 * 116. Populating Next Right Pointers in Each Node
 *You are given a perfect binary tree where all leaves are on the same level, and every parent has two children. The binary tree has the following definition:
 *
 * struct Node {
 *   int val;
 *   Node *left;
 *   Node *right;
 *   Node *next;
 * }
 * Populate each next pointer to point to its next right node. If there is no next right node, the next pointer should be set to NULL.
 *
 * Initially, all next pointers are set to NULL.
 *
 * Input: root = [1,2,3,4,5,6,7]
 * Output: [1,#,2,3,#,4,5,6,7,#]
 * Explanation: Given the above perfect binary tree (Figure A), your function should populate each next pointer to point to its next right node, just like in Figure B. The serialized output is in level order as connected by the next pointers, with '#' signifying the end of each level.
 *
 */
public class PopulateToRightNode {

    public Node connect(Node root) {

        if(root == null) return root;
        Queue<Node> queue= new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            int size=queue.size();

            List<Node> addLater=new ArrayList<>();
            for(int i=0; i<size; i++){
                Node node=queue.remove();
                node.next=queue.peek();
                if(node.left != null){
                    addLater.add(node.left);
                }
                if(node.right != null)  {
                    addLater.add(node.right);
                };
            }

            for(Node n: addLater){
                queue.add(n);
            }
        }

        return root;


    }


    public void connect2(Node root) {
        Node level_start=root;
        while(level_start!=null){
            Node cur=level_start;
            while(cur!=null){
                if(cur.left!=null) cur.left.next=cur.right;
                if(cur.right!=null && cur.next!=null) cur.right.next=cur.next.left;

                cur=cur.next;
            }
            level_start=level_start.left;
        }
    }
}
