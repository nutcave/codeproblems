package array;

/**
 *
 * Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.

 Example:

 "A man, a plan, a canal: Panama" is a palindrome.

 "race a car" is not a palindrome.

 Return 0 / 1 ( 0 for false, 1 for true ) for this problem

 * Created by Nutcave on 12/22/2016.
 */
public class isPalindrome {

    public int isPalindrome(String a) {

        char[] str=a.toLowerCase().toCharArray();

        int x=0;
        int y=str.length-1;

        while(x<y){


            x=moveToCharForward(x, str);
            y=moveToChar(y,str);


            if(x >= y)
                break;

            if(   (str[x] != str[y]) ){
                return 0;
            }
            --y;
            ++x;
        }

        return 1;


    }


    public int moveToChar(int y,char[] str){

        while(!Character.isLetter(str[y])&& !Character.isDigit(str[y]) && y > 0 ) --y;

        return y;
    }

    public int moveToCharForward(int y,char[] str){

        while(!Character.isLetter(str[y])&& !Character.isDigit(str[y]) && y < str.length -1) ++y;

        return y;
    }

}
