package array;

/**
 * Created by Nutcave on 12/27/2016.
 */
public class IntegerToRoman {

    public String intToRoman(int a) {
        int num =a;
        String[] dict = new String[]{"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        int[] val = new int[]{1000,900,500,400,100,90,50,40,10,9,5,4,1};
        StringBuilder ret=new StringBuilder();
        for(int i=0; i<13; i++) {
            if(num>=val[i]) {
                int count = num/val[i];
                num %= val[i];
                for(int j=0; j<count; j++) {
                    ret.append(dict[i]);
                }
            }
        }
        return ret.toString();

    }

    public static void main(String[] args) {
        System.out.println(new IntegerToRoman().intToRoman(4));
    }
}
