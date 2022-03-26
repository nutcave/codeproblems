package array.dynamicprog;

/**
 *
 * 1143. Longest Common Subsequence
 *
 * https://leetcode.com/problems/longest-common-subsequence/
 *
 * Given two strings text1 and text2, return the length of their longest common subsequence. If there is no common subsequence, return 0.
 *
 * A subsequence of a string is a new string generated from the original string with some characters (can be none) deleted without changing the relative order of the remaining characters.
 *
 * For example, "ace" is a subsequence of "abcde".
 * A common subsequence of two strings is a subsequence that is common to both strings.
 *
 *
 *
 * Example 1:
 *
 * Input: text1 = "abcde", text2 = "ace"
 * Output: 3
 * Explanation: The longest common subsequence is "ace" and its length is 3.
 * Example 2:
 *
 * Input: text1 = "abc", text2 = "abc"
 * Output: 3
 * Explanation: The longest common subsequence is "abc" and its length is 3.
 * Example 3:
 *
 * Input: text1 = "abc", text2 = "def"
 * Output: 0
 * Explanation: There is no such common subsequence, so the result is 0.
 *
 */
public class LongestCommonSubsequence {

    //Bruteforce
    public int longestCommonSubsequence1(String text1, String text2) {
        return helper(text1,text2,0,0);

    }

    public int helper(String text1, String text2, int i, int j){

        System.out.println(String.format("i: %s ,j: %s",i,j));
        if(i == text1.length() || j == text2.length()){
            return 0;
        }

        if(text1.charAt(i) == text2.charAt(j)){
            return 1 + helper(text1,text2, i+1,j+1);
        }else{
            return Math.max( helper(text1,text2, i+1,j),  helper(text1,text2, i,j+1));
        }
    }


    public int longestCommonSubsequence(String text1, String text2) {
        int[][] dp= new int[text1.length()+1][text2.length()+1];

        for(int i=0;i<text1.length() ; i++){
            for(int j=0; j<text2.length();j++){

                if(text1.charAt(i) == text2.charAt(j)){
                    dp[i+1][j+1]= 1 + dp[i][j];
                }else{
                    dp[i+1][j+1]=Math.max(dp[i][j+1],dp[i+1][j]);
                }
            }

        }

        return dp[text1.length()][text2.length()];

    }



    public static void main(String[] args) {
        System.out.println(new LongestCommonSubsequence().longestCommonSubsequence1("abc","def"));
    }
}
