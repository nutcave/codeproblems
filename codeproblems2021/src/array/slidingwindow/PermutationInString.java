package array.slidingwindow;

import java.util.HashSet;
import java.util.Set;

/**
 * Given two strings s1 and s2, write a function to return true if s2 contains the permutation of s1.
 * In other words, one of the first string's permutations is the substring of the second string.
 * <p>
 * Example 1:
 * <p>
 * Input: s1 = "ab" s2 = "eidbaooo"
 * Output: True
 * Explanation: s2 contains one permutation of s1 ("ba").
 * <p>
 * <p>
 * Solution:
 * How do we know string p is a permutation of string s? Easy, each character in p is in s too.
 * So we can abstract all permutation strings of s to a map (Character -> Count). i.e. abba -> {a:2, b:2}.
 * Since there are only 26 lower case letters in this problem, we can just use an array to represent the map.
 * <p>
 * <p>
 * How do we know string s2 contains a permutation of s1? We just need to create a sliding window with length of s1, move from beginning to the end of s2.
 * When a character moves in from right of the window, we subtract 1 to that character count from the map. When a character moves out from left of the window,
 * we add 1 to that character count. So once we see all zeros in the map, meaning equal numbers of every characters between s1 and the substring in the sliding window, we know the answer is true.
 */
public class PermutationInString {

    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length())
            return false;

        int[] count= new int[26];

        for(int i=0; i< s1.length();i++){
            count[s1.charAt(i) - 'a']++;
        }

        for(int i= 0; i < s2.length(); i++){
            count[s2.charAt(i) - 'a']--;

            if(i >= s1.length()){
                count[s2.charAt(i-s1.length()) - 'a']++;
            }

            if(allZeroes(count)) return true;


        }

        return false;
    }

    boolean allZeroes(int[] count){
        for(int i=0; i< count.length; i++){
            if (count[i] != 0) return false;
        }
        return true;
    }



    public static void main(String[] args) {
        System.out.println(new PermutationInString().checkInclusion("ab", "eidbaooo"));
        System.out.println(new PermutationInString().checkInclusion("a", "ab"));
    }
}
