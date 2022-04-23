package slidingwindow;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SubstringWithConcatenationofAllWords {

    public List<Integer> findSubstring(String s, String[] words) {

        Map<String,Integer> wordMap=new HashMap<>();

        for(String w:words){
            wordMap.put(w,wordMap.getOrDefault(w,0)+1);

        }

        int wordCount=words.length;
        int wordLength=words[0].length();

        List<Integer> res=new ArrayList<>();

        for(int i=0; i<= s.length() - wordCount * wordLength; i++){
            Map<String,Integer> wordsSeen=new HashMap<>();

            for(int j=0; j<wordCount ; j++){

                int wordStart=i + j *wordLength;

                String word= s.substring(wordStart, wordStart +wordLength);

                if(!wordMap.containsKey(word)){
                    break;
                }

                wordsSeen.put(word,wordsSeen.getOrDefault(word,0)+1);

                if(wordsSeen.get(word) > wordMap.getOrDefault(word,0)){
                    break;
                }

                if(j + 1 == wordCount){
                    res.add(i);
                }
            }

        }

        return res;

    }


    public static void main(String[] args) {
        new SubstringWithConcatenationofAllWords().findSubstring(
                "wordgoodgoodgoodbestword",
                        new String[]{"word","good","best","good"});
    }
}
