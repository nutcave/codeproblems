package twopointer;

/**
 * 75. Sort Colors
 * Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.
 *
 * We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.
 *
 * You must solve this problem without using the library's sort function.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [2,0,2,1,1,0]
 * Output: [0,0,1,1,2,2]
 * Example 2:
 *
 * Input: nums = [2,0,1]
 * Output: [0,1,2]
 */
public class SortColors {

    public void sortColors(int[] nums) {


        int l=0;
        int r=nums.length-1;

        int i=0;

        while(i<=r){

            if(nums[i]==0){
                swap(nums,i,l);
                l++;
                i++;
            }else if(nums[i]==1){
                i++;
            }else if(nums[i]==2){
                swap(nums,i,r);
                r--;
            }
        }



    }

    public void swap(int[] nums, int i , int j){
        int tmp= nums[i];
        nums[i]=nums[j];
        nums[j]=tmp;
    }

    public static void main(String[] args) {
        new SortColors().sortColors(new int[]{2,0,1});
    }
}
