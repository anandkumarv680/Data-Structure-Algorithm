package dsa.stack;

import java.util.Stack;

public class ReverseString {
    public static String reverseString(String str){
        Stack<Character> s = new Stack<>();
        StringBuilder sb = new StringBuilder("");

        int idx = 0;
        while(idx < str.length()){
            char curr = str.charAt(idx);
            s.push(curr);
            idx++;
        }
        while(!s.isEmpty()){
            sb.append(s.pop());
        }
        return sb.toString();
    }
    static void main(String[] args) {
        String str = "siuuuu";
        System.out.println(str);
        System.out.println(reverseString(str));
    }
}
