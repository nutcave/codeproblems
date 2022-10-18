package slidingwindow;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * https://leetcode.com/problems/longest-substring-without-repeating-characters/
 *
 * Given a string, find the length of the longest substring which has no repeating characters.
 *
 * Example 1:
 *
 * Input: String="aabccbb"
 * Output: 3
 * Explanation: The longest substring without any repeating characters is "abc".
 * Example 2:
 *
 * Input: String="abbbb"
 * Output: 2
 * Explanation: The longest substring without any repeating characters is "ab".
 * Example 3:
 *
 * Input: String="abccde"
 * Output: 3
 * Explanation: Longest substrings without any repeating characters are "abc" & "cde".
 */
public class LongestSubstringWithoutRepeatingCharacters {

    public int lengthOfLongestSubstring(String s) {
        int max=0;
        int i=0;
        Map<Character,Integer> m= new HashMap<Character,Integer>();
        for(int j=0; j< s.length(); j++){

            char key=s.charAt(j);

            if(m.containsKey(key)){

                i = Math.max(i,m.get(key)+1);
            }

            m.put(key,j);
            max = Math.max(max,j-i +1);
        }

        return max;
    }

    public static void main(String[] args) {
        new LongestSubstringWithoutRepeatingCharacters().lengthOfLongestSubstring("abba");
    }



}
