package dsa.stack;

import java.util.ArrayList;

public class BasicArraylist {
    // by using arraylist
    public static class Stack{
        static ArrayList<Integer> list = new ArrayList<>();

        public static boolean isEmpty(){
            return list.size() == 0;
        }

        public static void push(int data){
            list.add(data);
        }

        public static int pop(){
            if(isEmpty()){
                return -1;
            }
            int top = list.get(list.size() - 1);
            list.remove(list.size() - 1);
            return top;
        }

        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            return list.get(list.size() - 1);
        }
    }
    static void main(String[] args) {
        // if you want to make by jcf
        // Stack<Integer> s = new Stack<>();
    Stack  s = new Stack();
    s.push(5);
    s.push(9);
    s.push(3);
    s.push(2);

    while (!s.isEmpty()){
        System.out.println(s.peek());
        s.pop();
    }
    }
}
