package array;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Nutcave on 12/26/2016.
 */
public class RomanToInteger {
    public int romanToInt(String a) {

        int res=0;
        Map<String,Integer> m = new HashMap<String,Integer>(){{
            put("I",1);
            put("IV",4);
            put("V",5);
            put("VI",6);
            put("VII",7);
            put("VIII",8);
            put("IX",9);
            put("X",10);
            put("L",50);
            put("C",100);
            put("D",500);
            put("M",1000);
        }};

        int prev=0;

        int cur=0;

        for(int i=a.length() -1 ; -1<i; --i){

            String c = a.substring(i,i+1);

            cur =m.get(c);

            if(cur>=prev){
                res+=cur;
                prev=cur;
            }else{
                res-=cur;
            }
        }


        return res;

    }

    public static void main(String[] args) {
        System.out.println(new RomanToInteger().romanToInt("MDCCCIV"));
    }

}
