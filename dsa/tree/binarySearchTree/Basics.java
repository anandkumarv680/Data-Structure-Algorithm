package dsa.tree.binarySearchTree;

import java.util.ArrayList;

public class Basics {
    public static class Node {
        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }

        int data;
        Node left;
        Node right;
    }

    public static Node insert(Node root, int val){
        if(root == null){
            return new Node(val);
        }
        if(root.data > val){
            root.left = insert(root.left, val);
        }
        else{
            root.right = insert(root.right, val);
        }
        return root;
    }

    public static boolean search(Node root, int val){
        if(root == null){
            return false;
        }
        if(root.data == val){
            return true;
        }
        if(root.data > val){
            return search(root.left, val);
        }
        else{
            return search(root.right, val);
        }
    }

    public static void inOrder(Node root){
        if(root == null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    public static Node delete(Node root, int val){
        if(root.data > val){
            root.left = delete(root.left, val);
        }
        else if(root.data < val){
            root.right = delete(root.right, val);
        }
        else{
            if(root.left == null && root.right == null){
                return null;
            }
            if(root.left == null){
                return root.right;
            }
            else if(root.right == null){
                return root.left;
            }
            Node IS = findInorderSuccessor(root.right);
            root.data = IS.data;
            root.right = delete(root.right, IS.data);
        }
        return root;
    }

    public static Node findInorderSuccessor(Node root){
        while(root.left != null){
            root = root.left;
        }
        return root;
    }

    public static void printInRange(Node root, int k1, int k2){
        if(root == null){
            return;
        }
        if(root.data >= k1 && root.data <= k2){
            printInRange(root.left, k1, k2);
            System.out.print(root.data + " ");
            printInRange(root.right, k1, k2);
        }
        else if(root.data < k1){
            printInRange(root.right, k1, k2);
        }
        else{
            printInRange(root.left, k1, k2);
        }
    }

    public static void printPath(ArrayList<Integer> path){
        for(Integer item : path){
            System.out.print(item + "->");
        }
        System.out.print("Null");
        System.out.println();
    }
    public static void printleaf2root(Node root, ArrayList<Integer> path){
        if(root == null){
            return;
        }
        path.add(root.data);

        if(root.left == null && root.right == null){
            printPath(path);
        }

        printleaf2root(root.left, path);
        printleaf2root(root.right, path);
        path.remove(path.size() - 1);
    }

    public static boolean isValidBST(Node root, Node min, Node max){
        if(root == null){
            return true;
        }
        if(min != null && root.data <= min.data){
            return false;
        }
        else if(max != null && root.data >= max.data ){
            return false;
        }
        return isValidBST(root.left, min, root) && isValidBST(root.right, root, max);
    }

    public static Node mirror(Node root){
        if(root == null){
            return null;
        }
        Node left = mirror(root.left);
        Node right = mirror(root.right);

        root.left = right;
        root.right = left;

        return root;
    }

    static void main(String[] args) {
        int[] arr = {8,5, 3, 1, 4, 6, 10, 11, 14};
        Node root = null;

        for(int i = 0; i < arr.length; i++){
            root = insert(root,arr[i]);
        }

        inOrder(root);
        System.out.println();
        printInRange(root,2,5);

        System.out.println();
        printleaf2root(root,new ArrayList<>());

        System.out.println();
        if(isValidBST(root, null,null)){
            System.out.println("Valid");
        }
        else{
            System.out.println("Invalid");
        }

        mirror(root);

        inOrder(root);
    }
}
