package linkedlist;

import java.util.*;

/**
 * Created by Nutcave on 1/19/2017.
 */
public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> m = new HashMap<>();

        for (String s : strs) {
            String k = getAnagramKey(s);

            List<String> ls = m.get(k);
            if (m.get(k) == null) {
                ls = new ArrayList<String>();


            }
            ls.add(s);
            m.put(k, ls);
        }

        return new ArrayList<>(m.values());


    }

    public String getAnagramKey(String s) {

        char[] c = s.toCharArray();

        Arrays.sort(c);

        return String.valueOf(c);
    }
}
