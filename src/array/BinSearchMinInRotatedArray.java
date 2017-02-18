package array;

import java.util.List;

/**
 * Created by Nutcave on 2/17/2017.
 */
public class BinSearchMinInRotatedArray {


    public int findMin(final List<Integer> a) {


        int left=0;
        int right=a.size()-1;

        while(left<=right){

            int mid = (left + right) / 2;
            if(a.get(left) <=a.get(right)){ // its sorted, pick the smallest
                return a.get(left);
            }

            int next=(mid+1) % a.size();
            int prev=(mid-1) % a.size();

            if(a.get(next) >= a.get(mid) && a.get(prev) >= a.get(mid)){ // its the small element (pivot)
                return a.get(mid);
            }else if(a.get(mid) <= a.get(right)){ // so mid is not pivot, discard the sorted sides
                right = mid-1;
            }else if ( a.get(mid) >= a.get(left)){
                left= mid + 1;
            }
        }

        return -1;
    }
}
