package array;

import java.util.Arrays;

/**
 * Given two sorted integer arrays A and B, merge B into A as one sorted array.
 * <p>
 * Note:
 * You may assume that A has enough space to hold additional elements from B.
 * The number of elements initialized in A and B are m and n respectively.
 * <p>
 * <p>
 * Input:
 * nums1 = [1,2,3,0,0,0], m = 3
 * nums2 = [2,5,6],       n = 3
 * <p>
 * Output: [1,2,2,3,5,6]
 * <p>
 * Created by Yousifk on 12-Nov-18.
 */
public class MergeSortedArray {
    public void merge(int A[], int m, int B[], int n) {


        while (m > 0 && n > 0) {

            if (A[m - 1] > B[n - 1]) {
                A[m + n - 1] = A[m - 1];
                m--;
            } else {
                A[m + n - 1] = B[n - 1];
                n--;
            }
        }

        while (n > 0) {
            A[m + n - 1] = B[n - 1];
            n--;
        }
        System.out.println(Arrays.toString(A));
    }


    public static void main(String[] args) {

        int[] A = {1, 2, 5, 6, 9, 0, 0, 0};
        int[] B = {3, 7, 8};
        new MergeSortedArray().merge(A, 5, B, B.length);

    }
}
