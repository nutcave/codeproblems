import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Nutcave on 1/30/2017.
 */
public class RemoveDupSortedArray {



    public int removeDuplicates(ArrayList<Integer> a) {

        if (a.size()  < 2)
            return a.size();

        int index = 0;
        int i = 1;

        while (i < a.size()) {
            Integer integer = a.get(index);
            Integer integer1 = a.get(i);
            if (integer1 != integer) {
                index++;
                a.set(index, integer1);

            }
            i++;
        }

        return index+1;
    }

    public static void main(String[] args) {
        ArrayList a = new ArrayList() {{
            add(1);
            add(2);
            add(2);
        }};
        int i = new RemoveDupSortedArray().removeDuplicates(a);
        System.out.println(a);
        System.out.println(i);
    }
}
