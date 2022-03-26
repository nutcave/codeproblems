package array.twopointer;

/**
 *
 * Merge Sorted Array
 *
 * Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.
 *
 * The number of elements initialized in nums1 and nums2 are m and n respectively. You may assume that nums1 has a size equal to m + n such that it has enough space to hold additional elements from nums2.
 *
 *
 *
 * Example 1:
 *
 * Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
 * Output: [1,2,2,3,5,6]
 * Example 2:
 *
 * Input: nums1 = [1], m = 1, nums2 = [], n = 0
 * Output: [1]
 *
 */
public class MergeSortedArray {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=m-1;
        int j=n-1;
        int k=m+n-1;
        while(i>=0 && j>=0){

            if(nums2[j] > nums1[i]){
                nums1[k]=nums2[j];
                j--;
            }else{
                nums1[k]=nums1[i];
                i--;
            }

            k--;
        }
        while(j>=0)
            nums1[k--] = nums2[j--];

    }

    public static void main(String[] args) {
        new MergeSortedArray().merge(new int[]{0},0,new int[]{1},1);
    }
}
