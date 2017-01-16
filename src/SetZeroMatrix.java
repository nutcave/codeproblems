import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Nutcave on 1/14/2017.
 */
public class SetZeroMatrix {

    public void setZeroes(ArrayList<ArrayList<Integer>> a) {

        Set<Integer> rowZero= new HashSet<>();
        Set<Integer> colZero=new HashSet<>();

        for(int i =0 ; i< a.size(); i++){

            ArrayList<Integer> row=a.get(i);
            for(int y =0 ; y< row.size(); y++){

                int v=row.get(y);
                if(v == 0){
                    rowZero.add(i);
                    colZero.add(y);
                }
            }

        }


        for(int i =0 ; i< a.size(); i++){

            ArrayList<Integer> row=a.get(i);
            for(int y =0 ; y< row.size(); y++){

                if(rowZero.contains(i)){
                    row.set(y,0);
                }

                if(colZero.contains(y)){
                    row.set(y,0);
                }
            }

        }


    }

}
