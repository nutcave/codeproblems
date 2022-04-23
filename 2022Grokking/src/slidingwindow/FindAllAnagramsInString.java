package slidingwindow;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
