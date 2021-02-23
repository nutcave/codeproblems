package array.binarysearch;


/**
 *
 * Given a sorted array of n distinct integers where each integer is in the range from 0 to m-1 and m > n. Find the smallest number that is missing from the array.
 *
 * Input: {0, 1, 2, 6, 9}, n = 5, m = 10
 * Output: 3
 *
 * Input: {4, 5, 10, 11}, n = 4, m = 12
 * Output: 0
 *
 * Input: {0, 1, 2, 3}, n = 4, m = 5
 * Output: 4
 *
 * Input: {0, 1, 2, 3, 4, 5, 6, 7, 10}, n = 9, m = 11
 * Output: 8
 *
 */
public class FindSmallestNumber {


    public int findSmallest(int[] nums, int m){
        return binarySearch(nums,0,nums.length);
    }

    private int binarySearch(int[] nums, int l, int r){

        if(l <=r){

            int mid = (l + r)/2;
            if(nums[l] != l){
                return l;
            }

            // Left half has all elements from 0 to mid
            if(nums[mid] == mid){
                return binarySearch(nums,mid+1,r);
            }

        }

        return -1;

    }



    public static void main(String[] args) {
        int[] arr={0, 1, 2, 6, 9};
        System.out.println(new FindSmallestNumber().findSmallest(arr,10));
        arr= new int[]{0, 1, 2, 3, 4, 5, 6, 7, 10};
        System.out.println(new FindSmallestNumber().findSmallest(arr,11));

    }

}
