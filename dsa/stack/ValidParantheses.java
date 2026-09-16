package dsa.stack;

import java.util.Stack;

public class ValidParantheses {
    public static boolean validParantheses(String str){
        Stack<Character> s = new Stack<>();

        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);

            if( ch == '(' || ch == '{' || ch == '[' ){
                s.push(ch);
            }
            else{
                if(s.isEmpty()){
                    return false;
                }
                if(
                                (ch == ')' && s.peek() == '(') ||
                                (ch == '}' && s.peek() == '{') ||
                                (ch == ']' && s.peek() == '[')
                ){
                    s.pop();
                }
                else {
                    return false;
                }
            }
        }
        return s.isEmpty();
    }
    static void main(String[] args) {
        String str = "{({)[}]}";
        System.out.println(validParantheses(str));;
    }
}
