package array.dynamicprog;

/**
 * https://leetcode.com/problems/house-robber/
 *
 * 198. House Robber

 * You are a professional robber planning to rob houses along a street. Each house has a certain amount of money stashed, the only constraint stopping you from robbing each of them is that adjacent houses have security system connected and it will automatically contact the police if two adjacent houses were broken into on the same night.
 *
 * Given a list of non-negative integers representing the amount of money of each house, determine the maximum amount of money you can rob tonight without alerting the police.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [1,2,3,1]
 * Output: 4
 * Explanation: Rob house 1 (money = 1) and then rob house 3 (money = 3).
 *              Total amount you can rob = 1 + 3 = 4.
 * Example 2:
 *
 * Input: nums = [2,7,9,3,1]
 * Output: 12
 * Explanation: Rob house 1 (money = 2), rob house 3 (money = 9) and rob house 5 (money = 1).
 *              Total amount you can rob = 2 + 9 + 1 = 12.
 *
 */
public class HouseRobber {

    public int rob(int[] nums) {
        if (nums.length == 0) return 0;
        int[] memo = new int[nums.length + 1];
        memo[0] = 0;
        memo[1] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            int val = nums[i];
            memo[i+1] = Math.max(memo[i], memo[i-1] + val);
        }
        return memo[nums.length];

    }

    /* the order is: prev2, prev1, num  */
    /*
    We can notice that in the previous step we use only memo[i] and memo[i-1], so going just 2 steps back.
    We can hold them in 2 variables instead. This optimization is met in Fibonacci sequence creation and some other problems [to paste links].
     */
    public int rob2(int[] nums) {
        int prev1=0;
        int prev2=0;
        int cur=0;


        for(int i=0; i<nums.length; i++){

            int v=nums[i];
            cur=Math.max(prev2+v, prev1);
            prev2=prev1;
            prev1=cur;


        }

        return cur;
    }
    public static void main(String[] args) {
        new HouseRobber().rob(new int[]{2,1,1,2});
    }
}
