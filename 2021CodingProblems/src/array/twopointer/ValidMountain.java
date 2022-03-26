package array.twopointer;

/**
 * https://leetcode.com/problems/valid-mountain-array/
 * 941. Valid Mountain Array
 * Easy

 * Given an array of integers arr, return true if and only if it is a valid mountain array.
 *
 * Example 1:
 *
 * Input: arr = [2,1]
 * Output: false
 * Example 2:
 *
 * Input: arr = [3,5,5]
 * Output: false
 * Example 3:
 *
 * Input: arr = [0,3,2,1]
 * Output: true
 *
 */
public class ValidMountain {

    public boolean validMountainArray(int[] arr) {

        int i =0, j=arr.length-1;

        while( i + 1 < arr.length-1 && arr[i]<arr[i+1] ) i++;

        while(  j -1 > 0 &&  arr[j-1]>arr[j] ) j--;

        return i==j && i > 0 && j < arr.length-1;

    }

}
