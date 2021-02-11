package array.slidingwindow;

/**
 * Given an array of n positive integers and a positive integer s, find the minimal length of a contiguous subarray of which the sum ≥ s. If there isn't one, return 0 instead.
 *
 * Example:
 *
 * Input: s = 7, nums = [2,3,1,2,4,3]
 * Output: 2
 * Explanation: the subarray [4,3] has the minimal length under the problem constraint.
 *
 */
public class MinimumSizeSubarraySum {

    public static int minSubArrayLen(int s, int[] nums) {

        if(nums.length == 0){
            return 0;
        }
        int sumSoFar=0;
        int j=0;
        int length=Integer.MAX_VALUE;

        for(int i =0; i<nums.length; i++){

            sumSoFar +=nums[i];


            while(sumSoFar >= s){
                length = Math.min(length, i-j+1);
                sumSoFar -=nums[j];
                j++;
            }



        }
        return (length == Integer.MAX_VALUE)? 0:length;

    }

    public static void main(String[] args) {
        int[] myArr =  {2,3,1,2,4,3};

        System.out.println(minSubArrayLen(7,myArr));
    }
}
