package dsa.tree;

import java.util.ArrayList;
import java.util.Collections;

public class MergeBST {
    public static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static void inorder(Node root, ArrayList<Integer> arr){
        if(root == null){
            return;
        }
        inorder(root.left, arr);
        arr.add(root.data);
        inorder(root.right,arr);
    }
    public static Node createBST(ArrayList<Integer> arr, int st, int end){
        if(st > end){
            return null;
        }

        int mid = (st + end) / 2;
        Node root = new Node(arr.get(mid));
        root.left = createBST(arr, st, mid - 1);
        root.right = createBST(arr, mid + 1, end);

        return root;
    }

    public static Node mergeBST(Node root1, Node root2){
        ArrayList<Integer> arr = new ArrayList<>();
        inorder(root1, arr);
        inorder(root2, arr);
        Collections.sort(arr);
        return createBST(arr, 0, arr.size() - 1);
    }

    public static void preOrder(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    static void main(String[] args) {
        Node root1 = new Node(2);
        root1.left = new Node(1);
        root1.right = new Node(4);

/*
       9
      / \
     3   12 BST2
*/

        Node root2 = new Node(9);
        root2.left = new Node(3);
        root2.right = new Node(12);

        Node root = mergeBST(root1,root2);

        preOrder(root);
    }
}
