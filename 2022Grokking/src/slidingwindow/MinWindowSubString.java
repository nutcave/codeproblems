package slidingwindow;

import java.util.HashMap;
import java.util.Map;

/**
 * 76. Minimum Window Substring
 *
 * Example 1:
 *
 * Input: s = "ADOBECODEBANC", t = "ABC"
 * Output: "BANC"
 * Explanation: The minimum window substring "BANC" includes 'A', 'B', and 'C' from string t.
 * Example 2:
 *
 * Input: s = "a", t = "a"
 * Output: "a"
 * Explanation: The entire string s is the minimum window.
 * Example 3:
 *
 * Input: s = "a", t = "aa"
 * Output: ""
 * Explanation: Both 'a's from t must be included in the window.
 * Since the largest window of s only has one 'a', return empty string.
 */
public class MinWindowSubString {

    public String minWindow(String s, String pattern) {

        Map<Character,Integer> map = new HashMap<>();
        for(int i=0; i < pattern.length(); i++){
            map.put(pattern.charAt(i), map.getOrDefault(pattern.charAt(i),0)+1);
        }

        int matched=0;
        int resStart=0;
        int minLength=s.length()+1;

        int i=0;
        for(int j=0; j<s.length(); j++){

            char rightC=s.charAt(j);

            if(map.containsKey(rightC)){

                int res=map.get(rightC)-1;

                if(res >= 0){
                    matched++;
                }

                map.put(rightC,res);
            }

            while( matched == pattern.length()){

                if(j - i +1 < minLength){
                    minLength= j - i +1;
                    resStart=i;
                }

                char charL=s.charAt(i++);

                if(map.containsKey(charL)){

                    int res= map.get(charL);

                    if(res ==0){
                        matched--;
                    }
                    map.put(charL,res+1);

                }
            }
        }

        return minLength > s.length() ? "" : s.substring(resStart, resStart+minLength);
    }

    public static void main(String[] args) {
        new MinWindowSubString().minWindow("ADOBECODEBANC", "ABC");
        new MinWindowSubString().minWindow("a", "aa");
    }

}
