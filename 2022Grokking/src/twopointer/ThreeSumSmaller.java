package twopointer;

import java.util.Arrays;

public class ThreeSumSmaller {
    public int threeSumSmaller(int[] nums, int target) {
        // Write your code here
        int count=0;

        Arrays.sort(nums);
        for(int i=0; i< nums.length-2; i++){
            int j= i+1;
            int k= nums.length -1;

            while(j<k){

                int sum = nums[i] + nums[j] + nums[k];

                if (sum < target){
                    count+=k-j;
                    j++;
                }else{
                    k--;
                }

            }
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println(new ThreeSumSmaller().threeSumSmaller(new int[]{-1,0,2,3},3));
//        System.out.println(new ThreeSumSmaller().threeSumSmaller(new int[]{-1, 4, 2, 1, 3},5));
//        System.out.println(new ThreeSumSmaller().threeSumSmaller(new int[]{1,2,-3,4,-2},1));
    }

}
