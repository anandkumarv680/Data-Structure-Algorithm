package dsa.stack;

import java.util.Stack;

public class PushAtBottom {
    public static void pustAtBottom(Stack<Integer> s, int data){

        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top = s.pop();
        pustAtBottom(s, data);
        s.push(top);

    }
    static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(8);
        s.push(4);
        s.push(2);
        s.push(1);
        System.out.println(s);
        pustAtBottom(s,99);
        System.out.println(s);
    }
}
