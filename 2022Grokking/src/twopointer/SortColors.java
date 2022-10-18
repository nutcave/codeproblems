package twopointer;

public class SortColors {

    public void sortColors(int[] nums) {


        int l=0;
        int r=nums.length-1;

        int i=0;

        while(i<=r){

            if(nums[i]==0){
                swap(nums,i,l);
                l++;
                i++;
            }else if(nums[i]==1){
                i++;
            }else if(nums[i]==2){
                swap(nums,i,r);
                r--;
            }
        }



    }

    public void swap(int[] nums, int i , int j){
        int tmp= nums[i];
        nums[i]=nums[j];
        nums[j]=tmp;
    }

    public static void main(String[] args) {
        new SortColors().sortColors(new int[]{2,0,1});
    }
}
