package array.dynamicprog;

/**
 5. Longest Palindromic Substring
 * Given a string s, return the longest palindromic substring in s.
 *
 *
 *
 * Example 1:
 *
 * Input: s = "babad"
 * Output: "bab"
 * Note: "aba" is also a valid answer.
 * Example 2:
 *
 * Input: s = "cbbd"
 * Output: "bb"
 * Example 3:
 *
 * Input: s = "a"
 * Output: "a"
 * Example 4:
 *
 * Input: s = "ac"
 * Output: "a"
 *
 */
public class LongestPalidrome {

    public String longestPalindrome(String s) {

        char[] str=s.toCharArray();

        int longest=0;
        String palindrome=str[0]+"";
        for(int i=0; i< str.length; i++){

            for(int j=str.length-1; i<j; j--){

                int length=j-i+1 ;
                if(isPalindrome(str,i,j) && length > longest){
                    palindrome= s.substring(i,j+1);
                    longest=length;

                }
            }

        }

        return palindrome;
    }

    public boolean isPalindrome(char[] a,int i , int j){

        while(i<j){

            if(a[i] != a[j]){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    /** online solution */
    public  String longestPalindrome2(String s) {
        int n = s.length();
        String res = null;
        int palindromeStartsAt = 0, maxLen = 0;

        boolean[][] dp = new boolean[n][n];
        // dp[i][j] indicates whether substring s starting at index i and ending at j is palindrome

        for(int i = n-1; i >= 0; i--) { // keep increasing the possible palindrome string
            for(int j = i; j < n; j++) { // find the max palindrome within this window of (i,j)

                //check if substring between (i,j) is palindrome
                dp[i][j] = (s.charAt(i) == s.charAt(j)) // chars at i and j should match
                        &&
                        ( j-i < 3  // if window is less than or equal to 3, just end chars should match
                                || dp[i+1][j-1]  ); // if window is > 3, substring (i+1, j-1) should be palindrome too

                //update max palindrome string
                if(dp[i][j] && (j-i+1 > maxLen)) {
                    palindromeStartsAt = i;
                    maxLen = j-i+1;
                }
            }
        }
        return s.substring(palindromeStartsAt, palindromeStartsAt+maxLen);
    }


    public static void main(String[] args) {
        new LongestPalidrome().longestPalindrome2("cbbd");
    }
}
