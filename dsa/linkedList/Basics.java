package dsa.linkedList;

public class Basics {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;

    public void addFirst(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }
    public void addLast(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        tail = newNode;
    }

    public void add(int data, int idx){
        Node newNode = new Node(data);
        Node temp = head;
        int i = 0;
        while(i < idx - 1 && temp != null){
            temp = temp.next;
            i++;
            newNode.next = temp.next;
            temp.next = newNode;
        }
    }
    public void print(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
    }

    // size count
    // remove first
    // remove last
    // search element || recursion method also
    // reverse linked list
    // find nd remove nth node from linked list
    // ek baar in sbki video dekh lena bhai ese kaam nhi chalega kuch naya hi seekhne ko milega
    static void main(String[] args) {
        Basics ll = new Basics();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(5);
        ll.addLast(4);
        ll.add(99,0);
        ll.addFirst(99);
        ll.print(head);
    }
}
