package twopointer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 713. Subarray Product Less Than K
 * Medium
 * 5.7K
 * 177
 * Companies
 * Given an array of integers nums and an integer k, return the number of contiguous subarrays where the product of all the elements in the subarray is strictly less than k.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [10,5,2,6], k = 100
 * Output: 8
 * Explanation: The 8 subarrays that have product less than 100 are:
 * [10], [5], [2], [6], [10, 5], [5, 2], [2, 6], [5, 2, 6]
 * Note that [10, 5, 2] is not included as the product of 100 is not strictly less than k.
 * Example 2:
 *
 * Input: nums = [1,2,3], k = 0
 * Output: 0
 *
 */
public class NumSubarrayProductLessThanK {

    public int numSubarrayProductLessThanK(int[] nums, int k) {

        List<List<Integer>> res=new ArrayList<>();

        int product=1;

        int l=0;
        for(int r=0; r< nums.length; r++){
            product *= nums[r];

            while(l < nums.length && k<=product){
                product /= nums[l];
                l++;
            }

            List<Integer> tmp= new LinkedList<>();

            for(int j=l; j<= r; j++){
                tmp.add(nums[j]);

                res.add(tmp);
            }

        }

        return res.size();

    }

    public int numSubarrayProductLessThanK1(int[] nums, int k) {

        int product=1;
        int count=0;
        int l=0;
        for(int r=0; r< nums.length; r++){
            product *= nums[r];

            while(l <= r && k<=product){
                product /= nums[l];
                l++;
            }


            count += r-l + 1;

        }

        return count;

    }

    public static void main(String[] args) {
//        new NumSubarrayProductLessThanK().numSubarrayProductLessThanK1(new int[]{10,5,2,6},100);
        new NumSubarrayProductLessThanK().numSubarrayProductLessThanK1(new int[]{1,2,3,4},100);
    }

}
