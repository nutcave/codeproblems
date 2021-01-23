package array.slidingwindow;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * 3_Longest_Substring_Without_Repeating_Characters
 *
 * Given a string s, find the length of the longest substring without repeating characters.
 *
 *
 *
 * Example 1:
 *
 * Input: s = "abcabcbb"
 * Output: 3
 * Explanation: The answer is "abc", with the length of 3.
 * Example 2:
 *
 * Input: s = "bbbbb"
 * Output: 1
 * Explanation: The answer is "b", with the length of 1.
 * Example 3:
 *
 * Input: s = "pwwkew"
 * Output: 3
 * Explanation: The answer is "wke", with the length of 3.
 * Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
 * Example 4:
 *
 * Input: s = ""
 * Output: 0
 *
 *
 */
public class LongestSubstringWithoutRepeatingCharacters {

    public  static int lengthOfLongestSubstring(String s) {
        char[] arr= s.toCharArray();
        int longest=0,j=0;
        Map<Character, Integer> map = new HashMap<>();


        for (int i = 0; i < arr.length; i++) {
            char c=arr[i];
            if(map.containsKey(c)){
                j=Math.max(j,map.get(c) + 1);
            }

            longest = Math.max(longest, i-j+1);
            map.put(c,i);
        }

        return longest;

    }

    public static void main(String[] args) {
        lengthOfLongestSubstring(" ");

    }
}
