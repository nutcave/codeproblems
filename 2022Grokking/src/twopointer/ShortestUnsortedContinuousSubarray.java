package twopointer;

public class ShortestUnsortedContinuousSubarray {
    public int findUnsortedSubarray(int[] nums) {

        int low=0;
        int high=nums.length-1;

        //find out of order from left
        while(low < nums.length-1 && nums[low]<=nums[low+1] ){
            low++;
        }

        if(low == nums.length-1){
            return 0;
        }

        //find out of order from right
        while(high > 0 && nums[high] >=nums[high-1]){
            high--;
        }

        int subArrLow=Integer.MAX_VALUE;
        int subArrHigh=Integer.MIN_VALUE;

        for(int i=low; i<= high;i++){
            subArrLow=Math.min(subArrLow,nums[i]);
            subArrHigh=Math.max(subArrHigh,nums[i]);
        }

        //expand from left
        while(low > 0 && nums[low-1] > subArrLow){
            low--;
        }

        //expand from right
        while(high<nums.length-1 && nums[high+1] < subArrHigh){
            high++;
        }

        return high - low +1;



    }
    public static void main(String[] args) {

        new ShortestUnsortedContinuousSubarray().findUnsortedSubarray(new int[]{2,6,4,8,10,9,15});
    }
}
