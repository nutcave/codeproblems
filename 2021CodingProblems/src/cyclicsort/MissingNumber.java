package cyclicsort;

public class MissingNumber {
    public int missingNumber(int[] nums) {


        int i=0;
        while(i< nums.length){
            int num= nums[i];

            if(num < nums.length && num != i) {
                //keep swapping until resolved
                int tmp = nums[num];
                nums[num] = num;
                nums[i] = tmp;
            }else{
                i++;
            }
        }


        for(int j=0;j< nums.length;j++){
            if(nums[j] != j){
                return j;
            }

        }
        return nums.length;

    }

    public static void main(String[] args) {
        new MissingNumber().missingNumber(new int[]{9,6,4,2,3,5,7,0,1});
    }
}
