package array;

/**
 * Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.
 *
 * There is only one repeated number in nums, return this repeated number.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [1,3,4,2,2]
 * Output: 2
 * Example 2:
 *
 * Input: nums = [3,1,3,4,2]
 * Output: 3
 * Example 3:
 *
 * Input: nums = [1,1]
 * Output: 1
 * Example 4:
 *
 * Input: nums = [1,1,2]
 * Output: 1
 */
public class FindDuplicateNumber {

    public int findDuplicate(int[] nums) {

        int[] dupes = new int[nums.length];

        for(int i=0; i<nums.length; i++){
            int value= nums[i];
            if(dupes[value] == 1){
                return value;
            }
            dupes[value]=1;

        }
        return nums[0];

    }

}
