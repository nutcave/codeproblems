package array;

import java.util.Arrays;

/**
 * Given an array nums of n integers where n > 1,  return an array output such that output[i] is equal to the product of all the elements of nums except nums[i].
 *
 * Example:
 *
 * Input:  [1,2,3,4]
 * Output: [24,12,8,6]
 */
public class ProductExceptSelf {
    public static int[] productExceptSelf(int[] nums) {

        int[] results=new int[nums.length];

        int left=1;
        for(int i=0; i<nums.length; i++){
            results[i] = left;
            left *= nums[i];

        }


        int right=1;
        for(int i=nums.length -1 ; i>=0; i--){
            results[i] *= right;
            right *= nums[i];

        }

        return results;

    }

    public static void main(String[] args) {
        int[] myArr =  {1, 2,3,4};

        System.out.println(Arrays.toString(productExceptSelf(myArr)));
    }
}
