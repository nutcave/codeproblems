package twopointer;

/**
 * https://leetcode.com/problems/backspace-string-compare/
 *
 * Given two strings s and t, return true if they are equal when both are typed into empty text editors. '#' means a backspace character.
 *
 * Note that after backspacing an empty text, the text will continue empty.
 *
 * Example 1:
 *
 * Input: s = "ab#c", t = "ad#c"
 * Output: true
 * Explanation: Both s and t become "ac".
 * Example 2:
 *
 * Input: s = "ab##", t = "c#d#"
 * Output: true
 * Explanation: Both s and t become "".
 * Example 3:
 *
 * Input: s = "a#c", t = "b"
 * Output: false
 * Explanation: s becomes "c" while t becomes "b".
 *
 */
public class BackspaceStringCompare {

    public boolean backspaceCompare(String s, String t) {

        char[] sArr= s.toCharArray();
        char[] tArr= t.toCharArray();

        int i=sArr.length-1;
        int j=tArr.length-1;

        while( i >= 0 || j >= 0){

            i=getNextValidChar(sArr,i);
            j=getNextValidChar(tArr,j);

            if(i < 0  && j <0){
                return true;
            }

            if(i < 0  || j <0){
                return false;
            }

            if( sArr[i] != tArr[j]){
                return false;
            }
            i--;
            j--;



        }

        return true;

    }

    public int getNextValidChar(char[] arr, int i){

        int backSpaceCount=0;
        while(i>=0){
            if(arr[i] == '#'){
                backSpaceCount++;
            }else if(backSpaceCount>0){
                backSpaceCount--;
            }else{
                break;
            }

            i--;
        }

        return i;
    }

    public static void main(String[] args) {
        new BackspaceStringCompare().backspaceCompare("bbbextm", "bbb#extm");



    }
}
