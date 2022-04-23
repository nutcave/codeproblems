package twopointer;

import java.util.Arrays;

public class ThreeSumClosest {

    public int threeSumClosest(int[] nums, int target) {

        int diff = Integer.MAX_VALUE;
        int res = 0;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {

            int j = i + 1;
            int k = nums.length - 1;

            while (j < k) {

                int sum = nums[i] + nums[j] + nums[k];
                int targetDiff = target - sum;
                if (Math.abs(targetDiff) < diff) {
                    diff = Math.abs(targetDiff);
                    res = sum;
                }

                if (targetDiff == 0) {
                    return sum; //exact match
                } else if (targetDiff > 0) {
                    j++; //need bigger triplet
                } else {
                    k--; //need smaller triplet
                }


            }
        }
        return res;


    }

    public static void main(String[] args) {
//        new ThreeSumClosest().threeSumClosest(new int[]{-1,2,1,-4},1);
//        new ThreeSumClosest().threeSumClosest(new int[]{0, 1, 2}, 3);
        new ThreeSumClosest().threeSumClosest(new int[]{0,2,1,-3},1);
    }
}
