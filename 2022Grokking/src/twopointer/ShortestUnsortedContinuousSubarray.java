package twopointer;


/**
 * 581. Shortest Unsorted Continuous Subarray
 *
 * Given an integer array nums, you need to find one continuous subarray such that if you only sort this subarray in non-decreasing order, then the whole array will be sorted in non-decreasing order.
 *
 * Return the shortest such subarray and output its length.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [2,6,4,8,10,9,15]
 * Output: 5
 * Explanation: You need to sort [6, 4, 8, 10, 9] in ascending order to make the whole array sorted in ascending order.
 * Example 2:
 *
 * Input: nums = [1,2,3,4]
 * Output: 0
 * Example 3:
 *
 * Input: nums = [1]
 * Output: 0
 */
public class ShortestUnsortedContinuousSubarray {
    public int findUnsortedSubarray(int[] nums) {

        int low=0;
        int high=nums.length-1;

        //find out of order from left
        while(low < nums.length-1 && nums[low]<=nums[low+1] ){
            low++;
        }

        if(low == nums.length-1){
            return 0;
        }

        //find out of order from right
        while(high > 0 && nums[high] >=nums[high-1]){
            high--;
        }

        int subArrLow=Integer.MAX_VALUE;
        int subArrHigh=Integer.MIN_VALUE;

        for(int i=low; i<= high;i++){
            subArrLow=Math.min(subArrLow,nums[i]);
            subArrHigh=Math.max(subArrHigh,nums[i]);
        }

        //expand from left
        while(low > 0 && nums[low-1] > subArrLow){
            low--;
        }

        //expand from right
        while(high<nums.length-1 && nums[high+1] < subArrHigh){
            high++;
        }

        return high - low +1;



    }
    public static void main(String[] args) {

        new ShortestUnsortedContinuousSubarray().findUnsortedSubarray(new int[]{2,6,4,8,10,9,15});
    }
}
