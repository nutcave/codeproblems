package array;

/**
 * 1089. Duplicate Zeros
 *
 * Given a fixed length array arr of integers, duplicate each occurrence of zero, shifting the remaining elements to the right.
 *
 * Note that elements beyond the length of the original array are not written.
 *
 * Do the above modifications to the input array in place, do not return anything from your function.
 *
 *
 *
 * Example 1:
 *
 * Input: [1,0,2,3,0,4,5,0]
 * Output: null
 * Explanation: After calling your function, the input array is modified to: [1,0,0,2,3,0,0,4]
 * Example 2:
 *
 * Input: [1,2,3]
 * Output: null
 * Explanation: After calling your function, the input array is modified to: [1,2,3]
 */
public class DuplicateZeroes {


    /**
     * First pass to count the number of 0's.
     * Second pass is to write in the values in appropriate locations, moving from right to left (backwards from the usual),
     *    in which the write pointer initially extends outside of the length of the array (as if it was the full sized array without erasing values in the shift).
     */
    public void duplicateZeros(int[] arr) {

        int countZeroes=0;

        for(int i=0; i<arr.length;i++){
            if(arr[i]==0){
                countZeroes++;
            }
        }



        int i=arr.length -1;
        int j=arr.length -1 + countZeroes;

        while(i>=0 && j >=0){

            if(arr[i] != 0){
                if(j < arr.length) arr[j]=arr[i];

            }else{
                if(j < arr.length) arr[j]=arr[i];
                j--;
                if(j < arr.length) arr[j]=arr[i];
            }

            i--;
            j--;

        }



    }

    //[1,0,2,3,0,4,5,0] 0 0 0
    //               i      j
    //             i    j
    //           i   j
    //         i   j
    //       i j
    //     i j
    //  i j




    // [1,0,0,2,3,0,0,4]
    public static void main(String[] args) {
        new DuplicateZeroes().duplicateZeros(new int[]{1,0,2,3,0,4,5,0});
    }
}
