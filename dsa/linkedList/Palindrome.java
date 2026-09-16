package dsa.linkedList;

public class Palindrome {

    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;

    public static Node mid(Node head){
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static boolean isPalindromme(Node head){

        // find mid
        Node mid = mid(head);


        // reverse 2nd half
        Node curr = mid;
        Node prev = null;
        Node n;

        while(curr != null){
            n = curr.next;
            curr.next = prev;
            prev = curr;
            curr = n;
        }

        // check 1st nd 2nd half
        Node right = prev;
        Node left = head;

        while(right != null){
            if(right.data != left.data){
                return false;
            }
            right = right.next;
            left = left.next;
        }
        return true;
    }

    static void main(String[] args) {
        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(2);
        head.next.next.next = new Node(1);
        System.out.println(isPalindromme(head));
    }
}
