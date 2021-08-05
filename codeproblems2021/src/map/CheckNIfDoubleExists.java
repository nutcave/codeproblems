package map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * https://leetcode.com/problems/check-if-n-and-its-double-exist/
 *
 * 1346. Check If N and Its Double Exist
 *
 * Given an array arr of integers, check if there exists two integers N and M such that N is the double of M ( i.e. N = 2 * M).
 *
 * More formally check if there exists two indices i and j such that :
 *
 * i != j
 * 0 <= i, j < arr.length
 * arr[i] == 2 * arr[j]
 *
 *
 * Example 1:
 *
 * Input: arr = [10,2,5,3]
 * Output: true
 * Explanation: N = 10 is the double of M = 5,that is, 10 = 2 * 5.
 * Example 2:
 *
 * Input: arr = [7,1,14,11]
 * Output: true
 * Explanation: N = 14 is the double of M = 7,that is, 14 = 2 * 7.
 * Example 3:
 *
 * Input: arr = [3,1,7,11]
 * Output: false
 * Explanation: In this case does not exist N and M, such that N = 2 * M.
 *
 */
public class CheckNIfDoubleExists {

    public boolean checkIfExist(int[] arr) {

        Set<Integer> seen=new HashSet<Integer>();

        for(int i=0; i<arr.length;i++){
            int v=arr[i];
            if(seen.contains(v *2) ||  v %2==0 && seen.contains(v/2)){
                return true;
            }
            seen.add(v);
        }


        return false;

    }

    public boolean checkIfExist2(int[] arr) {

        Map<Integer,Integer> set=new HashMap<Integer,Integer>();

        for(int i=0; i< arr.length;i++){
            set.put(arr[i],i);
        }

        for(int i=0; i< arr.length;i++){
            Integer k=set.get(arr[i]*2);
            if(k != null && k != i) return true;
        }

        return false;

    }

    public static void main(String[] args) {
        new CheckNIfDoubleExists().checkIfExist(new int[]{7,1,14,11});
    }
}
