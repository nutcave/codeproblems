package slidingwindow;

import java.util.HashMap;
import java.util.Map;

public class PermutationInString {


    public static void main(String[] args) {


        new PermutationInString().checkInclusion("abcdxabcde","abcdeabcdx");
    }
    public boolean checkInclusion(String s1, String s2) {

        Map<Character,Integer> map= new HashMap<>();

        for(int i=0; i< s1.length();i++){
            char c=s1.charAt(i);
            map.put(c, map.getOrDefault(c,0) + 1);
        }

        int i=0;
        int matched=0;
        for(int j=0; j< s2.length(); j++){

            char c=s2.charAt(j);

            if(map.get(c) != null){
                int res=map.get(c) -1;

                if(res == 0){
                    matched++;
                }

                map.put(c,res);
            }

            if(matched == map.size()){
                return true;
            }

            if(j>= s1.length()-1){
                char lc=s2.charAt(i);
                if(map.get(lc) != null){
                    int res=map.get(lc);
                    if(res == 0){
                        matched--;
                    }
                    map.put(lc,res+1);
                }

                i++;
            }

        }

        return false;

    }



}
