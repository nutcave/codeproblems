package slidingwindow;



import java.util.HashMap;
import java.util.HashSet;

/**
 *
 * Given a string, find the length of the longest substring in it with no more than K distinct characters.
 *
 * Example 1:
 *
 * Input: String="araaci", K=2
 * Output: 4
 * Explanation: The longest substring with no more than '2' distinct characters is "araa".
 * Example 2:
 *
 * Input: String="araaci", K=1
 * Output: 2
 * Explanation: The longest substring with no more than '1' distinct characters is "aa".
 * Example 3:
 *
 * Input: String="cbbebi", K=3
 * Output: 5
 * Explanation: The longest substrings with no more than '3' distinct characters are "cbbeb" & "bbebi".
 *
 */
public class LengthOfLongestSubstringKDistinct {

    public int lengthOfLongestSubstringKDistinct(String s, int k) {


        int i=0;

        int res=0;
        HashSet<Character> set = new HashSet<>();
        for (int j = 0; j < s.length(); j++) {

            set.add(s.charAt(j));

            while(set.size() > k){
                set.remove(s.charAt(i));
                i++;
                set.add(s.charAt(i));
            }

            res= Math.max(res,j -i +1);

        }

        System.out.println(res);
        return res;
    }


    public static void main(String[] args) {

        int res = new LengthOfLongestSubstringKDistinct().lengthOfLongestSubstringKDistinct("araaci", 2);
        assert 4 == res;


        int res2 = new LengthOfLongestSubstringKDistinct().lengthOfLongestSubstringKDistinct("araaci", 1);
        assert 2 == res2;
        int res3 = new LengthOfLongestSubstringKDistinct().lengthOfLongestSubstringKDistinct("cbbebi", 3);
        assert 5 == res3;






    }
}
