package slidingwindow;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * https://leetcode.com/problems/find-all-anagrams-in-a-string/
 *
 * 438. Find All Anagrams in a String
 * Given two strings s and p, return an array of all the start indices of p's anagrams in s. You may return the answer in any order.
 *
 * An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.
 *
 *
 *
 * Example 1:
 *
 * Input: s = "cbaebabacd", p = "abc"
 * Output: [0,6]
 * Explanation:
 * The substring with start index = 0 is "cba", which is an anagram of "abc".
 * The substring with start index = 6 is "bac", which is an anagram of "abc".
 * Example 2:
 *
 * Input: s = "abab", p = "ab"
 * Output: [0,1,2]
 * Explanation:
 * The substring with start index = 0 is "ab", which is an anagram of "ab".
 * The substring with start index = 1 is "ba", which is an anagram of "ab".
 * The substring with start index = 2 is "ab", which is an anagram of "ab".
 */
public class FindAllAnagramsInString {

        public List<Integer> findAnagrams(String s, String p) {

            Map<Character,Integer> map= new HashMap<>();

            for(int i=0; i<p.length();i++){
                char c=p.charAt(i);
                map.put(c,map.getOrDefault(c,0)+1);
            }

            int i=0;
            int matched=0;
            List<Integer> ls= new ArrayList<>();
            for(int j=0; j<s.length(); j++){

                char rc=s.charAt(j);

                if(map.containsKey(rc)){
                    int res=map.get(rc)-1;

                    if(res==0){
                        matched++;
                    }

                    map.put(rc,res);
                }

                if(matched == map.size()){
                    ls.add(i);
                }

                if(j>= p.length()-1){
                    char lc=s.charAt(i);

                    if(map.containsKey(lc)){
                        int res=map.get(lc);

                        if(res==0){
                            matched--;
                        }

                        map.put(lc,res+1);
                    }
                    i++;
                }
            }

            return ls;

        }


}
