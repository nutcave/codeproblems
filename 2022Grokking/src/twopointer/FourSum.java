package twopointer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum {

    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();

        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 3; i++) {
            if(i> 0 && nums[i] == nums[i-1]){
                continue;
            }
            for (int j = i + 1; j < nums.length - 2; j++) {
                if(j > i + 1 && nums[j] == nums[j-1]){
                    continue;
                }
                int k = j + 1;
                int h = nums.length - 1;

                while (k < h) {
                    int v = nums[i] + nums[j] + nums[k] + nums[h];
                    if (v < target) {
                        k++;
                    } else if (v > target) {
                        h--;
                    } else if (v == target) {
                        res.add(Arrays.asList(nums[i], nums[j], nums[k], nums[h]));
                        k++;
                        h--;
                        if(k < h && nums[i] == nums[i-1]){
                            continue;
                        }
                    }
                }
            }
        }

        return res;

    }

    public static void main(String[] args) {
//        new FourSum().fourSum(new int[]{1, 0, -1, 0, -2, 2}, 0);
        new FourSum().fourSum(new int[]{1000000000,1000000000,1000000000,1000000000}, -294967296);
    }
}
