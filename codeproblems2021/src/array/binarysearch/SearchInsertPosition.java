package array.binarysearch;

/**
 *
 * 35. Search Insert Position
 *
 * Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [1,3,5,6], target = 5
 * Output: 2
 * Example 2:
 *
 * Input: nums = [1,3,5,6], target = 2
 * Output: 1
 * Example 3:
 *
 * Input: nums = [1,3,5,6], target = 7
 * Output: 4
 * Example 4:
 *
 * Input: nums = [1,3,5,6], target = 0
 * Output: 0
 * Example 5:
 *
 * Input: nums = [1], target = 0
 * Output: 0
 *
 */
public class SearchInsertPosition {

    public int searchInsert(int[] nums, int target) {
        int l=0;
        int r=nums.length-1;

        while(l<=r){

            int mid=(l+r)/2;

            if(target == nums[mid]){
                return mid;
            }
            if(target < nums[mid]){
                r=mid-1;
            }else{
                l=mid+1;
            }
        }

        return l;

    }
}
