package array.slidingwindow;

/**
 *
 * 1004. Max Consecutive Ones III
 *
 * Given an array A of 0s and 1s, we may change up to K values from 0 to 1.
 *
 * Return the length of the longest (contiguous) subarray that contains only 1s.
 *
 *
 *
 * Example 1:
 *
 * Input: A = [1,1,1,0,0,0,1,1,1,1,0], K = 2
 * Output: 6
 * Explanation:
 * [1,1,1,0,0,1,1,1,1,1,1]
 * Bolded numbers were flipped from 0 to 1.  The longest subarray is underlined.
 * Example 2:
 *
 * Input: A = [0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1], K = 3
 * Output: 10
 * Explanation:
 * [0,0,1,1,1,1,1,1,1,1,1,1,0,0,0,1,1,1,1]
 * Bolded numbers were flipped from 0 to 1.  The longest subarray is underlined.
 *
 */
public class MaxConsecutiveOnes3 {

    public int longestOnes(int[] A, int K) {

        int maxOnes=0;
        int zeroCount=0;

        int i=0; //i slow pointer

        for(int j=0; j<A.length;j++){

            if(A[j]==0){
                zeroCount++;
            }

            while(zeroCount > K){
                if(A[i++] == 0){
                    zeroCount--;
                }
            }

            maxOnes=Math.max(j-i + 1, maxOnes );
        }

        return maxOnes;

    }

    public int longestOnes2(int[] A, int K) {
        int zeroCount=0,start=0,res=0;
        for(int end=0;end<A.length;end++){
            if(A[end] == 0) zeroCount++;
            while(zeroCount > K){
                if(A[start] == 0) zeroCount--;
                start++;
            }
            res=Math.max(res,end-start+1);
        }
        return res;
    }

}
