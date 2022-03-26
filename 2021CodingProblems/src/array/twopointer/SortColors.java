package array.twopointer;

import java.util.Arrays;

public class SortColors {

    public void sortColors(int[] nums) {
        for(int i=0; i< nums.length; i++){
            for(int j= nums.length-1; j>i; j--){
                int a=nums[j-1];
                int b=nums[j];

                if(b<a){
                    nums[j-1]=b;
                    nums[j]=a;
                }
            }
        }


    }

    public static void main(String[] args) {
        int[]myArr = {2, 0, 2, 1, 1, 0};
        new SortColors().sortColors(myArr);
        System.out.println(Arrays.toString(myArr));
    }
}
