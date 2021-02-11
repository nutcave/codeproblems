package array.twopointer;

import java.util.*;

public class ThreeSum {

    public List<List<Integer>> threeSum(int[] nums) {

        Arrays.sort(nums);
        Set<List<Integer>> set = new HashSet<>();
        for(int i=0; i<nums.length;i++){

            int j=i+1, k=nums.length-1;

            while(j<k){

                int a=nums[i];
                int b=nums[j];
                int c=nums[k];
                if(a + b + c == 0){
                    List<Integer> r = new ArrayList<>();
                    r.add(a);
                    r.add(b);
                    r.add(c);
                    set.add(r);
                    k--;
                }else if (a + b + c > 0){
                    k--;
                }else{
                    j++;
                }




            }

        }

        return new ArrayList<>(set);

    }

    public static void main(String[] args) {
        int[]myArr =         {-1,0,1,2,-1,-4};
        System.out.println(new ThreeSum().threeSum(myArr));
    }
}
