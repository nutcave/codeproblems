package array.slidingwindow;

/**
 *
 * https://leetcode.com/problems/maximum-average-subarray-i/
 *
 *
 * Given an array consisting of n integers, find the contiguous subarray of given length k that has the maximum average value. And you need to output the maximum average value.
 *
 * Example 1:
 *
 * Input: [1,12,-5,-6,50,3], k = 4
 * Output: 12.75
 * Explanation: Maximum average is (12-5-6+50)/4 = 51/4 = 12.75
 *
 */
public class MaxAvgSubarray {

    public double findMaxAverage(int[] nums, int k) {


        double maxAvg;
        int totalSum=0;
        for(int i=0; i<k;i++){
            totalSum += nums[i];

        }
        maxAvg= totalSum/ (double) k;


        int j=0;
        for(int i=k; i<nums.length ;i++){
            totalSum -= nums[j];
            totalSum += nums[i];
            maxAvg=Math.max(maxAvg, totalSum/(double) k);
            j++;

        }

        return maxAvg;


    }

    public static void main(String[] args) {
        new MaxAvgSubarray().findMaxAverage(new int[]{1,12,-5,-6,50,3},4);
    }


}
