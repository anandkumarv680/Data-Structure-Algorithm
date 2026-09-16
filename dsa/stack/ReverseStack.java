package dsa.stack;

import java.util.Stack;

public class ReverseStack {
    public static void pushAtBottom(Stack<Integer> s, int data){

        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top = s.pop();
        pushAtBottom(s, data);
        s.push(top);

    }
    public static void reverseStack(Stack<Integer> s){
        if(s.isEmpty()){
            return;
        }
        int top = s.pop();
        reverseStack(s);
        pushAtBottom(s,top);
    }
    static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(7);
        s.push(8);
        s.push(9);
        System.out.println(s);
        reverseStack(s);
        System.out.println(s);

    }
}
