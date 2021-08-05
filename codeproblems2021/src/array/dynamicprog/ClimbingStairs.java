package array.dynamicprog;

/**
 *
 * 70. Climbing Stairs
 *
 * https://leetcode.com/problems/climbing-stairs/
 *
 *
 * You are climbing a staircase. It takes n steps to reach the top.
 *
 * Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
 *
 * Example 1:
 *
 * Input: n = 2
 * Output: 2
 * Explanation: There are two ways to climb to the top.
 * 1. 1 step + 1 step
 * 2. 2 steps
 * Example 2:
 *
 * Input: n = 3
 * Output: 3
 * Explanation: There are three ways to climb to the top.
 * 1. 1 step + 1 step + 1 step
 * 2. 1 step + 2 steps
 * 3. 2 steps + 1 step
 *
 *
 */
public class ClimbingStairs {

    // memory n-1 , O(n)
    public int climbStairs(int n) {
        int[] dp= new int[n+1];
        dp[0]=1;
        dp[1]=1;

        for(int i=2; i<n+1; i++){
            dp[i]= dp[i-1] + dp[i-2];
        }

        return dp[n];

    }


    //improve memory
    public int climbStairs2(int n) {
        // base cases
        if(n <= 0) return 0;
        if(n == 1) return 1;
        if(n == 2) return 2;
        int oneStepBefore=1;
        int twoStepsBefore=1;
        int res=0;

        for(int i=2; i<n+1; i++){
            res= twoStepsBefore + oneStepBefore;
            int tmp= oneStepBefore;
            oneStepBefore=res;
            twoStepsBefore=tmp;
        }

        return res;

    }

    //dp[0]=1
    //dp[1]=1
    //dp[2]=2
    //dp[3]=  dp[2] - dp[1]

    //dp[4]= dp[3] - dp[2]
    //1 step + 1 step + 1 step + 1 step
    //1 steps+ 1 step + 2 step
    //1 step + 2 steps + 1 step
    //2 step + 1 step + 1 step
    //2 step + 2 step

    public static void main(String[] args) {
        new ClimbingStairs().climbStairs(4);
        new ClimbingStairs().climbStairs(2);
    }

}
