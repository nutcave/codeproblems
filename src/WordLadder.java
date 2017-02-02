import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created by Nutcave on 2/1/2017.
 */
public class WordLadder {


    static class Word{
        int steps;
        String w;
        public Word(String w, int steps){
            this.w=w;
            this.steps=steps;
        }

        @Override
        public String toString() {
            return "Word{" +
                    "steps=" + steps +
                    ", w='" + w + '\'' +
                    '}';
        }
    }
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {

        Queue<Word> queue= new LinkedList<Word>();

        queue.add(new Word(beginWord,1));

        wordList.add(endWord);
        while(!queue.isEmpty()){
            Word w= queue.remove();


            char[] arr=w.w.toCharArray();

            for(int i = 0 ; i< arr.length; i++){

                for( char y='a' ;  y <= 'z'; y++ ){

                    char temp=arr[i];
                    arr[i]=y;

                    String s=String.valueOf(arr);

                    if(s.equals(endWord)){
                        return w.steps + 1;
                    }

                    if( wordList.contains(s)){

                        queue.add(new Word(s,w.steps + 1));
                        wordList.remove(s);
                    }

                    arr[i]=temp;



                }
            }


        }

        return 0;

    }


    public static void main(String[] args) {
        int i = new WordLadder().ladderLength("hit", "cog", new ArrayList<String>() {{
            add("hot");
            add("dot");
            add("dog");
            add("lot");
            add("log");
        }});

        System.out.println(i);

         i = new WordLadder().ladderLength("dwg", "cog", new ArrayList<String>() {{
            add("hot");
            add("dot");
            add("dog");
            add("lot");
            add("log");
        }});

        System.out.println(i);
    }
}
