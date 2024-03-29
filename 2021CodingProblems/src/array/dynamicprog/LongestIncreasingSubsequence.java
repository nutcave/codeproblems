package array.dynamicprog;

/**
 *
 * https://leetcode.com/problems/longest-increasing-subsequence/
 *
 * 300. Longest Increasing Subsequence
 *
 * Given an integer array nums, return the length of the longest strictly increasing subsequence.
 *
 * A subsequence is a sequence that can be derived from an array by deleting some or no elements without changing the order of the remaining elements. For example, [3,6,2,7] is a subsequence of the array [0,3,1,6,2,2,7].
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [10,9,2,5,3,7,101,18]
 * Output: 4
 * Explanation: The longest increasing subsequence is [2,3,7,101], therefore the length is 4.
 * Example 2:
 *
 * Input: nums = [0,1,0,3,2,3]
 * Output: 4
 * Example 3:
 *
 * Input: nums = [7,7,7,7,7,7,7]
 * Output: 1
 *
 *
 */
public class LongestIncreasingSubsequence {
    public int lengthOfLIS(int[] nums) {
        int[] dp= new int[nums.length];

        int maxSequence=1;
        for(int i=0; i< nums.length; i++){

            dp[i]=1;
            for(int j=i-1; j>=0;j--){
                if(nums[i]>nums[j] ){
                    dp[i]=Math.max(dp[j]+1,dp[i]);
                    maxSequence=Math.max(maxSequence, dp[i]);
                }
            }


        }

        return maxSequence;

    }

    public static void main(String[] args) {
        new LongestIncreasingSubsequence().lengthOfLIS(new int[]{0,3,1,6,2,2,7});
    }



}

//[1,3,6,7,9,4,10,5,6]
// 1 2 3

//[0,1,0,3,2,3]
// 1 2 1

// [0,3,1,6,2,2,7]
//  1 2 2 3 3 3 4

//      [10,9,2,5,3,7,101,18]
//       1  1 1 2 2 3 4    4