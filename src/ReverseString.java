/**
 * Created by Nutcave on 12/19/2016.
 */
public class ReverseString {

    public static void main(String[] args) {
        System.out.println(new Solution().reverseWords("fwbpudnbrozzifml osdt  ulc jsx kxorifrhubk ouhsuhf  sswz qfho dqmy  sn myq igjgip iwfcqq"));
    }

    public static class Solution {



        public String reverseWords(String a) {
            StringBuilder sb= new StringBuilder();

            char[] str= a.toCharArray();

            int start=0, end=0;
            boolean newWord=true;


            for(int i=str.length-1; i >=0 ; --i){

                if(i-1<0 || str[i]==' '){
                    newWord=true;
                    String s=a.substring(i+1,end);
                    sb.append(s);
                    sb.append(" ");


                }

//                while(str[i]==' '){
//                    start=i--;
//                }



                if(newWord){

                    end=i+1;
                    newWord=false;
                }

            }



            return sb.toString();
        }
    }


}
