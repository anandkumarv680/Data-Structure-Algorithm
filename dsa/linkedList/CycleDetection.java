package dsa.linkedList;

public class CycleDetection {

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;

    // Remove Cycle
    public static void floyd(Node fast) {
        Node slow = head;
        Node prev = null;

        // Find starting point of cycle
        while (slow != fast) {
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }

        // Break the cycle
        prev.next = null;
    }

    public static boolean isCycle(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                floyd(fast);   // Remove cycle
                return true;   // Cycle found
            }
        }

        return false; // No cycle
    }

    public static void main(String[] args) {

        head = new Node(9);
        head.next = new Node(8);
        head.next.next = new Node(7);
        head.next.next.next = new Node(6);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(4);
        head.next.next.next.next.next.next = new Node(3);

        // Create cycle (3 -> 7)
        head.next.next.next.next.next.next.next = head.next.next;

        System.out.println(isCycle(head)); // true

        // Check again after removing cycle
        System.out.println(isCycle(head)); // false
    }
}


// Cycle starts from head
//    if (slow == fast) {
//        while (fast.next != slow) {
//fast = fast.next;
//        }
//fast.next = null;
//        return;
//        }