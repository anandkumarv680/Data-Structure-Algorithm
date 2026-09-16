package dsa.stack;

import java.util.ArrayList;

public class BasicLinkedlist {
    // by using linkedlist
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static class Stack{
        public static Node head;

        public static boolean isEmpty(){
            return head == null;
        }

        public static void push(int data){

            Node newnode = new Node(data);
            if(isEmpty()){
                head = newnode;
                return;
            }
            newnode.next = head;
            head = newnode;
            return;
        }

        public static int pop(){
            if(isEmpty()){
                return -1;
            }
            int top = head.data;
            head = head.next;
            return top;
        }

        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            return head.data;
        }
    }
    static void main(String[] args) {
        BasicArraylist.Stack s = new BasicArraylist.Stack();
        s.push(5);
        s.push(11);
        s.push(3);
        s.push(0);

        while (!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}

