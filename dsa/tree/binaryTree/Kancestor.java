package dsa.tree.binaryTree;

import java.util.ArrayList;

public class Kancestor {
    public static class Node {
        int data;

        public Node(int data) {
            this.data = data;
            this.right = null;
            this.left = null;
        }

        Node right;
        Node left;
    }
    public static int kancestor(Node root, int n, int k){
        if(root == null){
            return - 1;
        }
        if(root.data == n){
            return 0;
        }

        int left = kancestor(root.left, n, k);
        int right = kancestor(root.right, n, k);

        if(left == -1 && right == -1){
            return -1;
        }
        int max = Math.max(left,right);
        if(max + 1 == k){
            System.out.println("ancestor is : " + root.data);
        }
        return root.data;
    }


    public static void main(String[] args) {

        Node root = new Node(1);

        root.left = new Node(2);
        root.right = new Node(3);

        root.left.left = new Node(4);
        root.left.right = new Node(5);

        root.right.left = new Node(6);
        root.right.right = new Node(7);

        System.out.println(kancestor(root, 7,1));
    }
}
