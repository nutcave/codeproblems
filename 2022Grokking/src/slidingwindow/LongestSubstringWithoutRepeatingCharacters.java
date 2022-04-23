package slidingwindow;

import java.util.HashMap;
import java.util.Map;

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
