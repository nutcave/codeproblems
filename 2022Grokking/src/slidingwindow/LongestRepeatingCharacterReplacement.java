package slidingwindow;

import java.util.HashMap;
import java.util.Map;

/**
 * 424. Longest Repeating Character Replacement
 *
 * https://leetcode.com/problems/longest-repeating-character-replacement/
 * Given a string with lowercase letters only,
 * if you are allowed to replace no more than ‘k’ letters with any letter, find the length of the longest substring having the same letters after replacement.
 *
 * Example 1:
 *
 * Input: s = "ABAB", k = 2
 * Output: 4
 * Explanation: Replace the two 'A's with two 'B's or vice versa.
 * Example 2:
 *
 * Input: s = "AABABBA", k = 1
 * Output: 4
 * Explanation: Replace the one 'A' in the middle with 'B' and form "AABBBBA".
 * The substring "BBBB" has the longest repeating letters, which is 4.
 */
public class LongestRepeatingCharacterReplacement {

    public int characterReplacement(String s, int k) {

        Map<Character,Integer> m=new HashMap<Character,Integer>();
        int res=0;
        int maxRepeatedCharacter=0;
        int i=0;
        for(int j=0; j<s.length();j++){

            char key=s.charAt(j);
            int count= m.getOrDefault(key,0) +1;
            m.put(key,count);

            maxRepeatedCharacter= Math.max(maxRepeatedCharacter,count);

            if( j - i +1 - maxRepeatedCharacter > k ){
                m.put(s.charAt(i), m.get(s.charAt(i))-1);
                i++;
            }

            res=Math.max(res,j-i+1);

        }

        return res;

    }

    public static void main(String[] args) {
//        new LongestRepeatingCharacterReplacement().characterReplacement("ABCBBBB",2);
        new LongestRepeatingCharacterReplacement().characterReplacement("AABABBA",2);
    }
}
