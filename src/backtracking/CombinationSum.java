package backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 *
 * 39. Combination Sum
 *
 * https://leetcode.com/problems/combination-sum/
 *
 * Given an array of distinct integers candidates and a target integer target, return a list of all unique combinations of candidates where the chosen numbers sum to target. You may return the combinations in any order.
 *
 * The same number may be chosen from candidates an unlimited number of times. Two combinations are unique if the frequency of at least one of the chosen numbers is different.
 *
 * It is guaranteed that the number of unique combinations that sum up to target is less than 150 combinations for the given input.
 *
 *
 *
 * Example 1:
 *
 * Input: candidates = [2,3,6,7], target = 7
 * Output: [[2,2,3],[7]]
 * Explanation:
 * 2 and 3 are candidates, and 2 + 2 + 3 = 7. Note that 2 can be used multiple times.
 * 7 is a candidate, and 7 = 7.
 * These are the only two combinations.
 *
 * Created by Nutcave on 12/24/2016.
 */
public class CombinationSum {
    ArrayList<ArrayList<Integer>> results;

    public ArrayList<ArrayList<Integer>> combinationSum(ArrayList<Integer> a, int b) {

        results= new ArrayList<>();

        Collections.sort(a);

        helper(a, b, 0, 0,new ArrayList<>());

        return results;
    }

    public void helper(ArrayList<Integer> nums, int target, int curSum, int startIndex, ArrayList<Integer> resNow){

        if(curSum == target){
            results.add(new ArrayList<>(resNow));
            return;
        }

        for(int i=startIndex; i<nums.size(); ++i){
            int num = nums.get(i);
            int newSum=curSum + num;
            if(newSum <= target){
                resNow.add(num);
                helper(nums, target, newSum, i ,resNow);
                resNow.remove(resNow.size()-1);

            }

        }

    }



    public static void main(String[] args) {

        System.out.println(new CombinationSum().combinationSum(new ArrayList<>(Arrays.asList(8, 10, 6, 11, 1, 16, 8)), 28));
    }

}
