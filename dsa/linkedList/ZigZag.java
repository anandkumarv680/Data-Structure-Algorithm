package dsa.linkedList;

public class ZigZag {
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
        Node fast = head.next;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        Node rHead = slow.next;
        slow.next = null;
        return rHead;
    }

    public static Node reverse(Node head){
        Node curr = head;
        Node prev = null;
        Node n;
        while( curr != null){
            n = curr.next;
            curr.next = prev;
            prev = curr;
            curr = n;
        }
        return prev;
    }

    public static Node add(Node left, Node right) {

        Node dummy = new Node(-1);
        Node temp = dummy;

        while (left != null && right != null) {

            Node nextLeft = left.next;
            Node nextRight = right.next;

            temp.next = left;
            temp = temp.next;

            temp.next = right;
            temp = temp.next;

            left = nextLeft;
            right = nextRight;
        }

        if (left != null) {
            temp.next = left;
        }

        return dummy.next;
    }

    public static Node zigZag(Node head){
        // mid nikalna hai
        Node m = mid(head);

        // rhead ko reverse krna hai
        Node rHead = reverse(m);
        Node lHead = head;

        // merge krna hai
        return add(lHead,rHead);


    }

    public static void print(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data);
            if(temp.next != null){
                System.out.print("->");
            }
            temp = temp.next;
        }
        System.out.println();
    }

    static void main(String[] args) {
        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        print(head);
        head = zigZag(head);
        print(head);
    }

}
