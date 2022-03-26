package slidingwindow;

/**
 * 53. Maximum Subarray
 * <p>
 * Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.
 * <p>
 * A subarray is a contiguous part of an array.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
 * Output: 6
 * Explanation: [4,-1,2,1] has the largest sum = 6.
 * Example 2:
 * <p>
 * Input: nums = [1]
 * Output: 1
 * Example 3:
 * <p>
 * Input: nums = [5,4,-1,7,8]
 * Output: 23
 */
public class MaxSubArray {

    public int maxSubArray(int[] nums) {

        int i = 1;
        int sum = nums[0];
        int maxSum = nums[0];
        while (i < nums.length) {

            sum += nums[i];
            if (sum < nums[i]) {
                sum = nums[i];
            }
            maxSum = Math.max(sum, maxSum);
            i++;
        }

        return maxSum;

    }
}
