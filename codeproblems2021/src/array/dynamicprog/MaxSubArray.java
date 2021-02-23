package array.dynamicprog;


/**
 * Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.
 *
 *Example 1:
 *
 * Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
 * Output: 6
 * Explanation: [4,-1,2,1] has the largest sum = 6.
 *
 *
 *
 */
public class MaxSubArray {

    public int maxSubArray(int[] nums) {

        int curMax=nums[0];
        int maxSub=curMax;
        for(int i =1; i<nums.length;i++){

            int x=nums[i];

            curMax=Math.max(x, x + curMax);
            maxSub=Math.max(curMax, maxSub);
        }

        return maxSub;


    }

    public static void main(String[] args) {
        new MaxSubArray().maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4});
    }
}
