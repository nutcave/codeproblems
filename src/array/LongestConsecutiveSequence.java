package array;

import java.util.*;

/**
 * Given an unsorted array of integers, find the length of the longest consecutive elements sequence.
 * <p>
 * For example, given [100, 4, 200, 1, 3, 2], the longest consecutive elements sequence should be [1, 2, 3, 4]. Its length is 4.
 * <p>
 */
public class LongestConsecutiveSequence {

    //solution O(n)
    public int longestConsecutive(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        Set<Integer> set = new HashSet<>();
        int max = 1;

        for (int i : nums) {
            set.add(i);
        }

        //save to set and then use a pointer to go left and right of a number
        for (int i : nums) {

            int l = i - 1;
            int r = i + 1;
            int count = 1;

            while (set.contains(l)) {
                count++;
                l--;
            }

            while (set.contains(r)) {
                count++;
                r++;
            }


            max = Math.max(count, max);


        }


        return max;
    }
}
