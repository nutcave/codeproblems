package array;

/**
 * Created by Nutcave on 12/19/2016.
 */
public class ReverseString {

    public static void main(String[] args) {
        System.out.println(new Solution().reverseWords("fwbpudnbrozzifml osdt  ulc jsx kxorifrhubk ouhsuhf  sswz qfho dqmy  sn myq igjgip iwfcqq"));
    }

    public static class Solution {

        public String reverseWords(String a) {
            char[] str=a.toCharArray();

            int i=0;
            int j=0;
            while(j<str.length){
                if(str[j] == ' '){

                    reverse(str,i,j-1);
                    i=j+1;
                }
                j++;

            }

            reverse(str,i,str.length-1);
            reverse(str,0,str.length-1);
            return String.valueOf(str);


        }

        void reverse(char[] str,int i, int j){
            while(i < j){
                char tmp=str[i];
                str[i]=str[j];
                str[j]=tmp;
                --j;
                ++i;

            }
        }

    }


}
