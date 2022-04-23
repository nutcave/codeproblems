package slidingwindow;

import java.util.HashMap;
import java.util.Map;

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
        new LongestRepeatingCharacterReplacement().characterReplacement("ABCBBBB",2);
    }
}
