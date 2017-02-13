package tree;

import util.TreeNode;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Nutcave on 12/24/2016.
 */
public class SortedArrayToBalancedBST {

    public TreeNode sortedArrayToBST(final List<Integer> a) {


        return helper(a, 0, a.size());


    }

    public TreeNode helper(final List<Integer> a, int start, int end) {

        if (start > end) {
            return null;
        }

        int mid = (start + end) / 2;

        TreeNode root = new TreeNode(a.get(mid));

        root.left = helper(a,start, mid-1);
        root.right = helper(a, mid+1, end);

        return root;


    }


    public static void main(String[] args) {

        new SortedArrayToBalancedBST().sortedArrayToBST(Arrays.asList(1,2,3,4,5,6));
    }
}
