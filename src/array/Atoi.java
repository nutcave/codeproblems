package array;

/**
 * Created by Nutcave on 1/15/2017.
 */
public class Atoi {

    public int atoi( String str) {

        if (str == null || str.length() < 1)
            return 0;

        // trim white spaces
        str = str.trim();

        boolean flag = false;

        // check negative or positive
        int i = 0;
        if (str.charAt(0) == '-') {
            flag = true;
            i++;
        } else if (str.charAt(0) == '+') {
            i++;
        }
        // use double to store result
        double result = 0;

        // calculate value
        while (str.length() > i && str.charAt(i) >= '0' && str.charAt(i) <= '9') {
            result = result * 10 + (str.charAt(i) - '0');
            i++;
        }

        if (flag )
            result = -result;

        // handle max and min
        if (result > Integer.MAX_VALUE)
            return Integer.MAX_VALUE;

        if (result < Integer.MIN_VALUE)
            return Integer.MIN_VALUE;

        return (int) result;

    }


    public static void main(String[] args) {
//        new array.Atoi().atoi(" -88297 248252140B12 37239U4622733246I218  9 1303   44 A83793H3G2 1674443R591 4368 7  97");
        new Atoi().atoi("5121478262 8070067M75 X199R 547 8C0A11 93I630 4P4071 029W433619 M3  5 14703818 776366059B9O43393");
    }
}
