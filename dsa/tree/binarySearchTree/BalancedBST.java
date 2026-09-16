package dsa.tree.binarySearchTree;

import java.util.ArrayList;

public class BalancedBST {
    public static class Node{
        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }

        int data;
        Node left;
        Node right;
    }
    public static void preOrder(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void getInorder(Node root, ArrayList<Integer> arr){
        if(root == null){
            return;
        }
        getInorder(root.left,arr);
        arr.add(root.data);
        getInorder(root.right,arr);
    }

    public static Node createBST(ArrayList<Integer> arr, int st, int end){
        if(st > end){
            return null;
        }

        int mid = st + (end - st)/2;

        Node root = new Node(arr.get(mid));
        root.left = createBST(arr,st, mid - 1);
        root.right = createBST(arr,mid + 1, end);

        return root;
        
    }
    public static Node balanceBST(Node root){
        ArrayList<Integer> arr = new ArrayList<>();

        getInorder(root,arr);

        root = createBST(arr, 0, arr.size() -1);

        return root;
    }

    public static void main(String args[]) {

    /*
             8
           /   \
          6     10
         /       \
        5         11
       /           \
      3             12

       given BST
    */

        Node root = new Node(8);

        root.left = new Node(6);
        root.left.left = new Node(5);
        root.left.left.left = new Node(3);

        root.right = new Node(10);
        root.right.right = new Node(11);
        root.right.right.right = new Node(12);

        root = balanceBST(root);

        preOrder(root);
    }
}
