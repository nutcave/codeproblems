package array.twopointer;

import java.util.*;

/**
 * Given an array of numbers
 *
 * [-1,2,5,6,-5]
 *
 * find distinct elements that meet the following formula a^2 + b^2 = c^2
 *
 * return true if there is a set of distinct elements that meet that condition
 *
 *
 */
public class DistinctSquaredElements {

    //square the elements
    // sort them

    public boolean meetCondition(int[] nums){

        Set<Integer> integers= new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            nums[i]= (int) Math.pow(nums[i],2);
            integers.add(nums[i]);

        }

        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {

            for (int j = i+1; j <nums.length ; j++) {
                int a=nums[i];
                int b=nums[j];

                if(integers.contains(a+b)){
                    return true;
                }
            }
        }


        return false;
    }

    public static void main(String[] args) {
//        System.out.println(new DistinctSquaredElements().meetCondition(new int[]{-1,2,5,6,-5}));
        System.out.println(new DistinctSquaredElements().meetCondition(new int[]{-1,4,-3,6,-5}));
        System.out.println(new DistinctSquaredElements().meetCondition(new int[]{-1,-5,-3,6,-5}));
    }
}
