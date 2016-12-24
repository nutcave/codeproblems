import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
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
//            System.out.println("found");
            return;
        }

        for(int i=startIndex; i<nums.size(); ++i){
            int num = nums.get(i);
            int newSum=curSum + num;
            if(newSum <= target){
                resNow.add(num);
//                System.out.println(resNow);
                helper(nums, target, newSum, i ,resNow);
                resNow.remove(resNow.size()-1);

            }

        }

    }



    public static void main(String[] args) {

        System.out.println(new CombinationSum().combinationSum(new ArrayList<>(Arrays.asList(8, 10, 6, 11, 1, 16, 8)), 28));
    }

}
