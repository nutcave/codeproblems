import java.util.HashMap;
import java.util.Map;
import java.util.Stack;


public class ValidParantheses
{

    static Map<Character,Character> brackets= new HashMap<Character,Character>()
    {{
            put('{','}');
            put('[',']');
            put('<','>');
            put('(',')');
        }};


    public static int hasBalancedBrackets(String str)
    {

        Stack<Character> stack= new Stack<Character>();

        char[] arr=str.toCharArray();

        for(Character c : arr){



            if(isOpeningBracket(c)){
                stack.push(c);
            }else if(isClosingBracket(c)){

                if(stack.empty()){
                    return 0;
                }

                char p=stack.pop();
                if(!isClosingBracketValid(p,c)){
                    return 0;
                }

            }


        }



        return (stack.empty())? 1:-1;


        // WRITE YOUR CODE HERE
    }


    static boolean isOpeningBracket(char c){
        return brackets.containsKey(c);
    }

    static boolean isClosingBracket(char c){
        return brackets.values().contains(c);
    }

    static boolean isClosingBracketValid(char p,char c){
        return brackets.get(p).equals(c);
    }
    // METHOD SIGNATURE ENDS

    public static void main(String[] args) {
        System.out.println(ValidParantheses.hasBalancedBrackets("()(){{}"));
        System.out.println(ValidParantheses.hasBalancedBrackets("{{}}{}{}{}"));
        System.out.println(ValidParantheses.hasBalancedBrackets("{{w}}{}ee{g}{}"));
        System.out.println(ValidParantheses.hasBalancedBrackets("{{w}}{elo}{}ee{g}{}"));
        System.out.println(ValidParantheses.hasBalancedBrackets("{{w}{elo}{}ee{g}{}"));
    }
}