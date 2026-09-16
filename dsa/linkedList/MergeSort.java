package dsa.linkedList;

public class MergeSort {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    static Node head;

    public static Node getMid(Node head){
        Node slow = head;
        Node fast = head.next;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static Node merge(Node lHead, Node rHead){
        Node mergedll = new Node(-1);
        Node temp = mergedll;
        while(lHead != null && rHead != null){
            if(lHead.data <= rHead.data){
                temp.next = lHead;
                lHead = lHead.next;
                temp = temp.next;
            }
            else{
                temp.next = rHead;
                rHead = rHead.next;
                temp = temp.next;
            }
        }

        if(lHead == null){
            temp.next = rHead;
        }else{
            temp.next = lHead;
        }
        return mergedll.next;
    }

    public static Node mergeSort(Node head) {

        if(head == null || head.next == null){
            return head;
        }

        //find mid
        Node mid = getMid(head);

        // left nd right head
        Node rHead = mid.next;
        mid.next = null;

        Node newLeft = mergeSort(head);
        Node newRight =  mergeSort(rHead);

        // merge
        return merge(newLeft, newRight);
    }

    public static void print(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        head = new Node(5);
        head.next = new Node(4);
        head.next.next = new Node(6);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(9);
        print(head);
        head = mergeSort(head);
        print(head);
    }
}
