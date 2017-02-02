import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by Nutcave on 1/25/2017.
 */
public class ThreeSumClosest {

    public int threeSumClosest(ArrayList<Integer> a, int b) {

        int minDiff=Integer.MAX_VALUE;
        int res=0;

        Collections.sort(a);
        for(int i=0; i< a.size(); i++){

            int j=i+1;
            int z=a.size()-1;

            for(;j<z;){

                int sum=a.get(i) + a.get(j) + a.get(z);

                int diff = Math.abs(sum - b);

                if(diff == 0) return sum;

                if(diff < minDiff){
                    minDiff=diff;
                    res=sum;
                }

                if(sum < b){
                    j++;
                }else{
                    z--;
                }


            }

        }

        return res;
    }
    public static void main(String[] args) {
        int i = new ThreeSumClosest().threeSumClosest(new ArrayList<Integer>() {{
            add(2);
            add(1);
            add(-9);
            add(-7);
            add(-8);
            add(2);
            add(-8);
            add(2);
            add(3);
            add(-8);
        }}, -1);

        System.out.println(i);
    }

}
