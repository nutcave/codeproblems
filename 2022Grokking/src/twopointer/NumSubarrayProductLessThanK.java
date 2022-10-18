package twopointer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class NumSubarrayProductLessThanK {

    public int numSubarrayProductLessThanK(int[] nums, int k) {

        List<List<Integer>> res=new ArrayList<>();

        int product=1;

        int l=0;
        for(int r=0; r< nums.length; r++){
            product *= nums[r];

            while(l < nums.length && k<=product){
                product /= nums[l];
                l++;
            }

            List<Integer> tmp= new LinkedList<>();

            for(int j=l; j<= r; j++){
                tmp.add(nums[j]);

                res.add(tmp);
            }

        }

        return res.size();

    }

    public int numSubarrayProductLessThanK1(int[] nums, int k) {

        int product=1;
        int count=0;
        int l=0;
        for(int r=0; r< nums.length; r++){
            product *= nums[r];

            while(l <= r && k<=product){
                product /= nums[l];
                l++;
            }


            count += r-l + 1;

        }

        return count;

    }

    public static void main(String[] args) {
//        new NumSubarrayProductLessThanK().numSubarrayProductLessThanK1(new int[]{10,5,2,6},100);
        new NumSubarrayProductLessThanK().numSubarrayProductLessThanK1(new int[]{1,2,3,4},100);
    }

}
