package array;

/**
 * Created by Nutcave on 1/13/2017.
 */
public class StrStr {



    public int strStr(final String haystack, final String needle) {

        int res=-1;
        int hayLen=haystack.length();

        for(int i=0; i<hayLen ; ++i){

            int y=0;
            int tempI=i;
            while( y<needle.length() && tempI<hayLen){

                if(needle.charAt(y) != haystack.charAt(tempI)){
                    break;
                }

                y++;
                tempI++;

            }

            if(y == needle.length() ){
                return i;
            }


        }

        return res;
    }

    public static void main(String[] args) {

        String bbabc = "bbabc";
        System.out.println(new StrStr().strStr(bbabc, "abc"));
        System.out.println(bbabc.substring(2,bbabc.length()-1));



    }

}
