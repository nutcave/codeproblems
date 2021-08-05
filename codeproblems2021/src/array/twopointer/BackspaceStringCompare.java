package array.twopointer;


/**
 *
 * https://leetcode.com/problems/backspace-string-compare/
 *
 * 844. Backspace String Compare
 *
 * Given two strings S and T, return if they are equal when both are typed into empty text editors. # means a backspace character.
 *
 * Note that after backspacing an empty text, the text will continue empty.
 *
 * Example 1:
 *
 * Input: S = "ab#c", T = "ad#c"
 * Output: true
 * Explanation: Both S and T become "ac".
 * Example 2:
 *
 * Input: S = "ab##", T = "c#d#"
 * Output: true
 * Explanation: Both S and T become "".
 * Example 3:
 *
 * Input: S = "a##c", T = "#a#c"
 * Output: true
 * Explanation: Both S and T become "c".
 * Example 4:
 *
 * Input: S = "a#c", T = "b"
 * Output: false
 * Explanation: S becomes "c" while T becomes "b".
 */
public class BackspaceStringCompare {
    public boolean backspaceCompare(String S, String T) {
        int i=S.length()-1;
        int j=T.length()-1;


        while(i >= 0 || j >=0){

            int back=0;
            while(i>=0 && (S.charAt(i) == '#' || back>0)){
                if (S.charAt(i) == '#') back++; else back--;
                i--;
            }

            back=0;
            while(j>=0 && (T.charAt(j) == '#' || back>0)){
                if (T.charAt(j) == '#') back++; else back--;
                j--;
            }


            if(i >= 0 && j >= 0 && S.charAt(i) != T.charAt(j)){
                return false;
            }

            if( (i >=0) != (j>=0)){//comparing if we went out of length
                return false;
            }

            i--;
            j--;

        }

        return true;

    }


    public static void main(String[] args) {
        new BackspaceStringCompare().backspaceCompare("bbbextm", "bbb#extm");
//        new BackspaceStringCompare().backspaceCompare("ab##","c#d#");
    }
}
