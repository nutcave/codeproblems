/**
 * Created by Nutcave on 12/26/2016.
 */
public class ZigZagString {

    public String convert(String a, int b) {
        if(b==1){
            return a;
        }
        String[] rows=new String[b];

        for (int i = 0; i < rows.length; i++) {
            rows[i]="";
        }

        int row=0;
        boolean goup=true;
        for(int i =0; i< a.length(); ++i){

            char c= a.charAt(i);


            rows[row]+=c;

                if (row == b - 1) {
                    goup = false;

                }
                if (row == 0) {
                    goup = true;
                }

                if (goup) {
                    row++;
                } else {
                    row--;
                }


        }

        String res="";
        for(int i =0; i< rows.length; ++i){
            res +=rows[i];

        }
        return res;
    }

    public String convert2(String s, int numRows) {
        if (numRows == 1)
            return s;

        StringBuilder sb = new StringBuilder();
        // step
        int step = 2 * numRows - 2;

        for (int i = 0; i < numRows; i++) {
            //first & last rows
            if (i == 0 || i == numRows - 1) {
                for (int j = i; j < s.length(); j = j + step) {
                    sb.append(s.charAt(j));
                }
                //middle rows
            } else {
                int j = i;
                boolean flag = true;
                int step1 = 2 * (numRows - 1 - i);
                int step2 = step - step1;

                while (j < s.length()) {
                    sb.append(s.charAt(j));
                    if (flag)
                        j = j + step1;
                    else
                        j = j + step2;
                    flag = !flag;
                }
            }
        }

        return sb.toString();
    }


    public static void main(String[] args) {
//        System.out.println(new ZigZagString().convert("b", 1));
//        System.out.println(new ZigZagString().convert("PAYPALISHIRING", 3));
        System.out.println(new ZigZagString().convert("PAYPALISHIRING", 24));
//        System.out.println(new ZigZagString().convert("kHAlbLzY8Dr4zR0eeLwvoRFg9r23Y3hEujEqdio0ctLh4jZ1izwLh70R7SAkFsXlZ8UlghCL95yezo5hBxQJ1Td6qFb3jpFrMj8pdvP6M6k7IaXkq21XhpmGNwl7tBe86eZasMW2BGhnqF6gPb1YjCTexgCurS", 1));
    }
}
