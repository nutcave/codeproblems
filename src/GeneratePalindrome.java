import java.util.ArrayList;

/**
 * Created by Nutcave on 12/24/2016.
 */
public class GeneratePalindrome {

    public ArrayList<ArrayList<String>> partition(String a) {

        ArrayList<ArrayList<String>> results= new ArrayList<ArrayList<String>>();

        partition2(results, a,  new ArrayList<String>());

        return results;
    }

    public void partition2( ArrayList<ArrayList<String>> results,String s , ArrayList<String> nowRes){

        if(s.length() == 0){
            results.add(new ArrayList<String>(nowRes));
            return;
        }

        for(int i = 1 ; i <= s.length(); ++i){
            String sub=s.substring(0,i);
            if(isPalindrome(sub)){

                nowRes.add(sub);
                partition2(results,s.substring(i,s.length()),nowRes);
                nowRes.remove(nowRes.size() -1);
            }
        }


    }

    public boolean isPalindrome(String s){
        int i=0;
        int y=s.length()-1;

        while(i<y){
            if(s.charAt(i) != s.charAt(y)){
                return false;
            }
            ++i;
            --y;
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(new GeneratePalindrome().partition("aab"));
          System.out.println(new GeneratePalindrome().partition("cccaacbcaabb"));
          System.out.println(new GeneratePalindrome().partition("efe"));

    }


}
